package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listofseatsManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/r.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>List Of Seats</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("     <br><br><br><br><br>\n");
      out.write("     <form method=\"post\" action=\"Manager page\" name=\"f9\">\n");
      out.write("     \n");
      out.write("     <div align=\"center\"><h1 style=\"color: blue\"><b>Manager Page</b></h1></div>\n");
      out.write("        \n");
      out.write("     <div align=\"center\"><font color=\"blue\">List of Seats added by Admin</font>\n");
      out.write("         <br><br>\n");
      out.write("         <input type=\"submit\" id=\"btnlog\" class=\"Button\" value=\"Show\" onClick=\"form.action='bookedflightsmanager.jsp'\"/>\n");
      out.write("         <br><br><br>\n");
      out.write("        <font color=\"blue\"> List of Customers</font>\n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"submit\" id=\"btnlog2\" class=\"Button\" value=\"Show\" onClick=\"form.action='customerbooking.jsp'\"/>\n");
      out.write("         <br><br><br><br>\n");
      out.write("         <font color=\"blue\"> Logout</font>\n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"submit\" id=\"btnlog2\" class=\"button button5\" value=\"Log out\" onClick=\"form.action='header.jsp'\"/>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write("         \n");
      out.write("     </form>\n");
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
