<%-- 
    Document   : approvedissaprove
    Created on : 09-Sep-2017, 01:24:22
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/r.css" rel="stylesheet" type="text/css"/>
        <title>Approve/disapprove</title>
        
    </head>
    <body><br><br><br><br><br><br><div align="center"><h1 style="color: blue"><b>Approve/Disapprove By Manager</b></h1></div>
        <jsp:include page="header.jsp" />
     
     <form method="post" action="GetPrice" name="f77" onsubmit="return(valid());">
         <br><br><br><br><br>
         <div align="center">
                <font color="blue">Flight ID</font>
                <input type="number" id="fid77" name="flightid77" style="border: 2px solid darkblue; width:80px">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" id="onee" class="Button" value="Get Price"/>
                <br><br><br>
                <font color="blue">Price of Firstclass:</font>  
                <input type="number" id="fid88" name="flightid88" value="${fn:escapeXml(firstclass.price)}" style="border: 2px solid darkblue; width:80px">
               <br><br><br>
                <font color="blue">Price of Buisness:</font>
                <input type="number" id="fid888" name="flightid888" value="${fn:escapeXml(buisness.price)}" style="border: 2px solid darkblue; width:80px">
                <br><br><br>
                <font color="blue">Price of Economy:</font>
                <input type="number" id="fid8888" name="flightid8888" value="${fn:escapeXml(economy.price)}" style="border: 2px solid darkblue; width:80px">
         </div>
        </form>
        <div align="center">
        <form method="post" action="Approve" name="f88" >
     
         <br><br><br>
         <font color="blue">Flight ID to approve</font>
         <input type="number" id="fid77" name="flightid777" style="border: 2px solid darkblue; width:80px">
                
     <input type="submit" id="zero" class="Button" value="Approve"/>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     </form>
            <form method="post" action="Disapprove" name="f99" >
     
         <br><br><br>
         <font color="blue">Flight ID to disapprove</font>
         <input type="number" id="fid77" name="flightid7777" style="border: 2px solid darkblue; width:80px">
                
     <input type="submit" id="one" class="Button" value="Disapprove" />
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     </form>
   </div>

       <script>
           function valid()
        {
           if(document.f77.flightid77.value==="" )
        {
            alert("You have not selected flight ID");
            return false;
           
        }
        
        var nn=document.f77.flightid77.value;
        if(Number(nn))
            {
                
            return true;
            }
            else
            {
                alert("Invalid");
                return false;
            }
        }
           </script>
         
         <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
   
    
    </body>
</html>

