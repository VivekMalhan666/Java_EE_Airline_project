package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Home</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1 style=\"color: blue\"><b>Admin Page</b></h1></div>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("     <br><br><br>\n");
      out.write("     <div style=\"color: blue\" align=\"center\"><b>\n");
      out.write("     ");

		if (session != null) {
			if (session.getAttribute("FirstName") != null) {
				String name = (String) session.getAttribute("FirstName");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} 
		}
	
      out.write("\n");
      out.write("     </b></div><br><br>\n");
      out.write("     <form method=\"post\" action=\"Admin page\" name=\"f14\">\n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"blue\"><b> Show Booked flights</b><font>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog4\" class=\"Button\" value=\"Show\" onClick=\"form.action='bookedflights.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <font color=\"blue\"><b> Check Availability of Flights</b><font>\n");
      out.write("        <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog7\" class=\"Button\" value=\"Go\" onClick=\"form.action='checkAvailability.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <font color=\"blue\"><b> Manage Deals of flights</b><font>\n");
      out.write("        <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog8\" class=\"Button\" value=\"Manage\" onClick=\"form.action='dealsofflights.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <font color=\"blue\"><b> Add a flights</b><font>\n");
      out.write("        <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog9\" class=\"Button\" value=\"Add\" onClick=\"form.action='flightaddition.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <font color=\"blue\"><b> Set Prices</b><font>\n");
      out.write("        <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog10\" class=\"Button\" value=\"Set\" onClick=\"form.action='setprices.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <font color=\"blue\"><b> Set seats</b><font>\n");
      out.write("        <br>\n");
      out.write("            <input type=\"submit\" id=\"btnlog11\" class=\"Button\" value=\"Set\" onClick=\"form.action='setseats.jsp'\">\n");
      out.write("        <br><br><br>\n");
      out.write("         <font color=\"blue\"><b> LogOut</b><font>\n");
      out.write("         <br></div></form>\n");
      out.write("     <div  align=\"center\">\n");
      out.write("     <form method=\"post\" action=\"Logout\" name=\"f15\" >\n");
      out.write("        <input type=\"submit\" id=\"btnlog12\" class=\"button button5\" value=\"Log out\">\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("     </form>\n");
      out.write("     \n");
      out.write("     </div>\n");
      out.write("    \n");
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
