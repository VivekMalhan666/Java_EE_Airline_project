package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Payment Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("     <br><br><br><br><br>\n");
      out.write("     \n");
      out.write("     <div align=\"center\"><h1 style=\"color: blue\"><b>Payment Page</b></h1></div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form method=\"post\" action=\"payment\" name=\"f16\" onsubmit=\"return(valid());\">\n");
      out.write("     \n");
      out.write("            <font color=\"blue\"> Enter Credit Card Number</font>\n");
      out.write("               <input type=\"number\" id=\"fid16\" name=\"flightid16\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("              <br><br><br>\n");
      out.write("              <font color=\"blue\">Amount</font>\n");
      out.write("               <input type=\"number\" id=\"aid16\" name=\"a16\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("             <br><br><br>\n");
      out.write("             <font color=\"blue\">Enter CVV</font>\n");
      out.write("               <input type=\"number\" id=\"cvid16\" name=\"cv16\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("             <br><br><br>\n");
      out.write("               </form>\n");
      out.write("            <img src=\"images/images.jpg\" alt=\"Credit Card\" >\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" id=\"pp\" class=\"Button\" value=\"Pay\" onClick=\"form.action='Transaction.jsp'\"/></div>\n");
      out.write("    \n");
      out.write("         \n");
      out.write("   <script>\n");
      out.write("         function valid()\n");
      out.write("        {\n");
      out.write("            var number=0;\n");
      out.write("            number=document.f15.flightid15.value;\n");
      out.write("            var regex = new RegExp(\"^[0-9]{16}$\");\n");
      out.write("    if (!regex.test(number))\n");
      out.write("    {\n");
      out.write("        alert(\"invalid\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("\n");
      out.write("    return luhnCheck(number);\n");
      out.write("            \n");
      out.write("        if(document.f15.flightid15.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected ID\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        else if(document.f15.p15.value===\"\" )\n");
      out.write("        {\n");
      out.write("            alert(\"You have not selected no of people\");\n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            var n=document.f15.flightid15.value;\n");
      out.write("            var nn=document.f15.p15.value;\n");
      out.write("            if(Number(n) && Number(nn) )\n");
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
      out.write("    function luhnCheck(val) {\n");
      out.write("    var sum = 0;\n");
      out.write("    for (var i = 0; i < val.length; i++) {\n");
      out.write("        var intVal = parseInt(val.substr(i, 1));\n");
      out.write("        if (i % 2 === 0) {\n");
      out.write("            intVal *= 2;\n");
      out.write("            if (intVal > 9) {\n");
      out.write("                intVal = 1 + (intVal % 10);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        sum += intVal;\n");
      out.write("    }\n");
      out.write("    return (sum % 10) === 0;\n");
      out.write("}\n");
      out.write("    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
