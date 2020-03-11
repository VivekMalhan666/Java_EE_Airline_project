package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBConnection.DB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(";\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>itinerary</title>\n");
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
      out.write("   </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     <br><br><br><br><br>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     <div align=\"center\"><h1 style=\"color: blue\"><b>Itinerary</b></h1></div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "for main.jsp", out, false);
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            \n");
      out.write("            //------------------\n");
      out.write("            <table  width=\"500px\"> \n");
      out.write("            <h3> Iternanry Information </h3>\n");
      out.write("        <tbody>  \n");
      out.write("        <tr height=\"40px\">  \n");
      out.write("            \n");
      out.write("            <th> Flightname </th>\n");
      out.write("            <th> Departure </th>\n");
      out.write("            <th> Arrival </th>\n");
      out.write("            <th> Origin</th>\n");
      out.write("            <th> Destination </th>\n");
      out.write("        </tr>\n");
      out.write("       <tr height=\"40px\">  \n");
      out.write("            \n");
      out.write("            <th> airblue47 </th>\n");
      out.write("            <th> Medina,Saudi Arabia </th>\n");
      out.write("            <th> Mumbai,India </th>\n");
      out.write("            <th> 11/22/2017</th>\n");
      out.write("            <th> 12/13/2017 </th>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("   ");

   try
   {
      
       Connection con=DB.getCon();
       String arrival = (String) session.getAttribute("arrival");
       String destination = (String) session.getAttribute("destination");
       String departure = (String) session.getAttribute("departure");
       String origin = (String) session.getAttribute("origin");
       
       
       String q7 = "select fname,departure,arrival,source,destination from flight join approve on flight.fid=approve.fid where flight.departure=? and flight.arrival=? and flight.source=? and flight.destination=? and status=?";
       
        PreparedStatement st=con.prepareStatement(q7);
        st.setString(1,departure);
        st.setString(2,arrival);
        st.setString(3,origin);
        st.setString(4,destination);
        st.setInt(5,1);
        ResultSet r=st.executeQuery();
        if(r.next()){
        while(r.next())
{ 
      out.write("\n");
      out.write("           \n");
      out.write("    <tr>   <td>");
out.println(r.getString("fname")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("departure")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("arrival")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("source")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("destination")); 
      out.write("</td>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    ");
}}
    else{
    out.println("cannot show");
      out.write("\n");
      out.write("    \n");


}

r.close();

con.close();
}

catch(Exception ex)
       {
        ex.printStackTrace();
         
       }

      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("         //------\n");
      out.write("\n");
      out.write("   \n");
      out.write("        </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("            //------------------\n");
      out.write("            <form method=\"post\" action=\"ConfirmBooking\" name=\"f15\" onsubmit=\"return(valid());\">\n");
      out.write("            <font color=\"blue\">Flight name</font>\n");
      out.write("               <input type=\"text\" id=\"fid15\" name=\"flightid15\" style=\"border: 2px solid darkblue; width:80px\">\n");
      out.write("              &nbsp;&nbsp;&nbsp;\n");
      out.write("              <font color=\"blue\">No of people travelling</font>\n");
      out.write("               <input type=\"number\" id=\"pid15\" name=\"p15\" style=\"border: 2px solid darkblue; width:80px\"/>\n");
      out.write("             <br><br>\n");
      out.write("     <font color=\"blue\">Type </font><input list=\"typeclass7\" type=\"text\" style=\"border-color: blue;\" name=\"tseven\">\n");
      out.write("<datalist id=\"typeclass7\" style=\"border-color: blue;\">\n");
      out.write("    <option value=\"First Class\"/>\n");
      out.write("    <option value=\"Business\"/>\n");
      out.write("    <option value=\"Economy\"/>\n");
      out.write("</datalist>\n");
      out.write("     <input type=\"submit\" id=\"one\" class=\"Button\" value=\"Next\"/>\n");
      out.write("     </form>\n");
      out.write("            </div>\n");
      out.write("     <script>\n");
      out.write("         function valid()\n");
      out.write("        {\n");
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
      out.write("        else\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            var nn=document.f15.p15.value;\n");
      out.write("            if( Number(nn) )\n");
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
      out.write("    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("     </body>\n");
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
