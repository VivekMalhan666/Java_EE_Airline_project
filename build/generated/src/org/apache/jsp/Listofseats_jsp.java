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
import org.apache.commons.lang3.StringEscapeUtils;

public final class Listofseats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(";\n");
      out.write(" ;\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/r.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>List Of Seats</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body><br><br><br><br><br><br><div align=\"center\"><h1 style=\"color: blue\"><b>Approve/Disapprove By Manager</b></h1></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("     \n");
      out.write("     <form method=\"post\" >\n");
      out.write("<div align=\"center\">\n");
      out.write("         <br><br><br>\n");
      out.write("         \n");
      out.write("         <table  width=\"500px\"> \n");
      out.write("            <h3> FirstClass Seats Information </h3>\n");
      out.write("        <tbody>  \n");
      out.write("        <tr height=\"40px\">  \n");
      out.write("            \n");
      out.write("            <th> FlightID </th>\n");
      out.write("            <th> Price </th>\n");
      out.write("            <th> No of seats </th>\n");
      out.write("            <th> Availability </th>\n");
      out.write("            <th> FoodDeal </th>\n");
      out.write("            <th> MovieDeal </th>\n");
      out.write("            <th> Approve </th>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("   ");

      
   try
   {
       int a=0;
       Connection con=DB.getCon();
       String q7 = "select * from firstclass join approve on firstclass.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
            
{ 
      out.write("\n");
      out.write("           \n");
      out.write("    <tr>   <td>");
out.println(r.getInt("fid")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("price")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("noofseats")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("seatavailability")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("fooddeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("moviedeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("status")); 
      out.write("</td>\n");
      out.write("    </tr>\n");


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
      out.write("         //------\n");
      out.write("         <table  width=\"500px\"> \n");
      out.write("            <h3> Buisness Seats Information </h3>\n");
      out.write("        <tbody>  \n");
      out.write("        <tr height=\"40px\">  \n");
      out.write("            \n");
      out.write("            <th> FlightID </th>\n");
      out.write("            <th> Price </th>\n");
      out.write("            <th> No of seats </th>\n");
      out.write("            <th> Availability </th>\n");
      out.write("            <th> FoodDeal </th>\n");
      out.write("            <th> MovieDeal </th>\n");
      out.write("            <th> Approve </th>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("   ");

   try
   {
       
       Connection con=DB.getCon();
       String q7 = "select * from buisness join approve on buisness.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
{ 
      out.write("\n");
      out.write("           \n");
      out.write("    <tr>   <td>");
out.println(r.getInt("fid")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("price")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("noofseats")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("seatavailability")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("fooddeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("moviedeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("status")); 
      out.write("</td>\n");
      out.write("    </tr>\n");


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
      out.write("         //------\n");
      out.write("                  <table  width=\"500px\"> \n");
      out.write("            <h3> Economy Seats Information </h3>\n");
      out.write("        <tbody>  \n");
      out.write("        <tr height=\"40px\">  \n");
      out.write("            \n");
      out.write("            <th> FlightID </th>\n");
      out.write("            <th> Price </th>\n");
      out.write("            <th> No of seats </th>\n");
      out.write("            <th> Availability </th>\n");
      out.write("            <th> FoodDeal </th>\n");
      out.write("            <th> MovieDeal </th>\n");
      out.write("            <th> Approve </th>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("   ");

   try
   {
       
       Connection con=DB.getCon();
       String q7 = "select * from economy join approve on economy.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
{ 
      out.write("\n");
      out.write("           \n");
      out.write("    <tr>   <td>");
out.println(r.getInt("fid")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("price")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getInt("noofseats")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("seatavailability")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("fooddeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("moviedeals")); 
      out.write("</td>\n");
      out.write("       <td>");
out.println(r.getString("status")); 
      out.write("</td>\n");
      out.write("    </tr>\n");


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
      out.write("         //------\n");
      out.write("     </div>\n");
      out.write("         </form>\n");
      out.write("         <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    </body>\n");
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
