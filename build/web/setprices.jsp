<%-- 
    Document   : setprices
    Created on : 09-Sep-2017, 23:35:07
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/r.css" rel="stylesheet" type="text/css"/>
        <title>Set Prices</title>
        <style>
        table, th, td {
                      border: 1px solid darkblue;
                      
                      }
                      input[type=number] {
    width:100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid darkblue;
    border-radius: 4px;
}

    
   

        </style>
    </head>
    <body>
       
     <br><br><br><br><br><br>
         
        <table> 
            <form method="post" action="SetPrices" name="f1" onsubmit="return(valid1());">

            <div align="center"><h1 style="color: blue"><b>Set/Update prices</b></h1></div> <jsp:include page="header.jsp" />
         <div align="center">
                <font color="blue">Flight ID</font>
                <input type="number" id="fid2" name="flightid2" style="border: 2px solid darkblue; width:80px">
         </div>
         <table align="center">
  <tr>
    <th height="60px" width="120px">Types of Seats</th>
    <th height="60px" width="120px">Enter Values</th>
    
  </tr>
  <tr>
    <td height="60px">First Class</td>
    <td height="60px">
        <input type="number" id="one" name="numone"></td>
    
  </tr>
  <tr>
    <td height="60px">Business</td>
    <td height="60px"> <input type="number" id="two" name="numtwo"> </td>
   
  </tr>
  <tr>
    <td height="60px">Economy</td>
    <td height="60px"> <input type="number" id="three" name="numthree"></td>
   
  </tr>
</table>
            </div>
            <br><br><br><br>
  <div align="center"> <input type="submit" name="single1" class="Button" value="Set" ></div>
             
            </form>
         <br><br>
         
         
         <div align="center"><h1 style="color: blue"><b>Update prices</b></h1></div>
          <form method="post" action="UpdatePrices" name="f2" onsubmit="return(valid2());">
              <br><br><br><br><br>
         <div align="center">
                <font color="blue">Flight ID</font>
                <input type="number" id="fid7" name="flightid8" style="border: 2px solid darkblue; width:80px">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <font color="blue">Type </font><input list="typeclass7" type="text" style="border-color: blue;" name="teight">
<datalist id="typeclass7" style="border-color: blue;">
    <option value="First Class"/>
    <option value="Business"/>
    <option value="Economy"/>
</datalist>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <font color="blue">Price</font>
              <input type="number" id="twoo" name="numtwoo" style="border: 2px solid darkblue; width:80px">  
         </div>
              <br><br><br><br>
  <div align="center"> <input type="submit" name="single2" class="Button" value="Update" ></div>
         </form>
            <br><br><br><br><br><br><br>
            <script>
        function valid1()
        {
        if(document.f1.numone.value==="" )
        {
            alert("You have not selected price");
            return false;
           
        }
        
        else if(document.f1.numtwo.value==="" )
        {
            alert("You have not selected price");
            return false;
           
        }
        
       else if(document.f1.numthree.value==="" )
        {
            alert("You have not selected price");
           return false;
        }
        else if(document.f1.flightid2.value==="" )
        {
            alert("You have not selected id");
           return false;
        }
        else
        {
            var nn=document.f1.numone.value;
            var nnn=document.f1.numtwo.value;
            var nnnn=document.f1.numthree.value;
            var nnnnn=document.f1.flightid2.value;
            if(Number(nn) && Number(nnn) && Number(nnnn) && Number(nnnnn))
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
        function valid2()
        {
            if(document.f2.teight.value==="" )
        {
            alert("You have not selected type");
            return false;
           
        }
        else if(document.f2.flightid8.value==="" )
        {
            alert("You have not selected flight id");
            return false;
           
        }
        else if(document.f2.numtwoo.value==="" )
        {
            alert("You have not selected price");
            return false;
           
        }
        else
        {
            var nn=document.f2.teight.value;
            var nnn=document.f2.flightid8.value;
            var nnnn=document.f2.numtwoo.value;
           
            if( Number(nnn) && Number(nnnn) )
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
