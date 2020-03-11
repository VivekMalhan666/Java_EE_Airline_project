<%-- 
    Document   : customerbooking
    Created on : 10-Sep-2017, 12:56:17
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Booking</title>
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
        
        <div align="center"><h1><font color="blue">Booked Flights Approve/Disapprove</font></h1></div>
        <jsp:include page="header.jsp" />
        <br><br><br><br><br><br>
        <div style="text-align: center">
   <table align="center">
            <tr>
    <th height="60px" width="120px">Flight_ID</th>
    <th height="60px" width="120px">Source</th>
    <th height="60px" width="120px">Destination</th>
    <th height="60px" width="120px">Departure Date</th>
    <th height="60px" width="120px">Arrival Date</th>
    <th height="60px" width="120px">Type</th>
    <th height="60px" width="120px">Price</th>
    <th height="60px" width="120px">Customer_ID</th>
    <th height="60px" width="120px">Customer_name</th>
    <th height="60px" width="120px">No of people</th>
    <th height="60px" width="120px">Total price</th>
    <th height="60px" width="120px">Transaction Status</th>
  </tr>
  
  <tr>
    <th height="60px" width="120px">207</th>
    <th height="60px" width="120px">Lahore,Pakistan</th>
    <th height="60px" width="120px">Istanbul,Turkey</th>
    <th height="60px" width="120px">09/10/2017</th>
    <th height="60px" width="120px">11/12/2017</th>
    <th height="60px" width="120px">Business</th>
    <th height="60px" width="120px">34,000</th>
    <th height="60px" width="120px">1</th>
    <th height="60px" width="120px">Ali</th>
    <th height="60px" width="120px">1</th>
    <th height="60px" width="120px">68,000</th>
    <th height="60px" width="120px">Paid</th>
  </tr>
  <tr>
    <th height="60px" width="120px">207</th>
    <th height="60px" width="120px">Lahore,Pakistan</th>
    <th height="60px" width="120px">Istanbul,Turkey</th>
    <th height="60px" width="120px">09/10/2017</th>
    <th height="60px" width="120px">11/12/2017</th>
    <th height="60px" width="120px">First Class</th>
    <th height="60px" width="120px">48,000</th>
    <th height="60px" width="120px">2</th>
    <th height="60px" width="120px">Ahmed</th>
    <th height="60px" width="120px">2</th>
    <th height="60px" width="120px">144,000</th>
    <th height="60px" width="120px">Not paid</th>
    
  </tr>
  <tr>
    <th height="60px" width="120px">207</th>
    <th height="60px" width="120px">Lahore,Pakistan</th>
    <th height="60px" width="120px">Istanbul,Turkey</th>
    <th height="60px" width="120px">09/10/2017</th>
    <th height="60px" width="120px">11/12/2017</th>
    <th height="60px" width="120px">Economy</th>
    <th height="60px" width="120px">27,000</th>
    <th height="60px" width="120px">3</th>
    <th height="60px" width="120px">Muhammad</th>
    <th height="60px" width="120px">0</th>
    <th height="60px" width="120px">27,000</th>
    <th height="60px" width="120px">Paid</th>
    
  </tr>
  
   </table>
            
            </div>
         <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
