package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class domaininfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forget</title>\r\n");
      out.write("<!--mstheme--><link rel=\"stylesheet\" href=\"Img/domaininfo/blan1011.css\">\r\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"blank 1011\">\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("function FP_swapImg() {//v1.0\r\n");
      out.write(" var doc=document,args=arguments,elm,n; doc.$imgSwaps=new Array(); for(n=2; n<args.length;\r\n");
      out.write(" n+=2) { elm=FP_getObjectByID(args[n]); if(elm) { doc.$imgSwaps[doc.$imgSwaps.length]=elm;\r\n");
      out.write(" elm.$src=elm.src; elm.src=args[n+1]; } }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function FP_preloadImgs() {//v1.0\r\n");
      out.write(" var d=document,a=arguments; if(!d.FP_imgs) d.FP_imgs=new Array();\r\n");
      out.write(" for(var i=0; i<a.length; i++) { d.FP_imgs[i]=new Image; d.FP_imgs[i].src=a[i]; }\r\n");
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
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("document.forms[0].action=\"settings.jsp\";\r\n");
      out.write("document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"FP_preloadImgs(/*url*/'Img/domaininfo/button5.jpg', /*url*/'Img/domaininfo/button6.jpg')\">\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p align=\"left\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#800000\">\r\n");
      out.write("<b>");
      out.print(request.getAttribute("msg"));
      out.write("  </b></font></p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("&nbsp;<img border=\"0\" id=\"img2\" onclick=\"check()\" src=\"Img/domaininfo/button4.jpg\" height=\"20\" width=\"100\" alt=\"Back\" onmouseover=\"FP_swapImg(1,0,/*id*/'img2',/*url*/'Img/domaininfo/button5.jpg')\" onmouseout=\"FP_swapImg(0,0,/*id*/'img2',/*url*/'Img/domaininfo/button4.jpg')\" onmousedown=\"FP_swapImg(1,0,/*id*/'img2',/*url*/'Img/domaininfo/button6.jpg')\" onmouseup=\"FP_swapImg(0,0,/*id*/'img2',/*url*/'Img/domaininfo/button5.jpg')\" fp-style=\"fp-btn: Embossed Capsule 1\" fp-title=\"Back\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("<p><br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</p>\r\n");
      out.write("</body>\r\n");
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
