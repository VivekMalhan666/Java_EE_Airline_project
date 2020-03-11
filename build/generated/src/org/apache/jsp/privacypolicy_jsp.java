package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class privacypolicy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>privacy policy</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1><font color=\"blue\">Privacy policy</font></h1></div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            Airblue is concerned about your right to privacy. When you visit the airblue web sites, you can be assured that any information you share with us will be treated with the utmost confidentiality and will not be disclosed to any entity outside of airblue or its Partners. \n");
      out.write("\n");
      out.write("Airblue does not sell personal information about individual members (such as name, address, Email address) to third parties. We do not sell or rent lists of members or use information about individual members outside the scope of the airblue umbrella of services. Airblue reserves the right to disclose aggregated information regarding its members and usage of the airblue umbrella of services (such as member demographics and traffic patterns) to advertisers, partners and others for various purposes.\n");
      out.write("            </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\"><h3><font color=\"blue\">IP address</font></h1></div>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            We use your IP address to help diagnose problems with our server and to administer our Web site under the Terms and Conditions of the Service Agreement. Your IP address is used to help identify you and your shopping cart, and to gather broad demographic information.\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\"><h3><font color=\"blue\">Registration</font></h1></div>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            Airblue.com membership registration requires users to give us contact information (like name, mailing address, and email address ). Airblue also uses this information for account maintenance and will advise registrants of new services and special promotional offers. Users may opt-out of receiving future mailings.\n");
      out.write("Any personal information (name, Email address, phone number) you provide will only be used to help us get back to you on your issue. We'll discard it unless you ask us to inform you of future enhancements to our Web site or services.\n");
      out.write("            </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\"><h3><font color=\"blue\">Financial Information</font></h1></div>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            Credit card information may be collected each time an order is placed for airblue travel. The information collected will include, but not be limited to name, billing address, credit card number, and expiration date. This information will be retained on the site in the secure environment covered under \"Secure\", and processed by a third party.\n");
      out.write("Your information is only accessible to you through use of your NIC# and secret password. We do not store your credit card information, only your name, address, password, travel history, BlueMiles™ history, telephone number and email.</div>\n");
      out.write("  <br><br><br><br><br><br>\n");
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
