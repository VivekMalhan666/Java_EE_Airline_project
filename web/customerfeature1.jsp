<%-- 
    Document   : customerfeature1
    Created on : 09-Sep-2017, 01:55:02
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>calendar</title>
  

  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  
  $( function() {
    $( "#datepicker1" ).datepicker();
  } );
  </script>
</head>
<body>
    <jsp:include page="for main.jsp" />
    <br><br><br><br>
    <div align="center"><h1><font color="blue">Booking</font></h1></div>
    <div align="center">
 <form method="post" action="Booking" name="f" onsubmit="return(valid());">
    <br><br><br><br>
    <div align="center">
    <div>
        &nbsp;
        &nbsp;
        &nbsp;
        <font color="blue">Departure Date <input type="text" id="datepicker" name="cone" style="border-color: blue;">
        &nbsp;
         &nbsp;
         &nbsp;
         <font color="blue">Origin<font>
<input list="choose" type="text" style="border-color: blue;" name="listone"/>
<datalist id="choose" style="border-color: blue;">
  <option value="Abu Dhabi,UAE"/>
  <option value="Behrain,Behrain"/>
  <option value="Bangkok,Thailand"/>
  <option value="Barcelona,Spain"/>
  <option value="Beijing,China"/>
      <option value="Birmingham,UK"/>
      <option value="Copenhagen,Denmark"/>
          <option value="Delhi,India"/>
          <option value="Dammam,Saudi Arabia"/>
          <option value="Dhaka,Bangladesh"/>
          <option value="Doha,Qatar"/>
          <option value="Dubai,U.A.E"/>
          <option value="Faislabad,Pakistan"/>
          <option value="Karachi,Pakistan"/>
          <option value="Islamabad,Pakistan"/>
          <option value="Istanbul,Turkey"/>
          <option value="Jeddah,Saudi Arabia"/>
          <option value="Kabul,Afghanistan"/>
          <option value="Khuala Lumpur,Malaysia"/>
          <option value="Kuwait,Kuwait"/>
          <option value="Bradfort,Uk"/>
          <option value="London,Uk"/>
          <option value="Medina,Saudi Arabia"/>
          <option value="Milan,Italy"/>
          <option value="Mumbai,India"/>
          <option value="Muscat,Oman"/>
          <option value="Najaf,Iraq"/>
          <option value="Oslo,Norway"/>
          <option value="Paris,France"/>
          <option value="Quetta,Pakistan"/>
          <option value="Riyadh,Saudi Arabia"/>
          <option value="Sharja,U.A.E."/>
          <option value="Sialkot,Pakistan"/>
          <option value="Tokyo,Japan"/>
          <option value="Toronto,Canada"/>
          <option value="Zhob,Pakistan"/>

      
</datalist>    

        &nbsp;
         &nbsp;
         &nbsp;
         
 </div>
    
    <br>
    <br>
    <br>
    <br>
    
    <div>
        &nbsp;
         &nbsp;
         &nbsp;
 <font color="blue">Arrival Date <input type="text" id="datepicker1" style="border-color: blue;" name="ctwo">
        &nbsp;
         &nbsp;
         &nbsp;
         
<font color="blue">Destination<font>
<input list="choose2" type="text" style="border-color: blue;" name="citytwo"/>
<datalist id="choose2" style="border-color: blue;">
  <option value="Abu Dhabi,UAE"/>
  <option value="Behrain,Behrain"/>
  <option value="Bangkok,Thailand"/>
  <option value="Barcelona,Spain"/>
  <option value="Beijing,China"/>
      <option value="Birmingham,UK"/>
      <option value="Copenhagen,Denmark"/>
          <option value="Delhi,India"/>
          <option value="Dammam,Saudi Arabia"/>
          <option value="Dhaka,Bangladesh"/>
          <option value="Doha,Qatar"/>
          <option value="Dubai,U.A.E"/>
          <option value="Faislabad,Pakistan"/>
          <option value="Karachi,Pakistan"/>
          <option value="Islamabad,Pakistan"/>
          <option value="Istanbul,Turkey"/>
          <option value="Jeddah,Saudi Arabia"/>
          <option value="Kabul,Afghanistan"/>
          <option value="Khuala Lumpur,Malaysia"/>
          <option value="Kuwait,Kuwait"/>
          <option value="Bradfort,Uk"/>
          <option value="London,Uk"/>
          <option value="Medina,Saudi Arabia"/>
          <option value="Milan,Italy"/>
          <option value="Mumbai,India"/>
          <option value="Muscat,Oman"/>
          <option value="Najaf,Iraq"/>
          <option value="Oslo,Norway"/>
          <option value="Paris,France"/>
          <option value="Quetta,Pakistan"/>
          <option value="Riyadh,Saudi Arabia"/>
          <option value="Sharja,U.A.E."/>
          <option value="Sialkot,Pakistan"/>
          <option value="Tokyo,Japan"/>
          <option value="Toronto,Canada"/>
          <option value="Zhob,Pakistan"/>

      
</datalist>                                   
        
        &nbsp;
         &nbsp;
         &nbsp;
    
   

    </div>
    <br>
    <br>
    <br><br>
   <font color="blue"> No of people travelling : </font><input type="number" id="one" name="numone" style="border-color: blue;">
   <br><br><br><br>
   
   
    </div>
    
    
    </form>
    
    <input type="submit" name="single1" class="Button" value="Search" >
    <br><br><br>
    </div>
    <div align="center">
    <button class="Button" type="button" onclick="loadDoc()"> Find your Route!!</button>
    </div>>
<br/>
<br/>
<div id="demo">
    <br><br><br><br><br>
    
    
    <script>
        function valid()
        {
        if(document.f.numone.value==="" )
        {
            alert("You have not selected number of people");
            return false;
        }
        
        else if(document.f.cone.value==="")
        {
            alert("You have not selected any date");
            return false;
        }
        
        else if(document.f.listone.value==="")
        {
            alert("You have not selected any city");
            return false;
        }
        
        else if(document.f.ctwo.value==="")
        {
            alert("You have not selected any date");
            return false;
        }
         else if(document.f.citytwo.value==="")
        {
            alert("You have not selected any city");
            return false;
        }
       
        else
        {
            var nn=document.f.numone.value;
            
            if(Number(nn))
            {
            return true;
            }
            else
            {
                alert("Number of people required ");
                return false;
            }
        
        }
        }
        function loadDoc()
    {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function()
        {
            if (xhttp.readyState === 4 && xhttp.status === 200)
            {
                document.getElementById("demo").innerHTML = xhttp.responseText;
            }
        };
        xhttp.open("GET", "map.jsp", true);
        xhttp.send();
    }
        </script> <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>

</html>