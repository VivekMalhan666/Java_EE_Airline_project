<%-- 
    Document   : main
    Created on : 10-Sep-2017, 21:40:29
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>main</title>
        <style>
body, html {
    height: 100%;

}
.parallax {
    /* The image used */
    background-image: url('images/q.gif');

    /* Full height */
    height: 100%; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
.parallax1 {
    /* The image used */
    background-image: url('images/r.gif');

    /* Full height */
    height: 100%; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
.parallax2 {
    /* The image used */
    background-image: url('images/s.gif');

    /* Full height */
    height: 100%; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
.parallax3 {
    /* The image used */
    background-image: url('images/t.gif');

    /* Full height */
    height: 100%; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
    </head>
    <body>
        <jsp:include page="for main.jsp" />
        <br>
       
        <div style="color: blue" align="center"><b>
        <%
		if (session != null) {
			if (session.getAttribute("FirstName") != null) {
				String name = (String) session.getAttribute("FirstName");
				out.print("Hello, " + name + "  Welcome to your Profile");
			} 
		}
	%>
            </b></div>
        <div class="parallax"></div>
       
        <div style="background-color: lightblue; height:500px;">
            <font color="white" size="350px"><b>An all-new interactive travel experience</b><font>
            <br>
            There's more than meets the eye with our new amenity kits in Economy Class, available on select flights. Play our new augmented reality game airblue Destination Dash. Solve the puzzles to travel across all 6 continents, and scan your amenity kit on board to unlock a secret level.
          <br> 
            <br>
            </div>
        <div class="parallax"></div>
        
        <div style="background-color: lightblue; height:500px;">
            <font color="white" size="350px"><b>Visit the world’s newest theme parks</b><font>
            <br>
            Take your next family vacation in Dubai with our special fares and enjoy non-stop adventure.
           <br> 
            <br>
            </div>
         <div class="parallax1"></div>
         <div style="background-color: lightblue; height:500px;">
            <font color="white" size="350px"><b>Spend your Miles at Dubai Duty Free</b><font>
            <br>
           Make your airport experience more rewarding and use your airblue token to pay for fashion accessories, perfume, gadgets and more at participating stores at all Dubai airports. Start redeeming from just 4,500 airblue Miles, which will give you AED 75 to spend instantly at the checkout.
           <br> 
            <br>
            </div>
         
         <div class="parallax3"></div>
         <div style="background-color: lightblue; height:500px;">
            <font color="white" size="350px"><b>Earn 3,000 bonus Miles with Rocketmiles</b><font>
            <br>
            Airblue Skywards members can now enjoy 3,000 bonus Skywards Miles when they book their first stay at over 400,000 hotels worldwide with our partner Rocketmiles
          <br> 
          
            <br>
            </div>
         <div class="parallax2"></div>
    </body>
</html>
