package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About us</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "for main.jsp", out, false);
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1><font color=\"blue\">About Us</font></h1></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            Airblue Limited is a private and Pakistan's second largest airline with a fastest growing share of the domestic market. Our headquarter lies in Islamabad Stock Exchange (ISE) Islamabad; however, the operational hub is Jinnah International Airport, Karachi. Airblue fleet consists of next-generation Airbus A320 & A321 wet-leased aircrafts.\n");
      out.write("\n");
      out.write("We’ve started operations on 18 June 2004 with three leased Airbus A320-200 aircraft. The airline was inaugurated by Zafarullah Khan Jamali (the Prime Minister of Pakistan then). Led by a team with decades of experience in the industry, airblue embodies a new era in passenger air travel. The company's shareholding structure includes a group of investors including Mr. Tariq Chaudhary with majority stake. Mr. Chaudhary also serves as CEO and Chairman of the Board. \n");
      out.write("\n");
      out.write("Airblue has integrated unique innovations to ensure security and affordability. Among these are complete online reservation systems, online reservation hold/in person payment at various locations, electronic document handling, and mobile airport check in procedures. We were the first airline in Pakistan to introduce e-ticketing, wireless check-in and self-check-in kiosk facilities.\n");
      out.write("\n");
      out.write("We intend to expand operations with additional aircraft to destinations in Europe, China, and the Middle East aiming to become a major player in Asia & Europe.\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
