package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Appn.*;
import java.util.*;

public final class settings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>New Page 1</title>\r\n");
      out.write("<script>\r\n");
      out.write("function hai()\r\n");
      out.write("{\r\n");
      out.write("var dn=\"\"+document.forms[0].t1.value;\r\n");
      out.write("var myindex=document.forms[0].t2.selectedIndex;\r\n");
      out.write("if(dn==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please Enter the domain name\");\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("  document.forms[0].action=\"http://localhost:8080/Phising/Domain\";\r\n");
      out.write("   document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function empty()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].t1.value=\"\";\r\n");
      out.write("myindex=document.forms[0].t2.selectedIndex=0;\r\n");
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
      out.write("\r\n");
      out.write("<!--mstheme--><link rel=\"stylesheet\" href=\"Img/settings/blan1011.css\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"blank 1011\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"FP_preloadImgs(/*url*/'Img/settings/button14.jpg',/*url*/'Img/settings/button15.jpg',/*url*/'Img/settings/button17.jpg',/*url*/'Img/settings/button18.jpg')\">\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;\r\n");
      out.write("</p>\r\n");
      out.write("<form method=\"POST\" >\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#336699\">\r\n");
      out.write("</font>\r\n");
      out.write("\t<b><font size=\"4\" color=\"#336699\">&nbsp;&nbsp;&nbsp;&nbsp; </font>\r\n");
      out.write("\t<font size=\"5\" color=\"#336699\">Settings&nbsp;&nbsp;&nbsp; </font>\r\n");
      out.write("\t<font size=\"5\" color=\"#996633\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </font>\r\n");
      out.write("</b>\r\n");
      out.write("<a href=\"home.html\"><font color=\"#990000\">back</font></a></p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0066CC\"> &nbsp; <b>DomainName</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<input type=\"text\" name=\"t1\" size=\"20\" style=\"border-style: solid; border-width: 1px\"></font></p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0066CC\"> &nbsp; <b>ListType</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t<select size=\"1\" name=\"t2\" style=\"font-weight: bold; border-style: solid; border-width: 1px\">\r\n");
      out.write("<option selected>Black List</option>\r\n");
      out.write("<option>White List</option>\r\n");
      out.write("<option>Seed List</option>\r\n");
      out.write("</select></p>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;\r\n");
      out.write("\t<img border=\"0\" id=\"img1\"  onclick=\"hai()\" src=\"Img/settings/button13.jpg\" height=\"20\" width=\"100\" alt=\"Save\" onmouseover=\"FP_swapImg(1,0,/*id*/'img1',/*url*/'Img/settings/button14.jpg')\" onmouseout=\"FP_swapImg(0,0,/*id*/'img1',/*url*/'Img/settings/button13.jpg')\" onmousedown=\"FP_swapImg(1,0,/*id*/'img1',/*url*/'Img/settings/button15.jpg')\" onmouseup=\"FP_swapImg(0,0,/*id*/'img1',/*url*/'Img/settings/button14.jpg')\" fp-style=\"fp-btn: Embossed Capsule 1\" fp-title=\"Save\">&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<img border=\"0\" id=\"img2\" onclick=\"empty()\" src=\"Img/settings/button16.jpg\" height=\"20\" width=\"100\" alt=\"Clear\" onmouseover=\"FP_swapImg(1,0,/*id*/'img2',/*url*/'Img/settings/button17.jpg')\" onmouseout=\"FP_swapImg(0,0,/*id*/'img2',/*url*/'Img/settings/button16.jpg')\" onmousedown=\"FP_swapImg(1,0,/*id*/'img2',/*url*/'Img/settings/button18.jpg')\" onmouseup=\"FP_swapImg(0,0,/*id*/'img2',/*url*/'Img/settings/button17.jpg')\" fp-style=\"fp-btn: Embossed Capsule 1\" fp-title=\"Clear\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0066CC\"> <b>\r\n");
      out.write("\t<font size=\"4\">Detail</font></b></font></p>\r\n");
      out.write("\t<p><font color=\"#996633\"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</b></font></p>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"60%\" id=\"table1\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"67\"><b><font color=\"#B75B00\" size=\"4\">NO</font></b></td>\r\n");
      out.write("\t\t\t\t<td width=\"272\"><b><font size=\"4\" color=\"#B75B00\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t&nbsp;Domain Name</font></b></td>\r\n");
      out.write("\t\t\t\t<td><b><font color=\"#B75B00\" size=\"4\">&nbsp;&nbsp; Type</font></b></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
 	Appn.Sread m=new Appn.Sread(); 
      out.write("\r\n");
      out.write("            ");
 Appn.TabForm tf=null; 
      out.write("\r\n");
      out.write("            ");
 Vector data=m.getTable((String)application.getInitParameter("server")); 
      out.write("\r\n");
      out.write("            ");
 for(int i=0;i<data.size();i++){ 
      out.write("\r\n");
      out.write("            ");
 tf=(Appn.TabForm)data.get(i); 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t\t\t<td width=\"67\"><font size=\"4\" color=\"#D96C00\">");
      out.print(tf.no);
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t<td width=\"272\"><font size=\"4\" color=\"#D96C00\">");
      out.print(tf.name);
      out.write(" </font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td><font color=\"#D96C00\" size=\"4\">");
      out.print(tf.type);
      out.write("</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
