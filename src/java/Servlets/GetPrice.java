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


public class GetPrice extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Firstclass f=new Firstclass();
        Buisness b=new Buisness();
        Economy e=new Economy();
        DB db=new DB();
        
       try (PrintWriter out = response.getWriter()) {
            String flightid=request.getParameter("flightid77");
             int fid=Integer.parseInt(flightid);
             
             boolean flag=db.fgetprice(fid,f);
             if(flag==true)
             {
                 request.setAttribute("firstclass",f);
                 //request.getRequestDispatcher("approveprice.jsp").forward(request, response);
             }
             else
             {
                 request.setAttribute("errMessage","cant retrive prices");
               request.getRequestDispatcher("/error.jsp").forward(request, response);
             }
             //---------------------------
             boolean flag2=db.bgetprice(fid,b);
             if(flag2==true)
             {
                 request.setAttribute("buisness",b);
                // request.getRequestDispatcher("approveprice.jsp").forward(request, response);
             }
             else
             {
                 request.setAttribute("errMessage","cant retrive prices");
               request.getRequestDispatcher("/error.jsp").forward(request, response);
             }
             //---------------------------
             boolean flag3=db.egetprice(fid,e);
             if(flag3==true)
             {
                 request.setAttribute("economy",e);
                // request.getRequestDispatcher("approveprice.jsp").forward(request, response);
             }
             else
             {
                 request.setAttribute("errMessage","cant retrive prices");
               request.getRequestDispatcher("/error.jsp").forward(request, response);
             }
             request.getRequestDispatcher("approveprice.jsp").forward(request, response);
             //---------------------------
             }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Availability.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GetPrice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
