package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String s; 
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

      out.write("\r\n");
      out.write("<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns=\"http://www.w3.org/TR/REC-html40\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>New Page 1</title>\r\n");
      out.write("<script>\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var id=document.forms[0].p1.value;\r\n");
      out.write("var myindex=document.forms[0].p2.selectedIndex;\r\n");
      out.write("var quest=document.forms[0].p2.options[myindex].text;\r\n");
      out.write("var ans=document.forms[0].p3.value;\r\n");
      out.write(" if(id==\"\"||quest==\"\"||ans==\"\")\r\n");
      out.write("alert(\"Please Enter all fields\")\r\n");
      out.write("else if(id.lastIndexOf(\"@global.com\")==-1)\r\n");
      out.write("alert(\"Please Enter Valid ID. ex senthil@global.com\")\r\n");
      out.write("\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"http://localhost:8080/Phising/Forget\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("function hom()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"home.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"image/b2.jpg\">\r\n");
      out.write('\r');
      out.write('\n');

 s=(String)request.getAttribute("msg");
 
      out.write('\r');
      out.write('\n');
      out.write(' ');

  if(s==null || s=="")
  s="";
  
      out.write("  \r\n");
      out.write("<div style=\"position: absolute; width: 100px; height: 100px; z-index: 4; left: 610px; top: 13px\" id=\"layer7\">\r\n");
      out.write("\t<div style=\"position: absolute; width: 246px; height: 33px; z-index: 2; left: -286px; top: 124px\" id=\"layer10\">\r\n");
      out.write("\t\t<div style=\"position: absolute; width: 100px; height: 27px; z-index: 1; left: -324px; top: -138px\" id=\"layer11\">\r\n");
      out.write("<div style=\"position: absolute; width: 345px; height: 50px; z-index: 1; left: 247px; top: 365px\" id=\"layer12\">\r\n");
      out.write("<font face=\"Book Antiqua\" color=\"#FF0000\">\r\n");
      out.write("<b>");
      out.print(s);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</b></font></div>\r\n");
      out.write("<input type=image src=\"image/hom.gif\" onclick=\"hom()\"><br>\r\n");
      out.write("&nbsp;<p>&nbsp;</div>\r\n");
      out.write("\t\t<u><font face=\"Book Antiqua\" size=\"4\" color=\"#008000\">Forget Password</font></u></div>\r\n");
      out.write("\t<input border=\"0\" src=\"image/globe1.gif\" name=\"I5\" width=\"86\" height=\"83\" type=\"image\"><div style=\"position: absolute; width: 100px; height: 19px; z-index: 1; left: 4px; top: 34px\" id=\"layer8\">\r\n");
      out.write("\t\t<b><font face=\"French Script MT\" color=\"#00FFFF\" size=\"5\">\r\n");
      out.write("\t\t<marquee width=\"78\">Global Mail</marquee></font></b></div>\r\n");
      out.write("\t<p>&nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>\r\n");
      out.write("</p>\r\n");
      out.write("<div style=\"position: absolute; width: 465px; height: 134px; z-index: 1; left: 165px; top: 15px\" id=\"layer1\">\r\n");
      out.write("\t<div style=\"position: absolute; width: 195px; height: 21px; z-index: 1; left: 164px; top: 57px\" id=\"layer5\">\r\n");
      out.write("\t\t<i><b><font color=\"#800000\" face=\"Bodoni MT\" size=\"2\">Connecting People \r\n");
      out.write("\t\tGlobally !</font></b></i></div>\r\n");
      out.write("\t<blockquote>\r\n");
      out.write("\t\t<h1 align=\"left\"><b>\r\n");
      out.write("\t\t&nbsp;<font size=\"7\" face=\"Century Schoolbook\" color=\"#800080\">G</font><font size=\"7\" face=\"French Script MT\" color=\"#800080\">lobal \r\n");
      out.write("\t\tMail </font></b></h1>\r\n");
      out.write("\t\t<p align=\"left\">&nbsp;</p>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("</div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<blockquote>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<blockquote>\r\n");
      out.write("\t<form method=post>\t\t<blockquote>\r\n");
      out.write("\t\t\t\t<blockquote>\r\n");
      out.write("\t\t\t\t\t<blockquote>\r\n");
      out.write("\t\t\t\t\t\t<pre><br>\r\n");
      out.write("<b><font color=\"#000080\">UserName</font></b>\t   <input type=text name=p1><br>\r\n");
      out.write("<b><font color=\"#000080\">Secret Question</font>\t</b>   <select size=\"1\" name=\"p2\" style=\"font-weight: bold; border-style: solid; border-width: 1px\">\r\n");
      out.write("\t\t\t\t\t\t<option selected>Who is your favourite player?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your first phone no?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite color?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite food?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite color</option></select><br>\r\n");
      out.write("<b><font color=\"#000080\">Secret Answer</font></b>\t   <input type=text name=p3><br>&nbsp;</pre>\r\n");
      out.write("\t\t\t\t\t\t<pre>\t  \t     <input type=button onclick=\"check()\" style=\"border:0px solid #FFFFFF; background-image: url('image/find.gif')\" value=\"           \"><br>   <br>\r\n");
      out.write("  \r\n");
      out.write("\t\t     \r\n");
      out.write("</pre>\r\n");
      out.write("\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t</blockquote>\r\n");
      out.write("\t\t</blockquote>\r\n");
      out.write("\t</form>\r\n");
      out.write("</blockquote>\r\n");
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
