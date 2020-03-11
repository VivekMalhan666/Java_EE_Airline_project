package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setseats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Set Prices</title>\n");
      out.write("        <style>\n");
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
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("     <br><br><br><br><br><br>\n");
      out.write("         \n");
      out.write("        <table> \n");
      out.write("            <form method=\"post\" action=\"SetSeats\" name=\"f1\" onsubmit=\"return(valid1());\">\n");
      out.write("\n");
      out.write("            <div align=\"center\"><h1 style=\"color: blue\"><b>Set/Update seats</b></h1></div> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <div align=\"center\">\n");
      out.write("                <font color=\"blue\">Flight ID</font>\n");
      out.write("                <input type=\"number\" id=\"fid2\" name=\"flightid2\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("         </div>\n");
      out.write("         <table align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Types of Seats</th>\n");
      out.write("    <th height=\"60px\" width=\"120px\">Enter Values</th>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60px\">First Class</td>\n");
      out.write("    <td height=\"60px\">\n");
      out.write("        <input type=\"number\" id=\"one\" name=\"numone\"></td>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60px\">Business</td>\n");
      out.write("    <td height=\"60px\"> <input type=\"number\" id=\"two\" name=\"numtwo\"> </td>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60px\">Economy</td>\n");
      out.write("    <td height=\"60px\"> <input type=\"number\" id=\"three\" name=\"numthree\"></td>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("          \n");
      out.write("            <br><br><br><br>\n");
      out.write("  <div align=\"center\"> <input type=\"submit\" name=\"single1\" class=\"Button\" value=\"Set\" ></div>\n");
      out.write("             \n");
      out.write("            </form>\n");
      out.write("         <br><br>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div align=\"center\"><h1 style=\"color: blue\"><b>Update seats</b></h1></div>\n");
      out.write("          <form method=\"post\" action=\"UpdateSeats\" name=\"f2\" onsubmit=\"return(valid2());\">\n");
      out.write("              <br><br><br><br><br>\n");
      out.write("         <div align=\"center\">\n");
      out.write("                <font color=\"blue\">Flight ID</font>\n");
      out.write("                <input type=\"number\" id=\"fid7\" name=\"flightid8\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <font color=\"blue\">Type </font><input list=\"typeclass7\" type=\"text\" style=\"border-color: blue;\" name=\"teight\">\n");
      out.write("<datalist id=\"typeclass7\" style=\"border-color: blue;\">\n");
      out.write("    <option value=\"First Class\"/>\n");
      out.write("    <option value=\"Business\"/>\n");
      out.write("    <option value=\"Economy\"/>\n");
      out.write("</datalist>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <font color=\"blue\">total seats</font>\n");
      out.write("              <input type=\"number\" id=\"twoo\" name=\"numtwoo\" style=\"border: 2px solid darkblue; width:80px\">  \n");
      out.write("         </div>\n");
      out.write("              <br><br><br><br>\n");
      out.write("  <div align=\"center\"> <input type=\"submit\" name=\"single2\" class=\"Button\" value=\"Update\" ></div>\n");
      out.write("         </form>\n");
      out.write("            <br><br><br><br><br><br><br>\n");
      out.write("            <script>\n");
      out.write("        function valid1()\n");
      out.write("        {\n");
      out.write("        if(document.f1.numone.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected no of seats\");\n");
      out.write("            return false;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        else if(document.f1.numtwo.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected no of seats\");\n");
      out.write("            return false;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       else if(document.f1.numthree.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected no of seats\");\n");
      out.write("           return false;\n");
      out.write("        }\n");
      out.write("        else if(document.f1.flightid2.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected id\");\n");
      out.write("           return false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var nn=document.f1.numone.value;\n");
      out.write("            var nnn=document.f1.numtwo.value;\n");
      out.write("            var nnnn=document.f1.numthree.value;\n");
      out.write("            var nnnnn=document.f1.flightid2.value;\n");
      out.write("            if(Number(nn) && Number(nnn) && Number(nnnn) && Number(nnnnn))\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("            return true;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                alert(\"Invalid\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        function valid2()\n");
      out.write("        {\n");
      out.write("            if(document.f2.teight.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected type\");\n");
      out.write("            return false;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        else if(document.f2.flightid8.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected flight id\");\n");
      out.write("            return false;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        else if(document.f2.numtwoo.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected no of seats\");\n");
      out.write("            return false;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var nn=document.f2.teight.value;\n");
      out.write("            var nnn=document.f2.flightid8.value;\n");
      out.write("            var nnnn=document.f2.numtwoo.value;\n");
      out.write("           \n");
      out.write("            if( Number(nnn) && Number(nnnn) )\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("            return true;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                alert(\"Invalid\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("                </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
