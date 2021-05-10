import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;
import Appn.*;

public class Sendmail extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException
{
PrintWriter out = response.getWriter();

String to=request.getParameter("t1").trim();
String sub=request.getParameter("t2");
String body=request.getParameter("t3");
String spoof="";
boolean result=check(to);

if(result)
{
	Mail m=new Mail();
	HttpSession ses=request.getSession();
	boolean ack=m.send(getServletConfig().getServletContext().getInitParameter("server"),to,(String)ses.getAttribute("user"),sub,body,spoof);
	if(ack)
	{
	RequestDispatcher rq=request.getRequestDispatcher("compose.jsp");
	request.setAttribute("msg","Your Message Sent");
	rq.forward(request,response);
	}
	else
	{

		RequestDispatcher rq=request.getRequestDispatcher("compose.jsp");
		request.setAttribute("msg","The Message Sending failure");
		rq.forward(request,response);

	}

}
else
{
	RequestDispatcher rq=request.getRequestDispatcher("compose.jsp");
	request.setAttribute("msg","The receipient not exist");
	rq.forward(request,response);
}
}

public boolean check(String to)
{
	boolean exist=false;
	try
	{
		DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver() );
		Connection conn = DriverManager.getConnection( "jdbc:oracle:thin:@"+getServletConfig().getServletContext().getInitParameter("server"),"system","redhat" );
		PreparedStatement st = conn.prepareStatement("Select * from MEMBER WHERE id = '"+to+"'");
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			exist=true;
		}

		st.close();
	conn.close();

}
catch(Exception e)
{
	e.printStackTrace();
	return false;
}

return exist;
}


}