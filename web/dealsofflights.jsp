<%-- 
    Document   : dealsofflights
    Created on : 10-Sep-2017, 01:25:49
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deals</title>
    </head>
    <body>
        
        <br><br><br><br>
    <div align="center"><h1><font color="blue">Set/Update Deals of a flight</font></h1></div>
    <jsp:include page="header.jsp" />
    <form method="post" action="SetDeals" name="f7" onsubmit="return(valid());">
        <br><br><br><br><br>
         <div align="center">
                <font color="blue">Flight ID</font>
                <input type="number" id="fid7" name="flightid7" style="border: 2px solid darkblue; width:80px">
                <br><br><br>
                <font color="blue">Type </font><input list="typeclass7" type="text" style="border-color: blue;" name="tseven">
<datalist id="typeclass7" style="border-color: blue;">
    <option value="First Class"/>
    <option value="Business"/>
    <option value="Economy"/>
</datalist>
                &nbsp;&nbsp;&nbsp;
                <font color="blue">Food Deals </font><input list="typeclass8" type="text" style="border-color: blue;" name="teight">
<datalist id="typeclass8" style="border-color: blue;">
    <option value="Deal 1"/>
    <option value="Deal 2"/>
    <option value="Deal 3"/>
</datalist>
                
                &nbsp;&nbsp;&nbsp;
                <font color="blue">Movies Deals </font><input list="typeclass9" type="text" style="border-color: blue;" name="tnine">
<datalist id="typeclass9" style="border-color: blue;">
    <option value="Deal 1"/>
    <option value="Deal 2"/>
    <option value="Deal 3"/>
</datalist>
                <br><br><br>
                <input type="submit" name="submi" class="Button" value="Select" >
                <br><br><br>
                </div>
    </form>
    <script>
    function valid()
    {
         if(document.f7.tseven.value==="")
        {
            alert("You have not selected any type");
            return false;
        }
        if(document.f7.teight.value==="")
        {
            alert("You have not selected any food deal");
            return false;
        }
        if(document.f7.tnine.value==="")
        {
            alert("You have not selected any movie deal");
            return false;
        }
        if(document.f7.flightid7.value==="" )
        {
            alert("You have not selected ID");
            return false;  
        }
        else
        {
            var n=document.f7.flightid7.value;
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
    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
