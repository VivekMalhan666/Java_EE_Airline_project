/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Flight;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

/**
 *
 * @author Raghda
 */
//@WebServlet(name = "AddFlight", urlPatterns = {"/Add"})
public class AddFlight extends HttpServlet {

    
    

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String departure=request.getParameter("cthree");
         String arrival=request.getParameter("cfour");
         String source=request.getParameter("listthree");
         String destination=request.getParameter("cityfour");
         String id=request.getParameter("ffff");
         String n=request.getParameter("namee");
         int fid = Integer.parseInt(id);
         
         Flight f=new Flight();
         
         /*f.setFid(fid);
         f.setSource(source);
         f.setDestination(destination);
         f.setArrival(arrival);
         f.setDeparture(departure);
         f.setName(n);*/
         f.setSource(Jsoup.clean(source,Whitelist.basic()));
         f.setDestination(Jsoup.clean(destination,Whitelist.basic()));
         f.setArrival(Jsoup.clean(arrival,Whitelist.basic()));
         f.setDeparture(Jsoup.clean(departure,Whitelist.basic()));
         f.setName(Jsoup.clean(n,Whitelist.basic()));
         try (PrintWriter out = response.getWriter()) {
         DB db=new DB();
         String UserRegistered=db.Addflight(f);
            if(UserRegistered.equals("success"))
                    {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Successful</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Addition of Flight "+ "</h1>"); 
                out.println("<h3>Flight Added Successfully "+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                //request.getRequestDispatcher("/main.jsp").forward(request, response);
            }

                        
                    
            else{
                request.setAttribute("errMessage",UserRegistered);
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        
    }catch(ClassNotFoundException ex)
    {
     Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        
    }
         catch (SQLException ex) {
           Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

}
