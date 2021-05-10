package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String co; 
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
      out.write("function che()\r\n");
      out.write("{\r\n");
      out.write("var code=document.forms[0].t1.value;\r\n");
      out.write("alert(\"Secret code : \"+code)\r\n");
      out.write("}\r\n");
      out.write("function si()\r\n");
      out.write("{\r\n");
      out.write("alert(\"hai\")\r\n");
      out.write("var name=document.forms[0].p1.value;\r\n");
      out.write("var id=document.forms[0].p2.value;\r\n");
      out.write("var pass=document.forms[0].p31.value;\r\n");
      out.write("var pass1=document.forms[0].p32.value;\r\n");
      out.write("var myindex=document.forms[0].p4.selectedIndex;\r\n");
      out.write("var quest=document.forms[0].p4.options[myindex].text;\r\n");
      out.write("var ans=document.forms[0].p5.value;\r\n");
      out.write("var scode=document.forms[0].sec.value;\r\n");
      out.write("var code=document.forms[0].t1.value;\r\n");
      out.write(" \r\n");
      out.write("if(name==\"\"||id==\"\"||pass==\"\"||pass1==\"\"||quest==\"\"||ans==\"\"||scode==\"\")\r\n");
      out.write("alert(\"Please Enter all fields\")\r\n");
      out.write("else if(pass!=pass1)\r\n");
      out.write("alert(\"Password Mismatch\")\r\n");
      out.write("else if(pass.length<8)\r\n");
      out.write("alert(\"Password must greater than 7 Letter\")\r\n");
      out.write("else if(scode!=code)\r\n");
      out.write("alert(\"Please Enter correct security code\")\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("alert(\"correct\")\r\n");
      out.write("document.forms[0].action=\"http://localhost:8080/Phising/Signup\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function hom()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"home.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"image/b2.jpg\">\r\n");
      out.write("<div style=\"position: absolute; width: 100px; height: 100px; z-index: 4; left: 610px; top: 13px\" id=\"layer7\">\r\n");
      out.write("\t<div style=\"position: absolute; width: 246px; height: 33px; z-index: 2; left: -317px; top: 104px\" id=\"layer10\">\r\n");
      out.write("\t\t<div style=\"position: absolute; width: 100px; height: 27px; z-index: 1; left: -292px; top: -118px\" id=\"layer11\">\r\n");
      out.write("<input type=image src=\"image/hom.gif\" onclick=\"hom()\"><br>\r\n");
      out.write("&nbsp;<p>&nbsp;</div>\r\n");
      out.write("\t\t<u><font face=\"Book Antiqua\" size=\"4\" color=\"#008000\">Registration Form</font></u></div>\r\n");
      out.write("\t<input border=\"0\" src=\"image/globe1.gif\" name=\"I5\" width=\"86\" height=\"83\" type=\"image\"><div style=\"position: absolute; width: 100px; height: 19px; z-index: 1; left: 4px; top: 34px\" id=\"layer8\">\r\n");
      out.write("\t\t<b><font face=\"French Script MT\" color=\"#00FFFF\" size=\"5\">\r\n");
      out.write("\t\t<marquee width=\"78\">Global Mail</marquee></font></b></div>\r\n");
      out.write("\t<p>&nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>\r\n");
      out.write('\r');
      out.write('\n');

Random r=new Random();
String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
char c=s.charAt(r.nextInt(60));
char c1=s.charAt(r.nextInt(60));
char c2=s.charAt(r.nextInt(60));
char c3=s.charAt(r.nextInt(60));
char c4=s.charAt(r.nextInt(60));
co=""+c+c1+c2+c3+c4;

      out.write("\r\n");
      out.write("<!--<marquee behavior=slide bgcolor=#FFFFCC><font size=7 color=red face=\"Arial\">");
      out.print(co);
      out.write("</font></marquee>\r\n");
      out.write("-->\r\n");
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
      out.write("\t\t\t<div style=\"position: absolute; width: 100px; height: 100px; z-index: 5; left: 56px; top: 118px\" id=\"layer9\">\r\n");
      out.write("\t\t\t\t<input border=\"0\" src=\"image/signup2.gif\" name=\"I6\" width=\"114\" height=\"145\" type=\"image\"></div>\r\n");
      out.write("\t<form method=post>\t\t<blockquote>\r\n");
      out.write("\t\t\t\t<blockquote>\r\n");
      out.write("\t\t\t\t\t<blockquote>\r\n");
      out.write("\t\t\t\t\t\t<pre><b><font color=\"#000080\">Name</font></b>\t\t   <font color=\"#008080\"><input type=text name=p1></font><br>\r\n");
      out.write("<b><font color=\"#000080\">UserName</font></b>\t   <input type=text name=p2><br>\r\n");
      out.write("<b><font color=\"#000080\">Password</font></b>\t   <input type=password name=p31><br>\r\n");
      out.write("<b><font color=\"#000080\">ReTypePassword </font></b>    <input type=password name=p32><br>\r\n");
      out.write("<b><font color=\"#000080\">Secret Question</font>\t</b>   <select size=\"1\" name=\"p4\" style=\"font-weight: bold; border-style: solid; border-width: 1px\">\r\n");
      out.write("\t\t\t\t\t\t<option selected>Who is your favourite player?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your first phone no?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite color?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite food?</option>\r\n");
      out.write("\t\t\t\t\t\t<option>What is your favourite color</option></select><br>\r\n");
      out.write("<b><font color=\"#000080\">Secret Answer</font></b>\t   <input type=text name=p5><br>\r\n");
      out.write("\t  \t   <input value=\"");
      out.print(co);
      out.write("\" style=\"border:1px solid #FFFFFF; borer: 0px solid #FFFFFF; width:144; height:46; font-family:Pristina; font-size:20pt; font-weight:bold; color:#800000; letter-spacing:1; text-align:center; background-image:url('file:///F:/eclipse-SDK-3.0.1-win32/eclipse/workspace/Phising/image/1.gif')\" tabindex=\"80\" name=\"t1\" size=\"12\" >  <input type=button value=\"Show Secret Code\" onclick=\"che()\" style=\"font-family: Book Antiqua; font-weight: bold; color: #800000; background-color: #000000; background-image: url('image/b1.jpg')\"><br>\r\n");
      out.write("<b><font color=\"#000080\">Secret Code</font></b>\t   <input type=text name=sec><br>\r\n");
      out.write("  \r\n");
      out.write("\t\t     <input type=button onclick=\"si()\" style=\"border:0px solid #FFFFFF; background-image: url('image/signup1.gif')\" value=\"                    \">\r\n");
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
