package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Appn.*;;

public final class compose_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("signout</title>\r\n");
      out.write("<script>\r\n");
      out.write("function composeClick()\r\n");
      out.write("{\r\n");
      out.write("var to=\"\"+document.forms[0].t1.value;\r\n");
      out.write("var sub=\"\"+document.forms[0].t2.value;\r\n");
      out.write("var mes=\"\"+document.forms[0].t3.value;\r\n");
      out.write("var sp=\"\"+document.forms[0].op.value;\r\n");
      out.write("if(to==\"\"||sub==\"\"||mes==\"\")\r\n");
      out.write("alert(\"Please Enter All Fields\")\r\n");
      out.write("else if(to.lastIndexOf(\"@global.com\")==-1)\r\n");
      out.write("alert(\"Please Enter Valid ID. ex senthil@global.com\")\r\n");
      out.write("else if((sp.lastIndexOf(\"@\")==-1||sp.lastIndexOf(\".com\")==-1)&&(sp!=\"\"))\r\n");
      out.write("alert(\"Please enter valid Spoof ID.  ex skumar@idbi.com\")\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("document.forms[0].action=\"http://localhost:8080/Phising/Sendmail\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function empty()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].t1.value=\"\";\r\n");
      out.write("document.forms[0].t2.value=\"\";\r\n");
      out.write("document.forms[0].t3.value=\"\";\r\n");
      out.write("document.forms[0].op.value=\"\";\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function FP_preloadImgs() {//v1.0\r\n");
      out.write(" var d=document,a=arguments; if(!d.FP_imgs) d.FP_imgs=new Array();\r\n");
      out.write(" for(var i=0; i<a.length; i++) { d.FP_imgs[i]=new Image; d.FP_imgs[i].src=a[i]; }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function FP_swapImg() {//v1.0\r\n");
      out.write(" var doc=document,args=arguments,elm,n; doc.$imgSwaps=new Array(); for(n=2; n<args.length;\r\n");
      out.write(" n+=2) { elm=FP_getObjectByID(args[n]); if(elm) { doc.$imgSwaps[doc.$imgSwaps.length]=elm;\r\n");
      out.write(" elm.$src=elm.src; elm.src=args[n+1]; } }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function FP_getObjectByID(id,o) {//v1.0\r\n");
      out.write(" var c,el,els,f,m,n; if(!o)o=document; if(o.getElementById) el=o.getElementById(id);\r\n");
      out.write(" else if(o.layers) c=o.layers; else if(o.all) el=o.all[id]; if(el) return el;\r\n");
      out.write(" if(o.id==id || o.name==id) return o; if(o.childNodes) c=o.childNodes; if(c)\r\n");
      out.write(" for(n=0; n<c.length; n++) { el=FP_getObjectByID(id,c[n]); if(el) return el; }\r\n");
      out.write(" f=o.forms; if(f) for(n=0; n<f.length; n++) { els=f[n].elements;\r\n");
      out.write(" for(m=0; m<els.length; m++){ el=FP_getObjectByID(id,els[n]); if(el) return el; } }\r\n");
      out.write(" return null;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!--mstheme--><link rel=\"stylesheet\" href=\"Img/compose/blan1011.css\">\r\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"blank 1011\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"FP_preloadImgs(/*url*/'Img/compose/button7.jpg',/*url*/'Img/compose/button8.jpg',/*url*/'Img/compose/buttonA.jpg',/*url*/'Img/compose/buttonB.jpg')\">\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("<font size=\"4\" color=\"#FF9900\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font><font color=\"#996600\"><font size=\"4\">");
      out.print(session.getAttribute("user"));
      out.write("</font></font>&nbsp; &nbsp;<font size=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"logout.jsp\" >\r\n");
      out.write("<font color=\"#990000\">Sign out</font></a></font></p>\r\n");
      out.write("<p><b><font size=\"5\">&nbsp; </font></b></p>\r\n");
      out.write("<p><b><font size=\"5\">&nbsp;&nbsp; </font><font color=\"#005CB8\" size=\"6\">Global \r\n");
      out.write("Mail</font></b></p>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<font color=\"#FF9900\">&nbsp;&nbsp; </font><font size=\"5\"><b>\r\n");
      out.write("<font color=\"#0080C0\">&nbsp;</font><font color=\"#336699\">ComposeMail&nbsp; </font></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</font></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#990000\">&nbsp; </font> <font size=\"4\">\r\n");
      out.write("<a href=\"inbox.jsp\" ><font color=\"#990000\">InBox</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<font color=\"#996600\">&nbsp;</font><font color=\"#005CB8\">To&nbsp;</font>&nbsp; </font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;\r\n");
      out.write("<input type=\"text\" name=\"t1\" size=\"46\" style=\"border-style: solid; border-width: 1px\"></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#990000\"> </font> <a href=\"phisbox.jsp\">\r\n");
      out.write("<font size=\"4\" color=\"#990000\">PhisBox</font></a><font color=\"#990000\">&nbsp;&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<font size=\"4\" color=\"#005CB8\">Subject</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<input type=\"text\" name=\"t2\" size=\"46\" style=\"border-style: solid; border-width: 1px\"></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#990000\">&nbsp; </font> <a href=\"compose.jsp\">\r\n");
      out.write("<font size=\"4\"><font color=\"#990000\">ComposeMai</font></font><font color=\"#990000\">l</font></a><font color=\"#990000\">&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#005CB8\"> &nbsp;&nbsp;</font><font size=\"4\" color=\"#005CB8\">Spoof&nbsp;Id&nbsp; </font>\r\n");
      out.write("<font size=\"4\" color=\"#996600\">&nbsp;&nbsp; </font>\r\n");
      out.write("<input type=\"text\" name=\"op\" size=\"46\" style=\"border-style: solid; border-width: 1px\"></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;<font color=\"#005CB8\">&nbsp;</font><font size=\"4\" color=\"#005CB8\"> Message</font></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<font size=\"4\">&nbsp;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows=\"14\" name=\"t3\" cols=\"72\" style=\"border-style: solid; border-width: 1px\"></textarea>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<img border=\"0\" id=\"img3\"  onclick=\"composeClick()\" src=\"Img/compose/button6.jpg\" height=\"20\" width=\"100\" alt=\"Send\" onmouseover=\"FP_swapImg(1,0,/*id*/'img3',/*url*/'Img/compose/button7.jpg')\" onmouseout=\"FP_swapImg(0,0,/*id*/'img3',/*url*/'Img/compose/button6.jpg')\" onmousedown=\"FP_swapImg(1,0,/*id*/'img3',/*url*/'Img/compose/button8.jpg')\" onmouseup=\"FP_swapImg(0,0,/*id*/'img3',/*url*/'Img/compose/button7.jpg')\" fp-style=\"fp-btn: Embossed Capsule 1\" fp-title=\"Send\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<img border=\"0\" id=\"img4\" onclick=\"empty()\" src=\"Img/compose/button9.jpg\" height=\"20\" width=\"100\" alt=\"Clear\" onmouseover=\"FP_swapImg(1,0,/*id*/'img4',/*url*/'Img/compose/buttonA.jpg')\" onmouseout=\"FP_swapImg(0,0,/*id*/'img4',/*url*/'Img/compose/button9.jpg')\" onmousedown=\"FP_swapImg(1,0,/*id*/'img4',/*url*/'Img/compose/buttonB.jpg')\" onmouseup=\"FP_swapImg(0,0,/*id*/'img4',/*url*/'Img/compose/buttonA.jpg')\" fp-style=\"fp-btn: Embossed Capsule 1\" fp-title=\"Clear\"></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n");
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
