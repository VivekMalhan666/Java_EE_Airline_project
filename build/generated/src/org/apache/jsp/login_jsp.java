package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            .Button{\n");
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
      out.write("    j {\n");
      out.write("    width: 250px;\n");
      out.write("    height: 280px;\n");
      out.write("    background-color: lightblue;\n");
      out.write("\n");
      out.write("    position: absolute;\n");
      out.write("    top:0;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     <br><br><br>\n");
      out.write("     \n");
      out.write("     <div align=\"center\"><h1 style=\"color: blue\"><b>Login</b></h1></div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <div align=\"center\" >\n");
      out.write("            <j>\n");
      out.write("                <br><br>\n");
      out.write("           <form method=\"post\" action=\"Login\" name=\"f17\" onsubmit=\"return(valid());\">\n");
      out.write("               \n");
      out.write("               <br><br>\n");
      out.write("               <font color=\"blue\"><b> Email</b></font>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"email\" name=\"email\" style=\"border-color: blue;\" required>\n");
      out.write("            <br><br><br>\n");
      out.write("            <font color=\"blue\"><b> Password</b></font>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" id=\"passwordid\" name=\"passwordname\" style=\"border-color: blue;\">\n");
      out.write("            <br><br><br>\n");
      out.write("            <input type=\"submit\" id=\"one1\" class=\"Button\" value=\"login\" >\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("               </form>\n");
      out.write("                </j>\n");
      out.write("            <div align=\"center\"><a href=\"sign up.jsp\">New? Sign up here &rarr;</a> </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("              \n");
      out.write("          \n");
      out.write("                \n");
      out.write("     <script>\n");
      out.write("         function valid()\n");
      out.write("        {\n");
      out.write("        if(document.f17.textname.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"empty!!\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            if(document.f17.passwordname.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"empty!!\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        if(document.f17.passwordname.value.length<7 ||document.f17.passwordname.value.length>15 )\n");
      out.write("        {\n");
      out.write("            alert(\"your password length must be between 8-14 characters\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("        </script>\n");
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
