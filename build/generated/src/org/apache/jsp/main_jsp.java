package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>main</title>\n");
      out.write("        <style>\n");
      out.write("body, html {\n");
      out.write("    height: 100%;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".parallax {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url('images/q.gif');\n");
      out.write("\n");
      out.write("    /* Full height */\n");
      out.write("    height: 100%; \n");
      out.write("\n");
      out.write("    /* Create the parallax scrolling effect */\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write(".parallax1 {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url('images/r.gif');\n");
      out.write("\n");
      out.write("    /* Full height */\n");
      out.write("    height: 100%; \n");
      out.write("\n");
      out.write("    /* Create the parallax scrolling effect */\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write(".parallax2 {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url('images/s.gif');\n");
      out.write("\n");
      out.write("    /* Full height */\n");
      out.write("    height: 100%; \n");
      out.write("\n");
      out.write("    /* Create the parallax scrolling effect */\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write(".parallax3 {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url('images/t.gif');\n");
      out.write("\n");
      out.write("    /* Full height */\n");
      out.write("    height: 100%; \n");
      out.write("\n");
      out.write("    /* Create the parallax scrolling effect */\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "for main.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        <div style=\"color: blue\" align=\"center\"><b>\n");
      out.write("        ");

		if (session != null) {
			if (session.getAttribute("FirstName") != null) {
				String name = (String) session.getAttribute("FirstName");
				out.print("Hello, " + name + "  Welcome to your Profile");
			} 
		}
	
      out.write("\n");
      out.write("            </b></div>\n");
      out.write("        <div class=\"parallax\"></div>\n");
      out.write("       \n");
      out.write("        <div style=\"background-color: lightblue; height:500px;\">\n");
      out.write("            <font color=\"white\" size=\"350px\"><b>An all-new interactive travel experience</b><font>\n");
      out.write("            <br>\n");
      out.write("            There's more than meets the eye with our new amenity kits in Economy Class, available on select flights. Play our new augmented reality game airblue Destination Dash. Solve the puzzles to travel across all 6 continents, and scan your amenity kit on board to unlock a secret level.\n");
      out.write("          <br> \n");
      out.write("            <br>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"parallax\"></div>\n");
      out.write("        \n");
      out.write("        <div style=\"background-color: lightblue; height:500px;\">\n");
      out.write("            <font color=\"white\" size=\"350px\"><b>Visit the world’s newest theme parks</b><font>\n");
      out.write("            <br>\n");
      out.write("            Take your next family vacation in Dubai with our special fares and enjoy non-stop adventure.\n");
      out.write("           <br> \n");
      out.write("            <br>\n");
      out.write("            </div>\n");
      out.write("         <div class=\"parallax1\"></div>\n");
      out.write("         <div style=\"background-color: lightblue; height:500px;\">\n");
      out.write("            <font color=\"white\" size=\"350px\"><b>Spend your Miles at Dubai Duty Free</b><font>\n");
      out.write("            <br>\n");
      out.write("           Make your airport experience more rewarding and use your airblue token to pay for fashion accessories, perfume, gadgets and more at participating stores at all Dubai airports. Start redeeming from just 4,500 airblue Miles, which will give you AED 75 to spend instantly at the checkout.\n");
      out.write("           <br> \n");
      out.write("            <br>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("         <div class=\"parallax3\"></div>\n");
      out.write("         <div style=\"background-color: lightblue; height:500px;\">\n");
      out.write("            <font color=\"white\" size=\"350px\"><b>Earn 3,000 bonus Miles with Rocketmiles</b><font>\n");
      out.write("            <br>\n");
      out.write("            Airblue Skywards members can now enjoy 3,000 bonus Skywards Miles when they book their first stay at over 400,000 hotels worldwide with our partner Rocketmiles\n");
      out.write("          <br> \n");
      out.write("          \n");
      out.write("            <br>\n");
      out.write("            </div>\n");
      out.write("         <div class=\"parallax2\"></div>\n");
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
