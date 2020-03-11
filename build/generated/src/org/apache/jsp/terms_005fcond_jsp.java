package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class terms_005fcond_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Terms and Conditions</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        <div align=\"center\"><h1><font color=\"blue\">Terms and Conditions</font></h1></div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            Airblue's web sites and any Company Information are available to you only to learn about, evaluate, or purchase Airblue's services and products. Unless you are an approved Airblue travel agent, you may use the Airblue web sites and any Company Information only for personal, noncommercial purposes. Agents must sell tickets at the price presented by the reservations system. Artificially raising fares or using commissions to lower fares is not permitted. Except in connection with your authorized use of the Airblue web sites, you may not copy, modify, display, license, distribute, transmit, or download the Company Information without Airblue's written consent. Do not use the Airblue web sites to make any speculative or false reservation. \n");
      out.write("You may not use any \"deep-link,\" \"page-scrape,\" \"robot,\" \"spider\" or other automatic device, program, algorithm or methodology which does the same things, to access, acquire, copy, or monitor any portion of the Airblue web sites or any Company Information. Any use of the Airblue web sites that results in the depletion of web site infrastructural resources is not authorized. When you use the Airblue web sites or Company Information for an authorized purpose, you should include all proprietary notices without changing or hiding them. As a condition of your use of the Airblue web sites, you promise that you will not use the Airblue web sites or Company Information for any purpose that is unlawful or prohibited by these terms and conditions.  </div>\n");
      out.write("       <br>\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\"><h3><font color=\"blue\">Liability Disclaimer</font></h1></div>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            THE CONTENT AND COMPANY INFORMATION FOUND ON AIRBLUE'S WEB SITES IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION ANY WARRANTY CONCERNING THE INFORMATION, SERVICES, OR PRODUCTS OFFERED OR PROVIDED THROUGH OR IN CONNECTION WITH AIRBLUE'S WEB SITES AND ANY IMPLIED WARRANTIES OF MERCHANT ABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. IN NO EVENT SHALL AIRBLUE OR ITS PREFERRED PARTNERS BE LIABLE FOR ANY DIRECT, INDIRECT, PUNITIVE, INCIDENTAL, SPECIAL, OR CONSEQUENTIAL DAMAGES ARISING OUT OF, OR IN ANY WAY CONNECTED WITH, THE USE OF AIRBLUE'S WEB SITES OR WITH THE DELAY OR INABILITY TO USE AIRBLUE'S WEB SITES, OR FOR ANY INFORMATION (INCLUDING COMPANY INFORMATION), SOFTWARE, PRODUCTS, AND SERVICES OBTAINED THROUGH AIRBLUE'S WEB SITES, OR OTHERWISE ARISING OUT OF THE USE OF THE AIRBLUE WEB SITES, WHETHER BASED ON CONTRACT, TORT, STRICT LIABILITY, OR OTHERWISE, EVEN IF AIRBLUE OR ITS PREFERRED PARTNERS HAVE BEEN ADVISED OF THE POSSIBILITY OF DAMAGES. \n");
      out.write("This disclaimer of liability applies to any damages or injuries caused by any failure of performance, error, omission, interruption, deletion, defect, delay in operation or transmission, computer virus, communication-line failure, theft or destruction or unauthorized access to, alteration of, or use of record, whether for breach of contract, tortious behavior, negligence, or under any other cause of action.   </div>\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
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
