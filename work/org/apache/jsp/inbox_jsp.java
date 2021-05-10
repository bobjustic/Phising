package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Appn.*;;

public final class inbox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  Appn.MsgForm[] mf; 
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("signout</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("onload = function() {\r\n");
      out.write("    if (!document.getElementsByTagName || !document.createTextNode) return;\r\n");
      out.write("    var rows = document.getElementById('table1').getElementsByTagName('tbody')[0].getElementsByTagName('tr');\r\n");
      out.write("    for (i = 1; i < rows.length; i++) {\r\n");
      out.write("        rows[i].onclick = function() {\r\n");
      out.write("        var v=\"\"+this.rowIndex;\r\n");
      out.write("        document.forms[0].index.value=v;\r\n");
      out.write("          document.forms[0].action=\"http://localhost:8080/Phising/Msg\";\r\n");
      out.write("          document.forms[0].submit();\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--mstheme--><link rel=\"stylesheet\" href=\"Img/inbox/blan1011.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"blank 1011\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"get\">\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#970000\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font>\r\n");
      out.write("<font size=\"4\"><a href=\"settings.jsp\" >\r\n");
      out.write("<font color=\"#970000\">settings</font></a></font><font color=\"#970000\">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("<font size=\"4\" color=\"#FF9900\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font><font color=\"#996600\"><font size=\"4\">");
      out.print(session.getAttribute("user"));
      out.write("</font></font>&nbsp; &nbsp;<font size=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#970000\">\r\n");
      out.write("</font> <a href=\"logout.jsp\" >\r\n");
      out.write("<font color=\"#970000\">Sign out</font></a></font></p>\r\n");
      out.write("<p><b><font size=\"5\">&nbsp; </font></b></p>\r\n");
      out.write("<p><b><font size=\"5\">&nbsp;&nbsp; </font><font color=\"#3366CC\" size=\"6\">Global \r\n");
      out.write("Mail</font></b></p>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<font color=\"#FF9900\">&nbsp;&nbsp; </font><font size=\"5\"><b>\r\n");
      out.write("<font color=\"#0080C0\">&nbsp;Inbox <input type=hidden name=\"index\" size=\"20\">&nbsp; </font></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</p>\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\t<table border=\"1\" width=\"71%\" id=\"table1\" cellspacing=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"27\"><font color=\"#AA6600\" size=\"4\">\r\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"C1\" value=\"ON\" style=\"font-weight: 700\"></font></th>\r\n");
      out.write("\t\t\t<th width=\"271\"><b><font size=\"4\" color=\"#AA6600\">Sender</font></b></th>\r\n");
      out.write("\t\t\t<th><b><font size=\"4\" color=\"#AA6600\">Subject</font></b></th>\r\n");
      out.write("\t\t\t<th width=\"143\"><b><font size=\"4\" color=\"#AA6600\">Date</font></b></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 	Appn.Mail m=new Appn.Mail(); 
      out.write("\r\n");
      out.write("        ");
 mf=m.receive((String)application.getInitParameter("server"),(String)session.getAttribute("user"),(String)session.getAttribute("pwd")); 
      out.write("\r\n");
      out.write("\t   ");
 session.setAttribute("allmsg",mf) ; 
      out.write("\r\n");
      out.write("       ");
 for(int i=0;i<mf.length;i++){ 
      out.write("\r\n");
      out.write("        \t\t\t\t");
 String fr=mf[i].from; 
      out.write("\r\n");
      out.write("\t\t\t");
boolean ok=true; 
      out.write("\r\n");
      out.write("\t\t\t");
if(!(mf[i].sp).equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t");
fr=mf[i].sp; 
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
      out.write("\t\t\t\r\n");
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
s=ob.analyze(mf[i].msg,(String)application.getInitParameter("server"),domain)+1;
      out.write('\r');
      out.write('\n');
      out.write('	');
mf[i].msg=ob.changeLink(mf[i].msg,(String)application.getInitParameter("server"),domain);
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"27\"><font color=\"#D27E00\" size=\"3\">\r\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"C1\" value=\"ON\" style=\"font-weight: 700\"></font></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td width=\"271\"><b><font color=\"#D27E00\">");
      out.print(fr);
      out.write("</font></b></td>\r\n");
      out.write("\t\t\t<td><b><font color=\"#D27E00\">");
      out.print(mf[i].subject );
      out.write("</font></b></td>\r\n");
      out.write("\t\t\t<td width=\"143\"><b><font color=\"#D27E00\">");
      out.print(mf[i].date );
      out.write("</font></b></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t    ");
 } 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#970000\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font>\r\n");
      out.write("<a href=\"inbox.jsp\" ><font size=\"4\" color=\"#970000\">InBox</font></a><font color=\"#970000\"><font size=\"4\">&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#970000\">&nbsp;&nbsp;\r\n");
      out.write("</font> <a href=\"phisbox.jsp\">\r\n");
      out.write("<font size=\"4\" color=\"#970000\">PhisBox</font></a></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#970000\">&nbsp;&nbsp;\r\n");
      out.write("</font> <a href=\"compose.jsp\">\r\n");
      out.write("<font size=\"4\"><font color=\"#970000\">ComposeMai</font></font><font color=\"#970000\">l</font></a></p>\r\n");
      out.write("</form>\r\n");
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
