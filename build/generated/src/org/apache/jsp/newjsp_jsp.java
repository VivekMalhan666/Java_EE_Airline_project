package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>header</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/r.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div> \n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("   <li style=\"list-style-type: none;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;padding: 0; margin-left: 150px\"><a href=\"#home\" ><b>Home</b></a></li>\n");
      out.write("   <li><a href=\"#booking\"><b>Booking</b></a></li>\n");
      out.write("   <li><a href=\"Aboutus\" ><b>About Us</b></a></li>\n");
      out.write("  <li><a href=\"findus\" ><b>Get in touch</b></a></li>\n");
      out.write("   <li><a href=\"experience\" ><b>Experience</b></a></li>\n");
      out.write("   \n");
      out.write("          </ul>\n");
      out.write("           \n");
      out.write("           </div>\n");
      out.write("        <div>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("            <a><b>  Copyright &copy; qatarairways 2017</b></a> \n");
      out.write("           <a  href=\"privacy\"><b>Privacy Policy</b></a>\n");
      out.write("          <a href=\"conditions\" ><b>Terms and Conditions</b></a>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("        </div>\n");
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
