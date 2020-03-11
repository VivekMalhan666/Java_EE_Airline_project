<%-- 
    Document   : payment
    Created on : 10-Sep-2017, 17:16:20
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
    </head>
    <body>
         
     <br><br><br><br><br>
     
     <div align="center"><h1 style="color: blue"><b>Payment Page</b></h1></div><jsp:include page="for main.jsp" />
        <div align="center">
            <form method="post" action="payment" name="f16" onsubmit="return(valid());">
     
            <font color="blue"> Enter Credit Card Number</font>
               <input type="number" id="fid16" name="flightid16" style="border: 2px solid darkblue; width:80px">
              <br><br><br>
              <font color="blue">Amount</font>
               <input type="number" id="aid16" name="a16" style="border: 2px solid darkblue; width:80px">
             <br><br><br>
             <font color="blue">Enter CVV</font>
               <input type="number" id="cvid16" name="cv16" style="border: 2px solid darkblue; width:80px">
             <br><br><br>
               </form>
            <img src="images/images.jpg" alt="Credit Card" >
            <br><br>
            <input type="submit" id="pp" class="Button" value="Pay" onClick="form.action='Transaction.jsp'"/></div>
    
         
   <script>
         function valid()
        {
            var number=0;
            number=document.f15.flightid15.value;
            var regex = new RegExp("^[0-9]{16}$");
    if (!regex.test(number))
    {
        alert("invalid");
        return false;
    }
        

    return luhnCheck(number);
            
        if(document.f15.flightid15.value==="" )
        {
            alert("You have not selected ID");
            return false;  
        }
        else if(document.f15.p15.value==="" )
        {
            alert("You have not selected no of people");
            return false;  
        }
        
        else
        {
            var n=document.f15.flightid15.value;
            var nn=document.f15.p15.value;
            if(Number(n) && Number(nn) )
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
    function luhnCheck(val) {
    var sum = 0;
    for (var i = 0; i < val.length; i++) {
        var intVal = parseInt(val.substr(i, 1));
        if (i % 2 === 0) {
            intVal *= 2;
            if (intVal > 9) {
                intVal = 1 + (intVal % 10);
            }
        }
        sum += intVal;
    }
    return (sum % 10) === 0;
}
    </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>
