<%-- 
    Document   : newjsp
    Created on : 09-Sep-2017, 23:56:01
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <title>header</title>
        <style>
            /*header*/
ul {
    list-style-type: none;
    
    background-color:darkblue;
    padding : 0;
    position: absolute; 
    top: 0;
    width: 100%;
    right:0;
}

li {
    float: left;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 30px 25px;
    text-decoration: none;
    width: 150px;
   
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: lightskyblue;
    
}


/*footer*/
footer {
    width: 100%;
    border: 10px #333;
    background-color: darkblue;
    color: white;
    text-align: center;
    position: fixed;
    bottom: 0;
    right: 0;
    padding: 25px 20px;
     display: inline-block;
     
     overflow: hidden;
}

a {
    padding: 25px 20px;
    color: white;
    text-decoration: none;
    width: 100%;
   
}

.Button{
       
        border-radius: 2px;
        background-color:  darkblue;
        color: white;
        font-weight: bold;
        box-shadow: 1px 2px 4px 0 rgba(0, 0, 0, 0.08);
        padding: 10px 40px;
        border: 0;
        margin: auto;
        display: inline;
        cursor: pointer;
        visibility:visible;
    }  
    
    .button 
    {
    background-color: darkblue; 
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    
}
.button5 {border-radius: 50%;}
            </style>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       
        <div> 
            
            <ul>
                
   <li style="list-style-type: none;
    overflow: hidden;
    background-color:darkblue;	;padding: 0; margin-left: 150px"><a href="header.jsp" ><b>Home</b></a></li>
   <li><a href="customerfeature1.jsp"><b>Booking</b></a></li>
   <li><a href="aboutus.jsp" ><b>About Us</b></a></li>
  <li><a href="contact Us.jsp" ><b>Get in touch</b></a></li>
   <li><a href="experience.jsp" ><b>Experience</b></a></li>
   
          </ul>
           <br><br><br><br><br>
      <div align="center">
           <form method="post" action="Logout" name="f15" >
        <input type="submit" id="btnlog12" class="button button5" value="Log out">
        
     </form></div>
           </div>
        
        <div>
        <footer>
            
            
          <div >
           <a><b> &copy; airblue 2017</b></a> 
           <a  href="privacypolicy.jsp"><b>Privacy Policy</b></a>
          <a href="terms_cond.jsp" ><b>Terms and Conditions</b></a>
						
							<a  href="https://www.facebook.com/airblueprivatelimited/" <%--class="icon rounded fa-facebook"--%>>
                            <span class="fa fa-facebook-official" style="font-size:48px"></span></a>
						
                            &nbsp;&nbsp;&nbsp;
						
							<a href="https://twitter.com/airblueairline?lang=en" <%--class="icon rounded fa-twitter"--%>>
                                <span class="fa fa-twitter-square" style="font-size:48px;color:white"></span></a>
                                
					
						
					
				</div>
            
        </footer>
        </div>
        
    </body>
</html>
