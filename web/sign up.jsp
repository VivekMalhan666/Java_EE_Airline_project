<%-- 
    Document   : sign up
    Created on : 10-Sep-2017, 19:35:59
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <style>
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
    j {
    width: 250px;
    height: 300px;
    background-color: lightblue;

    position: absolute;
    top:0;
    bottom: 0;
    left: 0;
    right: 0;

    margin: auto;
}
            </style>
    </head>
    <body>
        <br><br><br>
     
     <div align="center"><h1 style="color: blue"><b>Create an Account</b></h1></div>
            <form  method="post" action="Signup">
<div align="center">
    <j>
        <br>
                <div>
                    <label>
                        <span>First Name</span>
                        <input type="text" name="fname"  pattern="[A-Za-z]+" required title="Alphabets Only">
                              
                        
                    </label>
                    <br><br>
                </div>
                
                <div>
                    <label>
                        <span>Last Name</span>
                        <input type="text" name="lname"  pattern="[A-Za-z]+" required title="Alphabets Only">
                        
                    </label>
                    <br><br>
                </div>

                <div>
                    <label>
                        <span>Email</span>
                        <input type="email" name="email" required>
                    </label>
                    <br><br>
                </div>

                <div>
                    <label>
                        <span>Password</span>
                        <input type="password" name="password" required>
                    </label>
                    <br><br>
                </div>
                
                 <div>
                    <label>
                        <span>Contact</span>
                        <input type="number" name="contact" min="0" step="1" required>
                    </label>
                     <br><br>
                </div>
                <div>
                    <label>
                        <span>Credit Card Number</span>
                        <input type="number" name="credit">
                    </label>
                     <br><br>
                </div>
                <div >
                    <label>
                        <input type="checkbox" name="checkbox" required>
                        <span>I agree to the <a href="t.jsp">terms and conditions</a></span>
                    </label>
                    <br><br>
                </div>

                <div>
                    <button id="B" type="submit" class="Button" >SignUp</button>
                </div>
          </j>
    <div align="center"><a href="login.jsp">Already have an account? Login here &rarr;</a> </div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
          
            <br> <br><br>
   </div>   
    </form>       
    
    <br> <br> <br>
    

    </body>
</html>
