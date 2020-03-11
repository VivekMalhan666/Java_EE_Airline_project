/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raghda
 */

public class Disapprove extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try (PrintWriter out = response.getWriter()) {
            String flightid=request.getParameter("flightid7777");
             int fid=Integer.parseInt(flightid);
             
             DB db=new DB();
             boolean flag=db.disapproveprices(fid);
             if(flag==true)
             {
                 out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>price disapproved</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> prices disapproved successfully"+ "</h1>"); 
                out.println("<h3>prices disapproved by the manager"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
             }
             else{
                 request.setAttribute("errMessage","try again");
               request.getRequestDispatcher("/error.jsp").forward(request, response);
             }
              }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
    }
}
   


