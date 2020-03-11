<%-- 
    Document   : Signup
    Created on : Oct 21, 2017, 6:35:09 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
 <style>
  input[type=text] {
    border: 2px solid blue;
    border-radius: 4px;
}a:link {
padding : 10px;
    font-size : 25px;
    color: blue; 
    background-color: transparent; 
    text-decoration: none;
}
   body  {
margin-top : 125px;
}

    p{
        color : white;
            top: 424px;
            left: 69px;
            height: 4px;
            width: 1084px;
        }
</style>


</head>
<body background="C:\Users\hp\Desktop\Project Images\qwerty.jpg" >

<a href="home.html">Home</a> | <a href="FeaturesCus.html">Explore</a> | <a href="FirstClass.html">First Class</a> | <a href="BusinessClass.html">Business Class</a> |<a href="EconomyClass.html">Economy Class</a>| <a href="Login.html">Sign In</a>| <a href="Signup.html">Sign Up</a>

<h1 style =" color :blue ; font-size : 75px ;" >
       Register Now !!</h1>
<form action="sign" method="post">
<center>
       <div style ="background-color:white;color:blue;padding:20px;margin-left:380px;margin-right:380px">
        <br />
        First Name :<input type="text" name="fname">  <br /> <br />
        Last Name : <input type="text" name="lname"> <br /> <br />
		Email : <input type="text" name="email">  <br /> <br />
        Password : <input type="text" name="pswd"> <br /> <br />
        Again Password : <input type="text" name="Source5"> <br /> <br />      
    
        Contact Number : <input type="text" name="contactno">  <br /> <br />
        Credit Card Number : <input type="text" name="ccno">  <br /> <br />
        <input type="submit" value="Submit">
        </div>
        </center>  
    </form>
   
  
  
    <script type="text/javascript">

            function signUpValidator() {

            var password2 = document.getElementById("fname").value;
            var password1 = document.getElementById("lname").value;
            var email = document.getElementById("email").value;
            var email1 = document.getElementById("pswd").value;
            var password11 = document.getElementById("Source5").value;
            var password21 = document.getElementById("contactno").value;

            var email11 = document.getElementById("ccno").value;
            // for empty fields
            if (email == "" || password1 == ""
                || password2 == "" || email1 == "" || password11 == ""
                || password21 == "" || email111 == "" ) {
                alert("Please fill all fields");
                return false;
            }

            // validating email
            emailVal = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([com\co\.\in])+$/;
            if (!email.match(emailVal)) {
                alert('Email Address not valid');
                return false;
            }

            // validating password
            if (email1.length < 8) {
                alert("Password must be at least 8 characters long");
                return false;
            }
            if (email1 != password11) {
                alert("Passwords don't match");
                return false;
            }
            return true;
        }
    </script>


</body>
</html>

