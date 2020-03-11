<%-- 
    Document   : adminhome
    Created on : 10-Sep-2017, 13:47:13
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    
    <body>
        <br><br><br><br><br>
        <div align="center"><h1 style="color: blue"><b>Admin Page</b></h1></div>
       <jsp:include page="header.jsp" />
     <br><br><br>
     <div style="color: blue" align="center"><b>
     <%
		if (session != null) {
			if (session.getAttribute("FirstName") != null) {
				String name = (String) session.getAttribute("FirstName");
				out.print("Hello, " + name + "  Welcome to your Profile");
			} 
		}
	%>
     </b></div><br><br>
     <form method="post" action="Admin page" name="f14">
     
     
        <div align="center">
            <font color="blue"><b> Show list of seats</b><font>
            <br>
            <input type="submit" id="btnlog4" class="Button" value="Show" onClick="form.action='Listofseats.jsp'">
        <br><br><br>
        
        <font color="blue"><b> Check Availability of Flights</b><font>
        <br>
            <input type="submit" id="btnlog7" class="Button" value="Go" onClick="form.action='checkAvailability.jsp'">
        <br><br><br>
        <font color="blue"><b> Manage Deals of flights</b><font>
        <br>
            <input type="submit" id="btnlog8" class="Button" value="Manage" onClick="form.action='dealsofflights.jsp'">
        <br><br><br>
        <font color="blue"><b> Add a flights</b><font>
        <br>
            <input type="submit" id="btnlog9" class="Button" value="Add" onClick="form.action='flightaddition.jsp'">
        <br><br><br>
        <font color="blue"><b> Set Prices</b><font>
        <br>
            <input type="submit" id="btnlog10" class="Button" value="Set" onClick="form.action='setprices.jsp'">
        <br><br><br>
        <font color="blue"><b> Set seats</b><font>
        <br>
            <input type="submit" id="btnlog11" class="Button" value="Set" onClick="form.action='setseats.jsp'">
        <br><br><br>
         <font color="blue"><b> LogOut</b><font>
         <br></div></form>
     <div  align="center">
     <form method="post" action="Logout" name="f15" >
        <input type="submit" id="btnlog12" class="button button5" value="Log out">
        <br><br><br><br><br><br>
     </form>
     
     </div>
    
    </body>
</html>
