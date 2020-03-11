/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Firstclass;
import Models.Seats;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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

public class DisplaySeats extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        PrintWriter out=response.getWriter();
            try 
            {
               
                 request.getRequestDispatcher("Listofseats.jsp").forward(request,response);           

            
            }
    catch (Exception ex ) {
                out.println(ex);
                Logger.getLogger(DisplaySeats.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
}
