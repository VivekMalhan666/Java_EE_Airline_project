/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.owasp.esapi.ESAPI;



public class Approve extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        try (PrintWriter out = response.getWriter()) {
            String flightid=request.getParameter("flightid777");
            //String flightid = ESAPI.encoder().encodeForHTML( request.getParameter("flightid777"));

           // String Comment = ESAPI.validator().getValidInput("fid", flight, "CommentRegex", 20, false);
           //  String flightid = ESAPI.encoder().encodeForHTML( Comment );
             int fid=Integer.parseInt(flightid);
             System.out.print(fid);
             DB db=new DB();
             boolean flag=db.approveprices(fid);
             if(flag==true)
             {
                 out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>price approved</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> prices approved successfully"+ "</h1>"); 
                out.println("<h3>prices approved by the manager"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                
             }
             else{
                 request.setAttribute("errMessage","cant approve prices");
               request.getRequestDispatcher("/error.jsp").forward(request, response);
             }
              }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
    }

    

}
