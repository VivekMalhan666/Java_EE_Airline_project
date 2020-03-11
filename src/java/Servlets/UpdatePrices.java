/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Seats;
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

/**
 *
 * @author Raghda
 */

public class UpdatePrices extends HttpServlet {

   
   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try (PrintWriter out = response.getWriter()) {
             
             String flightid=request.getParameter("flightid8");
             int fid=Integer.parseInt(flightid);
             
           String type=request.getParameter("teight");
           String price=request.getParameter("numtwoo");
           int p=Integer.parseInt(price);
           
           DB db=new DB();
           
           
            String UserRegistered=db.updateprices(fid,type,p);
            if(UserRegistered.equals("success"))
            {
                 out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>price update</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> prices updated successfully "+ "</h1>"); 
                out.println("<h3>prices updated successfully"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                
            }
            else
            {
                request.setAttribute("errMessage",UserRegistered);
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        }  catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
