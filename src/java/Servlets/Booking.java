
package Servlets;

import DBConnection.DB;
import Models.Flight;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;


public class Booking extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(false);
    
        try (PrintWriter out = response.getWriter()) {
            String departure=request.getParameter("cone");
            String origin=request.getParameter("listone");
            String arrival=request.getParameter("ctwo");
            String destination=request.getParameter("citytwo");
            String peopleno=request.getParameter("numone");
            int p=Integer.parseInt(peopleno);
            String email=(String) session.getAttribute("Email");
            DB db=new DB();
            Flight f=new Flight();
            /*f.setArrival(arrival);
            f.setDeparture(departure);
            f.setSource(origin);
            f.setDestination(destination);*/
            
             f.setSource(Jsoup.clean(origin,Whitelist.basic()));
         f.setDestination(Jsoup.clean(destination,Whitelist.basic()));
         f.setArrival(Jsoup.clean(arrival,Whitelist.basic()));
         f.setDeparture(Jsoup.clean(departure,Whitelist.basic()));
            session.setAttribute("arrival",arrival);
            session.setAttribute("destination",destination);
            session.setAttribute("departure",departure);
            session.setAttribute("origin",origin);
            session.setAttribute("peopleno",p);
            
            boolean flag=db.booking(f,p,email);
            if(flag==true)
            {
                 request.getRequestDispatcher("schedule.jsp").forward(request, response);
            }
            else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>error</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> can not book "+ "</h1>"); 
                out.println("<h3>can not book "+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
            }
    }
     catch(Exception e)
    {
        e.printStackTrace();
         
    }   
    }
}
