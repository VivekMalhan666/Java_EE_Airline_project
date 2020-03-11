/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Person;
import Models.validation;
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
import javax.servlet.http.HttpSession;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

/**
 *
 * @author Raghda
 */

public class Login extends HttpServlet {

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try (PrintWriter out = response.getWriter()) {
             String e=request.getParameter("email");
             String p=request.getParameter("passwordname");
             
             Person P=new Person();
             
             P.setEmail(Jsoup.clean(e,Whitelist.basic()));
          P.setPassword(Jsoup.clean(p,Whitelist.basic()));
            // P.setEmail(e);
             //P.setPassword(p);
             String mail=P.getEmail();
             String pass=P.getPassword();
             
             validation v=new validation();
             boolean ret=v.ValidateLogIn(mail, pass);
             if(ret==false){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>error</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> email or password incorrect "+ "</h1>"); 
                out.println("<h3>email or password not found!!! "+ "</h1>"); 
                out.println("</body>");
                out.println("</html>"); 
             }
             else{
             
                         DB db=new DB();
            String type=db.login(P);
            if(type.equals("customer") || type.equals("admin") || type.equals("manager"))
            {
                HttpSession session=request.getSession();
                session.setAttribute("Email", e);
                session.setAttribute("Password",p);
                session.setAttribute("FirstName" ,P.getFName());
                session.setAttribute("LastName" ,P.getLName());
                session.setAttribute("contact" ,P.getContact());
                session.setAttribute("creditno" ,P.getCreditno());
                
                if(type.equals("customer"))
                {
                    response.sendRedirect("main.jsp");

                }
               else if(type.equals("admin"))
                {
                    response.sendRedirect("adminhome.jsp");
                }
               else if(type.equals("manager"))
                {
                    response.sendRedirect("manager home.jsp"); 
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
                out.println("<h1> email or password incorrect "+ "</h1>"); 
                out.println("<h3>email or password not found!!! "+ "</h1>"); 
                out.println("</body>");
                out.println("</html>");
            }
             }
         }
           catch ( Exception ex) {
           Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }

    
}
