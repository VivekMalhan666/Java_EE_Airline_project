package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ttt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.11.0/jquery-ui.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css\">\n");
      out.write("<link href=\"css/calendar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- jQuery Code executes on Date Format option ----->\n");
      out.write("<script src=\"js/script.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<h2>jQuery Datepicker UI Example Form</h2>\n");
      out.write("<div class=\"main\">\n");
      out.write("<form action=\"\" method=\"post\">\n");
      out.write("<label>Name :</label>\n");
      out.write("<input type=\"text\" name=\"sname\" id=\"Name\"/>\n");
      out.write("<label>Date Of Birth :</label>\n");
      out.write("<input type=\"text\" name=\"selected_date\" id=\"datepicker\"/>\n");
      out.write("\n");
      out.write("<input type=\"submit\" id=\"submit\" value=\"Submit\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body\n");
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
