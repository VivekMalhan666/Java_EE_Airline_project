/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBConnection.DB;
import Models.Person;
import Models.validation;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.owasp.html.Sanitizers;
import org.owasp.html.PolicyFactory;

/**
 *
 * @author Raghda
 */

public class Signup extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //String fname = ESAPI.encoder().encodeForHTMLAttribute(request.getParameter("fname"));
            //String lname=ESAPI.encoder().encodeForHTMLAttribute(request.getParameter("lname"));
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
            String email=request.getParameter("email");
            String pswd=request.getParameter("password");
            String contact=request.getParameter("contact");
            String creditno=request.getParameter("credit");
           //PolicyFactory policy=Sanitizers.FORMATTING.and(Sanitizers.BLOCKS);
           // String pswd=policy.sanitize(request.getParameter("password"));
System.out.println(pswd);
            
            boolean flag8=false;
            validation v=new validation();
           flag8 =v.ValidateSignUp(fname, lname, email, pswd, contact);
            if(flag8==false)
            {
                 request.getRequestDispatcher("/sign up.jsp").forward(request, response);
            }
            else{
            Person P=new Person();
           

          /*  P.setFName(fname);
            P.setLName(lname);
            P.setEmail(email);
            P.setPassword(pswd);
            P.setContact(contact);
            P.setCreditno(creditno);*/
          P.setFName(Jsoup.clean(fname,Whitelist.basic()));
          P.setLName(Jsoup.clean(lname,Whitelist.basic()));
          P.setEmail(Jsoup.clean(email,Whitelist.basic()));
          P.setPassword(Jsoup.clean(pswd,Whitelist.basic()));
          P.setContact(Jsoup.clean(contact,Whitelist.basic()));
          P.setCreditno(Jsoup.clean(creditno,Whitelist.basic()));
          
            DB db=new DB();
            String UserRegistered=db.signupuser(P);
            if(UserRegistered.equals("success"))
                    {
                        request.getRequestDispatcher("/main.jsp").forward(request, response);
                    }
            else{
                request.setAttribute("errMessage",UserRegistered);
                request.getRequestDispatcher("/sign up.jsp").forward(request, response);
            }
            }
        } catch (ClassNotFoundException | SQLException ex) {
           // request.getRequestDispatcher("/error.jsp").forward(request, response);
           Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
           
       }
    }
   

}
