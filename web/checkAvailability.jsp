<%-- 
    Document   : checkAvailability
    Created on : 09-Sep-2017, 23:06:03
    Author     : Raghda
--%>

<%@page import="DBConnection.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Availability</title>
    </head>
    <body><br><br><br><br>
        <div align="center"><h1 style="color: blue"><b>Check Availability of Seats</b></h1></div>
        <jsp:include page="header.jsp" />
        <form method="post" action="Availability" name="f3" onsubmit="return(valid());">
    
        
        <div align="center">
                <font color="blue">Flight ID</font>
                <input type="number" id="fid3" name="flightid3" style="border: 2px solid darkblue; width:80px">
                <br><br><br>
                <input type="submit" name="sub" class="Button" value="Select" >
                <br><br><br>
                <font color="blue"><b>First Class</b></font>
                <input type="text" id="fc" name="firstclass" value="${firstclass.availability}" style="border: 2px solid darkblue;">
                <br><br><br>
                <font color="blue"><b>Business</b></font>
                <input type="text" id="b" name="business" value="${buisness.availability}" style="border: 2px solid darkblue;">
                <br><br><br>
                <font color="blue"><b>Economy</b></font>
                <input type="text" id="e" name="Economy" value="${economy.availability}" style="border: 2px solid darkblue;">
         </div>
        
        </form>
        <script>
         function valid()
        {
        if(document.f3.flightid3.value==="" )
        {
            alert("You have not selected ID");
            return false;  
        }
        else
        {
            var n=document.f3.flightid3.value;
            if(Number(n))
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
        </script>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <
    </body>
</html>
