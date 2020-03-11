package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBConnection.DB;

public final class checkAvailability_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Availability</title>\n");
      out.write("    </head>\n");
      out.write("    <body><br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1 style=\"color: blue\"><b>Check Availability of Seats</b></h1></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Availability\" name=\"f3\" onsubmit=\"return(valid());\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <div align=\"center\">\n");
      out.write("                <font color=\"blue\">Flight ID</font>\n");
      out.write("                <input type=\"number\" id=\"fid3\" name=\"flightid3\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <input type=\"submit\" name=\"sub\" class=\"Button\" value=\"Select\" >\n");
      out.write("                <br><br><br>\n");
      out.write("                <font color=\"blue\"><b>First Class</b></font>\n");
      out.write("                <input type=\"text\" id=\"fc\" name=\"firstclass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstclass.availability}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border: 2px solid darkblue;\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <font color=\"blue\"><b>Business</b></font>\n");
      out.write("                <input type=\"text\" id=\"b\" name=\"business\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${buisness.availability}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border: 2px solid darkblue;\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <font color=\"blue\"><b>Economy</b></font>\n");
      out.write("                <input type=\"text\" id=\"e\" name=\"Economy\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${economy.availability}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border: 2px solid darkblue;\">\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("         function valid()\n");
      out.write("        {\n");
      out.write("        if(document.f3.flightid3.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected ID\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var n=document.f3.flightid3.value;\n");
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
      out.write("        </script>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    <\n");
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
