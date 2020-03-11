
package Servlets;

import DBConnection.DB;
import Models.Buisness;
import Models.Economy;
import Models.Firstclass;
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


public class Availability extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (PrintWriter out = response.getWriter()) {
            String flightid=request.getParameter("flightid3");
             int fid=Integer.parseInt(flightid);
             String type=request.getParameter("teight");
             
             DB db=new DB();
             Firstclass f=new Firstclass();
             Buisness b=new Buisness();
             Economy e=new Economy();
             
             boolean flag=db.favailability(fid,f);
            if(flag==true) {
                f.setAvailability("available");
                request.setAttribute("firstclass",f);
               // request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            else
            {
                f.setAvailability("not available");
                request.setAttribute("firstclass",f);
                //request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            //---------------------------
            boolean flag2=db.bavailability(fid,b);
            if(flag2==true) {
                b.setAvailability("available");
                request.setAttribute("buisness",b);
                //request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            else
            {
                b.setAvailability("not available");
                request.setAttribute("buisness",b);
               // request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            //---------------------------
            boolean flag3=db.eavailability(fid,e);
            if(flag3==true) {
                e.setAvailability("available");
                request.setAttribute("economy",e);
               // request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            else
            {
                e.setAvailability("not available");
                request.setAttribute("economy",e);
               // request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            }
            request.getRequestDispatcher("checkAvailability.jsp").forward(request, response);
            //---------------------------
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         
    }   catch (ClassNotFoundException ex) {   
            Logger.getLogger(Availability.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }

    
}
