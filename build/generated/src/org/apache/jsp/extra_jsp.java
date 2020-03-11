package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class extra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>tryyyy</title>\n");
      out.write("        <link rel='stylesheet' type='text/css' href='calendar.css'/>\n");
      out.write("        <link rel='stylesheet' type='text/css' href='http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css'/>\n");
      out.write("        <script type='text/javascript' src='script.js'></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("      <br><br><br><br><br><br>\n");
      out.write("      <div id=\"header\">\n");
      out.write("\t\t\t<h2><br/>Select a Destination</h2>\n");
      out.write("\t\t</div>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <p>Departing: <input type=\"text\" id=\"departing\"></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <p>Returning: <input type=\"text\" id=\"returning\"></p>\n");
      out.write("        </div><br/>\n");
      out.write("        <div id=\"main\">\n");
      out.write("        \t<p>Destination: <select id=\"dropdown\">\n");
      out.write("\t\t\t\t<option value=\"newyork\">New York</option>\n");
      out.write("\t\t\t\t<option value=\"london\">London</option>\n");
      out.write("\t\t\t\t<option value=\"beijing\">Beijing</option>\n");
      out.write("\t\t\t\t<option value=\"moscow\">Moscow</option>\n");
      out.write("\t\t\t</select></p>\n");
      out.write("\t\t\t<button>Submit</button>\n");
      out.write("        </div>\n");
      out.write("\n");
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
