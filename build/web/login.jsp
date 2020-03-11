<%-- 
    Document   : Home
    Created on : 10-Sep-2017, 18:43:42
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
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
    height: 280px;
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
     
     <div align="center"><h1 style="color: blue"><b>Login</b></h1></div>
     
     
        <div align="center" >
            <j>
                <br><br>
           <form method="post" action="Login" name="f17" onsubmit="return(valid());">
               
               <br><br>
               <font color="blue"><b> Email</b></font>
            <br>
            <input type="email" name="email" style="border-color: blue;" required>
            <br><br><br>
            <font color="blue"><b> Password</b></font>
            <br>
            <input type="password" id="passwordid" name="passwordname" style="border-color: blue;">
            <br><br><br>
            <input type="submit" id="one1" class="Button" value="login" >
            <br><br><br>
            
               </form>
                </j>
            <div align="center"><a href="sign up.jsp">New? Sign up here &rarr;</a> </div>
            </div>
    
              
          
                
     <script>
         function valid()
        {
        if(document.f17.textname.value==="" )
        {
            alert("empty!!");
            return false;  
        }
        
            if(document.f17.passwordname.value==="" )
        {
            alert("empty!!");
            return false;  
        }
        if(document.f17.passwordname.value.length<7 ||document.f17.passwordname.value.length>15 )
        {
            alert("your password length must be between 8-14 characters");
            return false;
        }
        
    }
    
        </script>
    </body>
</html>
