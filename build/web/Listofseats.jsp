<%-- 
    Document   : approvedissaprove
    Created on : 09-Sep-2017, 01:24:22
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="DBConnection.DB " %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import ="java.sql.PreparedStatement"%>;
 <%@ page import ="org.apache.commons.lang3.StringEscapeUtils"%>;
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/r.css" rel="stylesheet" type="text/css"/>
        <title>List Of Seats</title>
        
    </head>
    <body><br><br><br><br><br><br><div align="center"><h1 style="color: blue"><b>Approve/Disapprove By Manager</b></h1></div>
        <jsp:include page="header.jsp" />
     
     <form method="post" >
<div align="center">
         <br><br><br>
         
         <table  width="500px"> 
            <h3> FirstClass Seats Information </h3>
        <tbody>  
        <tr height="40px">  
            
            <th> FlightID </th>
            <th> Price </th>
            <th> No of seats </th>
            <th> Availability </th>
            <th> FoodDeal </th>
            <th> MovieDeal </th>
            <th> Approve </th>
        </tr>
       
   <%
      
   try
   {
       int a=0;
       Connection con=DB.getCon();
       String q7 = "select * from firstclass join approve on firstclass.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
            
{ %>
           
    <tr>   <td><%out.println(r.getInt("fid")); %></td>
       <td><%out.println(r.getInt("price")); %></td>
       <td><%out.println(r.getInt("noofseats")); %></td>
       <td><%out.println(r.getString("seatavailability")); %></td>
       <td><%out.println(r.getString("fooddeals")); %></td>
       <td><%out.println(r.getString("moviedeals")); %></td>
       <td><%out.println(r.getString("status")); %></td>
    </tr>
<%

}

r.close();

con.close();
}

catch(Exception ex)
       {
        ex.printStackTrace();
         
       }
%>
   
   
         //------

   
        </tbody>
        </table>

         //------
         <table  width="500px"> 
            <h3> Buisness Seats Information </h3>
        <tbody>  
        <tr height="40px">  
            
            <th> FlightID </th>
            <th> Price </th>
            <th> No of seats </th>
            <th> Availability </th>
            <th> FoodDeal </th>
            <th> MovieDeal </th>
            <th> Approve </th>
        </tr>
       
   <%
   try
   {
       
       Connection con=DB.getCon();
       String q7 = "select * from buisness join approve on buisness.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
{ %>
           
    <tr>   <td><%out.println(r.getInt("fid")); %></td>
       <td><%out.println(r.getInt("price")); %></td>
       <td><%out.println(r.getInt("noofseats")); %></td>
       <td><%out.println(r.getString("seatavailability")); %></td>
       <td><%out.println(r.getString("fooddeals")); %></td>
       <td><%out.println(r.getString("moviedeals")); %></td>
       <td><%out.println(r.getString("status")); %></td>
    </tr>
<%

}

r.close();

con.close();
}

catch(Exception ex)
       {
        ex.printStackTrace();
         
       }
%>
   
   
         //------

   
        </tbody>
        </table>

         //------
                  <table  width="500px"> 
            <h3> Economy Seats Information </h3>
        <tbody>  
        <tr height="40px">  
            
            <th> FlightID </th>
            <th> Price </th>
            <th> No of seats </th>
            <th> Availability </th>
            <th> FoodDeal </th>
            <th> MovieDeal </th>
            <th> Approve </th>
        </tr>
       
   <%
   try
   {
       
       Connection con=DB.getCon();
       String q7 = "select * from economy join approve on economy.fid=approve.fid";
       
        PreparedStatement st=con.prepareStatement(q7);
        ResultSet r=st.executeQuery();
        while(r.next())
{ %>
           
    <tr>   <td><%out.println(r.getInt("fid")); %></td>
       <td><%out.println(r.getInt("price")); %></td>
       <td><%out.println(r.getInt("noofseats")); %></td>
       <td><%out.println(r.getString("seatavailability")); %></td>
       <td><%out.println(r.getString("fooddeals")); %></td>
       <td><%out.println(r.getString("moviedeals")); %></td>
       <td><%out.println(r.getString("status")); %></td>
    </tr>
<%

}

r.close();

con.close();
}

catch(Exception ex)
       {
        ex.printStackTrace();
         
       }
%>
   
   
         //------

   
        </tbody>
        </table>
         //------
     </div>
         </form>
         <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
   
    
    </body>
</html>

