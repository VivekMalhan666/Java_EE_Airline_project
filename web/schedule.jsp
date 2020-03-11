<%-- 
    Document   : schedule
    Created on : 10-Sep-2017, 16:37:18
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="DBConnection.DB " %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import ="java.sql.PreparedStatement"%>;

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>itinerary</title>
        <style>
        table, th, td {
                      border: 1px solid darkblue;
                      
                      }
                      input[type=number] {
    width:100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid darkblue;
    border-radius: 4px;
}

   </style>
    </head>
    <body>
        
     <br><br><br><br><br>
     
     
     <div align="center"><h1 style="color: blue"><b>Itinerary</b></h1></div><jsp:include page="for main.jsp" />
        <div align="center">
            
            //------------------
            <table  width="500px"> 
            <h3> Iternanry Information </h3>
        <tbody>  
        <tr height="40px">  
            
            <th> Flightname </th>
            <th> Departure </th>
            <th> Arrival </th>
            <th> Origin</th>
            <th> Destination </th>
        </tr>
       <tr height="40px">  
            
            <th> airblue47 </th>
            <th> Medina,Saudi Arabia </th>
            <th> Mumbai,India </th>
            <th> 11/22/2017</th>
            <th> 12/13/2017 </th>
        </tr>
       
   <%
   try
   {
      
       Connection con=DB.getCon();
       String arrival = (String) session.getAttribute("arrival");
       String destination = (String) session.getAttribute("destination");
       String departure = (String) session.getAttribute("departure");
       String origin = (String) session.getAttribute("origin");
       
       
       String q7 = "select fname,departure,arrival,source,destination from flight join approve on flight.fid=approve.fid where flight.departure=? and flight.arrival=? and flight.source=? and flight.destination=? and status=?";
       
        PreparedStatement st=con.prepareStatement(q7);
        st.setString(1,departure);
        st.setString(2,arrival);
        st.setString(3,origin);
        st.setString(4,destination);
        st.setInt(5,1);
        ResultSet r=st.executeQuery();
        if(r.next()){
        while(r.next())
{ %>
           
    <tr>   <td><%out.println(r.getString("fname")); %></td>
       <td><%out.println(r.getString("departure")); %></td>
       <td><%out.println(r.getString("arrival")); %></td>
       <td><%out.println(r.getString("source")); %></td>
       <td><%out.println(r.getString("destination")); %></td>
       
    </tr>
    <%}}
    else{
    out.println("cannot show");%>
    
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

            //------------------
            <form method="post" action="ConfirmBooking" name="f15" onsubmit="return(valid());">
            <font color="blue">Flight name</font>
               <input type="text" id="fid15" name="flightid15" style="border: 2px solid darkblue; width:80px">
              &nbsp;&nbsp;&nbsp;
              <font color="blue">No of people travelling</font>
               <input type="number" id="pid15" name="p15" style="border: 2px solid darkblue; width:80px"/>
             <br><br>
     <font color="blue">Type </font><input list="typeclass7" type="text" style="border-color: blue;" name="tseven">
<datalist id="typeclass7" style="border-color: blue;">
    <option value="First Class"/>
    <option value="Business"/>
    <option value="Economy"/>
</datalist>
     <input type="submit" id="one" class="Button" value="Next"/>
     </form>
            </div>
     <script>
         function valid()
        {
        if(document.f15.flightid15.value==="" )
        {
            alert("You have not selected ID");
            return false;  
        }
        else if(document.f15.p15.value==="" )
        {
            alert("You have not selected no of people");
            return false;  
        }
        else
        {
            
            var nn=document.f15.p15.value;
            if( Number(nn) )
            {
            return true;
            }
            else
            {
                alert("Invalid");
                return false;
            }
        }
    }
    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
     </body>
</html>
