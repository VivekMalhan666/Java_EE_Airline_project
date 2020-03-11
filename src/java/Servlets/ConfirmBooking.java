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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Raghda
 */

public class ConfirmBooking extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         //HttpSession session=request.getSession(false);
    
        try (PrintWriter out = response.getWriter()) {
            String flightid=request.getParameter("flightid15");
            int fid=Integer.parseInt(flightid);
            String people=request.getParameter("p15");
            int number=Integer.parseInt(people);
            String type=request.getParameter("tseven");
            DB db=new DB();
            if(type.equals("First Class"))
            
            {
                boolean flag=db.confirmbookingf(fid,number);
                if(flag==true)
                {
                response.sendRedirect("payment.jsp");
                }
                else{
                    out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>booking unsuccessful</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> booking unsuccessful "+ "</h1>"); 
                out.println("<h3>booking unsuccessful"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                }
                
            }
            else if(type.equals("Business"))
            {
                boolean flag=db.confirmbookingb(fid,number);
                if(flag==true)
                {
                response.sendRedirect("payment.jsp");
                }
                else{
                    out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>booking unsuccessful</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> booking unsuccessful "+ "</h1>"); 
                out.println("<h3>booking unsuccessful"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                }
            }
            else if(type.equals("Economy"))
            {
                boolean flag=db.confirmbookinge(fid,number);
                if(flag==true)
                {
                response.sendRedirect("payment.jsp");
                }
                else{
                    out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>booking unsuccessful</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> booking unsuccessful "+ "</h1>"); 
                out.println("<h3>booking unsuccessful"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                }
            }
            
        }
        
     catch(Exception e)
    {
        e.printStackTrace();
         
    }   
    }

    
    

}//ending bracket
