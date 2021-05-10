package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Appn.*;;

public final class msgdisp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  Appn.MsgForm mf; 
  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("signout</title>\r\n");
      out.write("<!--mstheme--><link rel=\"stylesheet\" href=\"Img/msgdisp/blan1011.css\">\r\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"blank 1011\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><font color=\"#005CB9\" size=\"6\">Global \r\n");
      out.write("Mail</font></b><font color=\"#005CB9\">&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size=\"4\" color=\"#FF9900\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font size=\"4\" color=\"#960000\"><b>\r\n");
      out.write("</b>\r\n");
      out.write("</font><b>\r\n");
      out.write("<a href=\"inbox.jsp\" >\r\n");
      out.write("<font color=\"#960000\">back</font></a></b><font size=\"4\" color=\"#960000\"><b>&nbsp;&nbsp;</b></font><font size=\"4\" color=\"#FF9900\">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font><font color=\"#996600\"><font size=\"4\">");
      out.print(session.getAttribute("user"));
      out.write("</font></font>&nbsp; &nbsp;<font size=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <a href=\"logout.jsp\" >\r\n");
      out.write("<font color=\"#960000\">Sign out</font></a></font></p>\r\n");
      out.write("<p><b><font size=\"5\">&nbsp; &nbsp;&nbsp; </font></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
 mf=(Appn.MsgForm)session.getAttribute("msg"); 
      out.write("\r\n");
      out.write("<table border=\"1\" width=\"100%\" id=\"table1\" height=\"417\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\" height=\"40\"><b><font color=\"#959500\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; From</font></b></td>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
 String fr=mf.from; 
      out.write("\r\n");
      out.write("\t\t\t");
boolean ok=true; 
      out.write("\r\n");
      out.write("\t\t\t");
if(!(mf.sp).equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t");
fr=mf.sp; 
      out.write("\r\n");
      out.write("\t\t\t");
 ok=false; 
      out.write("\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t");
 if(ok){
      out.write("\r\n");
      out.write("\t\t\t");
 fr=fr.replace("@"+(String)application.getInitParameter("server"),"@global.com"); 
      out.write("\r\n");
      out.write("            ");
} 
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<td height=\"40\"><font color=\"#959500\">");
      out.print(fr );
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\" height=\"39\"><b><font color=\"#959500\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Subject</font></b></td>\r\n");
      out.write("\t\t<td height=\"39\"><font color=\"#959500\">");
      out.print(mf.subject);
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\"><b><font color=\"#959500\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Date</font></b></td>\r\n");
      out.write("\t\t<td><font color=\"#959500\">");
      out.print(mf.date);
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\"><b><font color=\"#959500\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Size</font></b></td>\r\n");
      out.write("\t\t<td><font color=\"#959500\">");
      out.print(mf.size);
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
String status[]={"Phising Mail","Possible of Phising","Not Phising"}; 
      out.write('\r');
      out.write('\n');
      out.write('	');
int s=0; 
      out.write('\r');
      out.write('\n');
      out.write('	');
 String domain=fr.substring(fr.lastIndexOf("@")+1,fr.lastIndexOf(".")); 
      out.write('\r');
      out.write('\n');
      out.write('	');
Appn.Analyzer ob=new Appn.Analyzer();
      out.write('\r');
      out.write('\n');
      out.write('	');
s=ob.analyze(mf.msg,(String)application.getInitParameter("server"),domain)+1;
      out.write('\r');
      out.write('\n');
      out.write('	');
mf.msg=ob.changeLink(mf.msg,(String)application.getInitParameter("server"),domain);
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\" height=\"36\"><b><font size=\"5\" color=\"#959500\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\tStatus</font></b></td>\r\n");
      out.write("\t\t<td height=\"36\"><font color=\"#959500\">");
      out.print(status[s]);
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"241\" height=\"220\"><b><font size=\"5\" color=\"#959500\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Message</font></b></td>\r\n");
      out.write("\t\t<td height=\"220\"><font color=\"#959500\">");
      out.print(mf.msg);
      out.write("</font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</p>\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\t&nbsp;</div>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
