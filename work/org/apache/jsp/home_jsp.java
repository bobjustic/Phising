package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns=\"http://www.w3.org/TR/REC-html40\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"File-List\" href=\"home_files/filelist.xml\">\r\n");
      out.write("\r\n");
      out.write("<title>&lt;html xmlns:v=&quot;urn:schemas-microsoft-com:vml&quot; \r\n");
      out.write("xmlns:o=&quot;urn:schemas-microsoft-com:office:office&quot; \r\n");
      out.write("xmlns=&quot;http://www.w3.org/TR/REC-html40&quot;&gt; &lt;head&gt; &lt;meta http-equiv=&quot;Content-Type&quot; \r\n");
      out.write("content=&quot;text/html; charset=windows-1252&quot;&gt; &lt;link rel=&quot;File-List&quot; href=&quot;home_fil</title>\r\n");
      out.write("<!--[if !mso]>\r\n");
      out.write("<style>\r\n");
      out.write("v\\:*         { behavior: url(#default#VML) }\r\n");
      out.write("o\\:*         { behavior: url(#default#VML) }\r\n");
      out.write(".shape       { behavior: url(#default#VML) }\r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script language=javascript> \r\n");
      out.write("function signup()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"signup.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("function forget()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"forget.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("function setting()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"settings.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("function home()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"home.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("function login()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("var uname=\"\"+document.forms[0].p1.value;\r\n");
      out.write("var pwd=\"\"+document.forms[0].p2.value;\r\n");
      out.write("//uname=uname.trim();\r\n");
      out.write("//pwd=pwd.trim();\r\n");
      out.write("if(uname==\"\"||pwd==\"\")\r\n");
      out.write("alert(\"Please Enter All Fields\")\r\n");
      out.write("else if(pwd.length<8)\r\n");
      out.write("alert(\"Password must greater than 7 Letter\")\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"http://localhost:8080/Phising/Signin\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--[if gte mso 9]>\r\n");
      out.write("<xml><o:shapedefaults v:ext=\"edit\" spidmax=\"1027\"/>\r\n");
      out.write("</xml><![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"image/b2.jpg\">\r\n");
      out.write("<form method=post>\r\n");
      out.write("<div style=\"position: absolute; width: 555px; height: 42px; z-index: 5; left: 213px; top: 413px\" id=\"layer9\">\r\n");
      out.write("\t<b><i><font face=\"Palatino Linotype\" color=\"#008080\">Are&nbsp; you&nbsp; Forget&nbsp; \r\n");
      out.write("\tyou&nbsp; Password</font><font face=\"Palatino Linotype\" color=\"#008080\" size=\"4\"> </font>\r\n");
      out.write("\t<font face=\"Palatino Linotype\" color=\"#800080\">\r\n");
      out.write("\t&nbsp;<a href=\"forget.jsp\">clickhere</a></font></i></b><p>&nbsp;</div>\r\n");
      out.write("<pre>&nbsp;</pre>\r\n");
      out.write("<div style=\"position: absolute; width: 100px; height: 100px; z-index: 4; left: 39px; top: 25px\" id=\"layer7\">\r\n");
      out.write("\t<input border=\"0\" src=\"image/globe1.gif\" name=\"I5\" width=\"86\" height=\"83\" type=\"image\"><div style=\"position: absolute; width: 100px; height: 19px; z-index: 1; left: -1px; top: 35px; visibility:visible\" id=\"layer8\">\r\n");
      out.write("\t\t<b><font face=\"Bookman Old Style\" color=\"#FFFFFF\"><marquee>Global Mail</marquee></font></b></div>\r\n");
      out.write("\t<p>&nbsp;</div>\r\n");
      out.write("&nbsp;<p><!--[if gte vml 1]><v:line id=\"_x0000_s1029\"\r\n");
      out.write(" style='position:absolute;left:0;text-align:left;top:0;z-index:3' from=\"3pt,117pt\"\r\n");
      out.write(" to=\"579pt,117pt\" strokecolor=\"maroon\"/><![endif]--><![if !vml]><span\r\n");
      out.write("style='mso-ignore:vglayout;position:absolute;z-index:3;left:3px;top:155px;\r\n");
      out.write("width:770px;height:2px'><img width=770 height=2 src=\"home_files/image001.gif\"\r\n");
      out.write("v:shapes=\"_x0000_s1029\"></span><![endif]><!--[if gte vml 1]><v:line id=\"_x0000_s1028\"\r\n");
      out.write(" style='position:absolute;left:0;text-align:left;top:0;z-index:2' from=\"2.25pt,138.75pt\"\r\n");
      out.write(" to=\"580.5pt,138.75pt\" strokecolor=\"maroon\"/><![endif]--><![if !vml]><span\r\n");
      out.write("style='mso-ignore:vglayout;position:absolute;z-index:2;left:2px;top:184px;\r\n");
      out.write("width:773px;height:2px'><img width=773 height=2 src=\"home_files/image002.gif\"\r\n");
      out.write("v:shapes=\"_x0000_s1028\"></span><![endif]></p>\r\n");
      out.write("<div style=\"position: absolute; width: 100px; height: 83px; z-index: 2; left: 126px; top: 138px; visibility:visible\" id=\"layer2\">\r\n");
      out.write("<center><table cellspacing=20 id=\"table1\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=image src=\"image/1.jpg\" name=\"I1\" onclick=\"home()\">\r\n");
      out.write("<td><input type=image src=\"image/2.jpg\" name=\"I2\" onclick=\"setting()\">\r\n");
      out.write("<td><input type=image src=\"image/3.jpg\" name=\"I3\" onclick=\"forget()\">\r\n");
      out.write("<td><input type=image src=\"image/4.jpg\" name=\"I4\" onclick=\"signup()\">\r\n");
      out.write("</tr></table></center>\r\n");
      out.write("\t<p>&nbsp;</div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td>\t<img src=\"image/log.gif\">\r\n");
      out.write("<td>\r\n");
      out.write("<pre>\r\n");
      out.write("&nbsp;</pre>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p><!--[if gte vml 1]><v:line id=\"_x0000_s1027\"\r\n");
      out.write(" style='position:absolute;left:0;text-align:left;top:0;z-index:2' from=\"2.25pt,306pt\"\r\n");
      out.write(" to=\"580.5pt,307.5pt\" strokecolor=\"maroon\"/><![endif]--><![if !vml]><span\r\n");
      out.write("style='mso-ignore:vglayout;position:absolute;z-index:2;left:2px;top:407px;\r\n");
      out.write("width:773px;height:4px'><img width=773 height=4 src=\"home_files/image003.gif\"\r\n");
      out.write("v:shapes=\"_x0000_s1027\"></span><![endif]></p>\r\n");
      out.write("<div style=\"position: absolute; width: 465px; height: 134px; z-index: 1; left: 236px; top: 29px\" id=\"layer1\">\r\n");
      out.write("\t<div style=\"position: absolute; width: 195px; height: 21px; z-index: 1; left: 164px; top: 57px\" id=\"layer5\">\r\n");
      out.write("\t\t<i><b><font color=\"#800000\" face=\"Bodoni MT\" size=\"2\">Connecting People \r\n");
      out.write("\t\tGlobally !</font></b></i></div>\r\n");
      out.write("\t<blockquote>\r\n");
      out.write("\t\t<h1 align=\"left\"><b>\r\n");
      out.write("\t\t&nbsp;<font size=\"7\" face=\"Bodoni MT\" color=\"#800080\">G</font><font size=\"7\" face=\"French Script MT\" color=\"#800080\">lobal \r\n");
      out.write("\t\tMail </font></b></h1>\r\n");
      out.write("\t\t<p align=\"left\">&nbsp;</p>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("</div>\r\n");
      out.write("<pre>\r\n");
      out.write("&nbsp;</pre>\r\n");
      out.write("<pre>\r\n");
      out.write("&nbsp;</pre>\r\n");
      out.write("<pre>\r\n");
      out.write("<font color=\"#0000FF\"><b>UserName</b></font> <input type=text name=p1>\r\n");
      out.write("\r\n");
      out.write("<font color=\"#0000FF\"><b>Password </b></font><input type=password name=p2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t   <input type=image src=\"image/login.gif\" name=b onclick=\"login()\">\r\n");
      out.write("</pre>\r\n");
      out.write("<td>\r\n");
      out.write("<blockquote>\r\n");
      out.write("\t<pre>\t</pre>\r\n");
      out.write("</blockquote>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div style=\"position: absolute; width: 174px; height: 100px; z-index: 3; left: 541px; top: 254px\" id=\"layer6\">\r\n");
      out.write("\t<b><font face=\"Palatino Linotype\" color=\"#008000\" size=\"4\"><i>Are you new \r\n");
      out.write("\tUser</i></font></b><p><!--[if gte vml 1]><v:line id=\"_x0000_s1030\"\r\n");
      out.write(" style='position:absolute;left:0;text-align:left;top:0;flip:x;z-index:3'\r\n");
      out.write(" from=\"-69pt,-52.5pt\" to=\"-17.25pt,114.75pt\" strokecolor=\"maroon\"/><![endif]--><![if !vml]><span\r\n");
      out.write("style='mso-ignore:vglayout;position:absolute;z-index:3;left:448px;top:183px;\r\n");
      out.write("width:71px;height:225px'><img width=71 height=225 src=\"home_files/image004.gif\"\r\n");
      out.write("v:shapes=\"_x0000_s1030\"></span><![endif]><font face=\"Palatino Linotype\"><b><i><u><font color=\"#800080\" size=\"5\"><a href=\"signup.jsp\">SignUp</a></font></u><font color=\"#0000FF\">\r\n");
      out.write("\t</font><font color=\"#008000\">here</font></i></b></font></p>\r\n");
      out.write("\t<p>&nbsp;&nbsp; </div>\r\n");
      out.write("</form>\r\n");
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
