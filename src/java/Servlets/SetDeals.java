/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Buisness;
import Models.Economy;
import Models.Firstclass;
import Models.Flight;
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

public class SetDeals extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try (PrintWriter out = response.getWriter()) {
           String flightid=request.getParameter("flightid7");
           int fid = Integer.parseInt(flightid);
             String type=request.getParameter("tseven");
             String fdeal=request.getParameter("teight");
             String mdeal=request.getParameter("tnine");
             
             DB db=new DB();
           boolean flag=db.SearchFlight(fid);
            if(flag==true) {
                Flight flight=new Flight();
               flight.setFid(fid);
                Firstclass ff=new Firstclass();
                ff.setFooddeals(fdeal);
                ff.setMoviedeals(mdeal);
                Buisness bb=new Buisness();
                bb.setFooddeals(fdeal);
                bb.setMoviedeals(mdeal);
                Economy ee=new Economy();
                ee.setFooddeals(fdeal);
                ee.setMoviedeals(mdeal);
                String UserRegistered=db.setdeals(flight,ff,bb,ee,type);
                if(UserRegistered.equals("success"))
                    {
                       out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>deals set</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> deals set successfully "+ "</h1>"); 
                out.println("<h3>you have set deals successfully"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                
                    }
            else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>deals set</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> deals could not be set"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
            }
            }
            else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>error</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Flight not FOUND "+ "</h1>"); 
                out.println("<h3>Flight Not found "+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
            }
             
         } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SetSeats.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
}
