<%-- 
    Document   : managerapprove
    Created on : 09-Sep-2017, 01:29:52
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/r.css" rel="stylesheet" type="text/css"/>
        <title>List Of Seats</title>
        
    </head>
    <body>
        
     <br><br><br><br><br>
     <form method="post" action="Manager page" name="f9">
     
     <div align="center"><h1 style="color: blue"><b>Manager Page</b></h1></div>
        <jsp:include page="header.jsp" />
        <br><br><br><br>
        <div style="color: blue" align="center"><b>
        <%
		if (session != null) {
			if (session.getAttribute("FirstName") != null) {
				String name = (String) session.getAttribute("FirstName");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} 
		}
	%>
            </b></div>
            <br><br><br><br>
     <div align="center"><font color="blue">List of Seats added by Admin  </font>
         <br><br><br>
         <input type="submit" id="btnlog" class="Button" value="Show" onClick="form.action='Listofseats.jsp'"/>
         <br><br><br>
        <font color="blue">Approve deals  </font>
        <br><br><br>
        <input type="submit" id="btnlog2" class="Button" value="Show" onClick="form.action='approvedeals.jsp'"/>
         <br><br><br>
                <font color="blue">Approve price  </font>
        <br><br><br>
        <input type="submit" id="btnlog2" class="Button" value="Show" onClick="form.action='approveprice.jsp'"/>
         <br><br><br>
                <font color="blue">Approve seats  </font>
        <br><br><br>
        <input type="submit" id="btnlog2" class="Button" value="Show" onClick="form.action='approveseats.jsp'"/>
         <br><br><br>
         <font color="blue"> Logout   </font>
      
     </div>
         
     </form>
     <div align="center">
     <form method="post" action="Logout" name="f15" >
        <input type="submit" id="btnlog12" class="button button5" value="Log out">
        <br><br><br><br><br><br></div>
     </form>
     
     <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
