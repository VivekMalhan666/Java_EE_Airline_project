package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookedflightsmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Booked Flights M</title>\n");
      out.write("    <style>\n");
      out.write("        table, th, td {\n");
      out.write("                      border: 1px solid darkblue;\n");
      out.write("                      \n");
      out.write("                      }\n");
      out.write("                      input[type=number] {\n");
      out.write("    width:100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid darkblue;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("   </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1><font color=\"blue\">Booked Flights Approve/Disapprove</font></h1></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"bookedflightsm\" name=\"f10\" onsubmit=\"return(valid());\">\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("   <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Flight_ID</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Source</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Destination</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Departure Date</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Arrival Date</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Type</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Price</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Seats Added</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Food Deals</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Movies Deals</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <th height=\"60px\" width=\"120px\">207</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Lahore,Pakistan</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Istanbul,Turkey</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">09/10/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">11/12/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Business</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">34,000</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">50</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 1</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 1</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th height=\"60px\" width=\"120px\">207</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Lahore,Pakistan</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Istanbul,Turkey</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">09/10/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">11/12/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">First Class</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">48,000</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">50</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 2</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 2</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th height=\"60px\" width=\"120px\">207</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Lahore,Pakistan</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Istanbul,Turkey</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">09/10/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">11/12/2017</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Economy</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">27,000</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">50</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 3</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Deal 3</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("   </table>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"blue\">Flight ID</font>\n");
      out.write("                <input type=\"number\" id=\"fid8\" name=\"flightid8\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("               &nbsp;&nbsp;&nbsp; <input type=\"submit\" id=\"search\" class=\"Button\" value=\"Search\"/>\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" id=\"zero\" class=\"Button\" value=\"Approve\"/>\n");
      out.write("     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("     \n");
      out.write("   <input type=\"submit\" id=\"one\" class=\"Button\" value=\"Disapprove\" onClick=\"form.action='comment.jsp'\"/></div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("         function valid()\n");
      out.write("        {\n");
      out.write("        if(document.f10.flightid8.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected ID\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var n=document.f10.flightid8.value;\n");
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
      out.write("    </script>\n");
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
