package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("        <title>header</title>\n");
      out.write("        <style>\n");
      out.write("            /*header*/\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    \n");
      out.write("    background-color:darkblue;\n");
      out.write("    padding : 0;\n");
      out.write("    position: absolute; \n");
      out.write("    top: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    right:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: inline-block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 30px 25px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    width: 150px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color: lightskyblue;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*footer*/\n");
      out.write("footer {\n");
      out.write("    width: 100%;\n");
      out.write("    border: 10px #333;\n");
      out.write("    background-color: darkblue;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    position: fixed;\n");
      out.write("    bottom: 0;\n");
      out.write("    right: 0;\n");
      out.write("    padding: 25px 20px;\n");
      out.write("     display: inline-block;\n");
      out.write("     \n");
      out.write("     overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("    padding: 25px 20px;\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    width: 100%;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".Button{\n");
      out.write("       \n");
      out.write("        border-radius: 2px;\n");
      out.write("        background-color:  darkblue;\n");
      out.write("        color: white;\n");
      out.write("        font-weight: bold;\n");
      out.write("        box-shadow: 1px 2px 4px 0 rgba(0, 0, 0, 0.08);\n");
      out.write("        padding: 10px 40px;\n");
      out.write("        border: 0;\n");
      out.write("        margin: auto;\n");
      out.write("        display: inline;\n");
      out.write("        cursor: pointer;\n");
      out.write("        visibility:visible;\n");
      out.write("    }  \n");
      out.write("    \n");
      out.write("    .button \n");
      out.write("    {\n");
      out.write("    background-color: darkblue; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".button5 {border-radius: 50%;}\n");
      out.write("            </style>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div> \n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("   <li style=\"list-style-type: none;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:darkblue;\t;padding: 0; margin-left: 150px\"><a href=\"main.jsp\" ><b>Home</b></a></li>\n");
      out.write("   <li><a href=\"customerfeature1.jsp\"><b>Booking</b></a></li>\n");
      out.write("   <li><a href=\"aboutus.jsp\" ><b>About Us</b></a></li>\n");
      out.write("  <li><a href=\"contact Us.jsp\" ><b>Get in touch</b></a></li>\n");
      out.write("   <li><&#97; href=\"experience.jsp\" ><b>Experience</b></a></li>\n");
      out.write("   \n");
      out.write("          </ul>\n");
      out.write("           \n");
      out.write("           </div>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "home.jsp", out, false);
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        <div>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          <div >\n");
      out.write("           <a><b> &copy; airblue 2017</b></a> \n");
      out.write("           <a  href=\"privacypolicy.jsp\"><b>Privacy Policy</b></a>\n");
      out.write("          <a href=\"terms_cond.jsp\" ><b>Terms and Conditions</b></a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<a  href=\"https://www.facebook.com/airblueprivatelimited/\" ");
      out.write(">\n");
      out.write("                            <span class=\"fa fa-facebook-official\" style=\"font-size:48px\"></span></a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<a href=\"https://twitter.com/airblueairline?lang=en\" ");
      out.write(">\n");
      out.write("                                <span class=\"fa fa-twitter-square\" style=\"font-size:48px;color:white\"></span></a>\n");
      out.write("                                \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
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
