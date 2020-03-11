package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <style>\n");
      out.write("  input[type=text] {\n");
      out.write("    border: 2px solid blue;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}a:link {\n");
      out.write("padding : 10px;\n");
      out.write("    font-size : 25px;\n");
      out.write("    color: blue; \n");
      out.write("    background-color: transparent; \n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("   body  {\n");
      out.write("margin-top : 125px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    p{\n");
      out.write("        color : white;\n");
      out.write("            top: 424px;\n");
      out.write("            left: 69px;\n");
      out.write("            height: 4px;\n");
      out.write("            width: 1084px;\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body background=\"C:\\Users\\hp\\Desktop\\Project Images\\qwerty.jpg\" >\n");
      out.write("\n");
      out.write("<a href=\"home.html\">Home</a> | <a href=\"FeaturesCus.html\">Explore</a> | <a href=\"FirstClass.html\">First Class</a> | <a href=\"BusinessClass.html\">Business Class</a> |<a href=\"EconomyClass.html\">Economy Class</a>| <a href=\"Login.html\">Sign In</a>| <a href=\"Signup.html\">Sign Up</a>\n");
      out.write("\n");
      out.write("<h1 style =\" color :blue ; font-size : 75px ;\" >\n");
      out.write("       Register Now !!</h1>\n");
      out.write("<form action=\"sign\" method=\"post\">\n");
      out.write("<center>\n");
      out.write("       <div style =\"background-color:white;color:blue;padding:20px;margin-left:380px;margin-right:380px\">\n");
      out.write("        <br />\n");
      out.write("        First Name :<input type=\"text\" name=\"fname\">  <br /> <br />\n");
      out.write("        Last Name : <input type=\"text\" name=\"lname\"> <br /> <br />\n");
      out.write("\t\tEmail : <input type=\"text\" name=\"email\">  <br /> <br />\n");
      out.write("        Password : <input type=\"text\" name=\"pswd\"> <br /> <br />\n");
      out.write("        Again Password : <input type=\"text\" name=\"Source5\"> <br /> <br />      \n");
      out.write("    \n");
      out.write("        Contact Number : <input type=\"text\" name=\"contactno\">  <br /> <br />\n");
      out.write("        Credit Card Number : <input type=\"text\" name=\"ccno\">  <br /> <br />\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </div>\n");
      out.write("        </center>  \n");
      out.write("    </form>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function signUpValidator() {\n");
      out.write("\n");
      out.write("            var password2 = document.getElementById(\"fname\").value;\n");
      out.write("            var password1 = document.getElementById(\"lname\").value;\n");
      out.write("            var email = document.getElementById(\"email\").value;\n");
      out.write("            var email1 = document.getElementById(\"pswd\").value;\n");
      out.write("            var password11 = document.getElementById(\"Source5\").value;\n");
      out.write("            var password21 = document.getElementById(\"contactno\").value;\n");
      out.write("\n");
      out.write("            var email11 = document.getElementById(\"ccno\").value;\n");
      out.write("            // for empty fields\n");
      out.write("            if (email == \"\" || password1 == \"\"\n");
      out.write("                || password2 == \"\" || email1 == \"\" || password11 == \"\"\n");
      out.write("                || password21 == \"\" || email111 == \"\" ) {\n");
      out.write("                alert(\"Please fill all fields\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // validating email\n");
      out.write("            emailVal = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([com\\co\\.\\in])+$/;\n");
      out.write("            if (!email.match(emailVal)) {\n");
      out.write("                alert('Email Address not valid');\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // validating password\n");
      out.write("            if (email1.length < 8) {\n");
      out.write("                alert(\"Password must be at least 8 characters long\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if (email1 != password11) {\n");
      out.write("                alert(\"Passwords don't match\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
