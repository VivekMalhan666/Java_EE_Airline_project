package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dealsofflights_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Deals</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br><br><br>\n");
      out.write("    <div align=\"center\"><h1><font color=\"blue\">Set/Update Deals of a flight</font></h1></div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <form method=\"post\" action=\"SetDeals\" name=\"f7\" onsubmit=\"return(valid());\">\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("         <div align=\"center\">\n");
      out.write("                <font color=\"blue\">Flight ID</font>\n");
      out.write("                <input type=\"number\" id=\"fid7\" name=\"flightid7\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <font color=\"blue\">Type </font><input list=\"typeclass7\" type=\"text\" style=\"border-color: blue;\" name=\"tseven\">\n");
      out.write("<datalist id=\"typeclass7\" style=\"border-color: blue;\">\n");
      out.write("    <option value=\"First Class\"/>\n");
      out.write("    <option value=\"Business\"/>\n");
      out.write("    <option value=\"Economy\"/>\n");
      out.write("</datalist>\n");
      out.write("                &nbsp;&nbsp;&nbsp;\n");
      out.write("                <font color=\"blue\">Food Deals </font><input list=\"typeclass8\" type=\"text\" style=\"border-color: blue;\" name=\"teight\">\n");
      out.write("<datalist id=\"typeclass8\" style=\"border-color: blue;\">\n");
      out.write("    <option value=\"Deal 1\"/>\n");
      out.write("    <option value=\"Deal 2\"/>\n");
      out.write("    <option value=\"Deal 3\"/>\n");
      out.write("</datalist>\n");
      out.write("                \n");
      out.write("                &nbsp;&nbsp;&nbsp;\n");
      out.write("                <font color=\"blue\">Movies Deals </font><input list=\"typeclass9\" type=\"text\" style=\"border-color: blue;\" name=\"tnine\">\n");
      out.write("<datalist id=\"typeclass9\" style=\"border-color: blue;\">\n");
      out.write("    <option value=\"Deal 1\"/>\n");
      out.write("    <option value=\"Deal 2\"/>\n");
      out.write("    <option value=\"Deal 3\"/>\n");
      out.write("</datalist>\n");
      out.write("                <br><br><br>\n");
      out.write("                <input type=\"submit\" name=\"submi\" class=\"Button\" value=\"Select\" >\n");
      out.write("                <br><br><br>\n");
      out.write("                </div>\n");
      out.write("    </form>\n");
      out.write("    <script>\n");
      out.write("    function valid()\n");
      out.write("    {\n");
      out.write("         if(document.f7.tseven.value===\"\")\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected any type\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(document.f7.teight.value===\"\")\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected any food deal\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(document.f7.tnine.value===\"\")\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected any movie deal\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(document.f7.flightid7.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected ID\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var n=document.f7.flightid7.value;\n");
      out.write("            if(Number(n))\n");
      out.write("            {\n");
      out.write("            return true;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                alert(\"Invalid\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
