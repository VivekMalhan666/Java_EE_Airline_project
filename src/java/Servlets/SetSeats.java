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

public class SetSeats extends HttpServlet {

   
   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try (PrintWriter out = response.getWriter()) {
           String flightid=request.getParameter("flightid2");
           String f=request.getParameter("numone");
           int fseat=Integer.parseInt(f);
           String b=request.getParameter("numtwo");
           int bseat=Integer.parseInt(b);
           String e=request.getParameter("numthree");
           int eseat=Integer.parseInt(e);
           int fid = Integer.parseInt(flightid);
           
           DB db=new DB();
           boolean flag=db.SearchFlight(fid);
            if(flag==true) {
                Flight flight=new Flight();
               flight.setFid(fid);
                Firstclass ff=new Firstclass();
                ff.setNoOfSeats(fseat);
                Buisness bb=new Buisness();
                bb.setNoOfSeats(bseat);
                Economy ee=new Economy();
                ee.setNoOfSeats(eseat);
                String UserRegistered=db.inserttotalseats(ff,bb,ee,flight);
            if(UserRegistered.equals("success"))
                    {
                       out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>seats set</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> total number of seats set successfully "+ "</h1>"); 
                out.println("<h3>total number of seats set successfully"+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
                
                    }
            else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>seats set</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> you have already set seats of this flight"+ "</h1>"); 
                out.println("<h3>Go to update to update it"+ "</h1>"); 
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
