<%-- 
    Document   : flightaddition
    Created on : 10-Sep-2017, 00:41:07
    Author     : Raghda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add flight</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker3" ).datepicker();
  } );
  
  $( function() {
    $( "#datepicker4" ).datepicker();
  } );
  </script>
</head>
<body>
   
    
    <div align="center"><h1><font color="blue">Flight Addition</font></h1></div>
    <jsp:include page="for main.jsp" />
 <form method="post" action="Add" name="f5" onsubmit="return(validate());">
    <br><br><br><br>
    <div align="center">
    <div>
        &nbsp;
        &nbsp;
        &nbsp;
        <font color="blue">Departure Date <input type="text" id="datepicker3" name="cthree" style="border-color: blue;">
        &nbsp;
         &nbsp;
         &nbsp;
         <font color="blue">Origin<font>
<input list="choose1" type="text" style="border-color: blue;" name="listthree"/>
<datalist id="choose1" style="border-color: blue;">
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
 <font color="blue">Arrival Date <input type="text" id="datepicker4" style="border-color: blue;" name="cfour">
        &nbsp;
         &nbsp;
         &nbsp;
         
<font color="blue">Destination<font>
<input list="choose4" type="text" style="border-color: blue;" name="cityfour"/>
<datalist id="choose4" style="border-color: blue;">
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
   <font color="blue"> Flight ID </font><input type="number" id="ffff" name="ffff" style="border-color: blue;">
   <font color="blue"> Flight name </font><input type="text" id="fffff" name="namee" style="border-color: blue;">
   
   <br><br><br><br>
   <input type="submit" name="s" class="Button" value="Add" >
   
    </div>
    <br><br><br><br><br><br>
    </form>
    
    
    <script>
        function validate()
        {
        if(document.f5.ffff.value==="" )
        {
            alert("You have not selected flight id");
            return false;
        }
        if(document.f5.namee.value==="" )
        {
            alert("You have not selected flight name");
            return false;
        }
        else if(document.f5.cthree.value==="")
        {
            alert("You have not selected any date");
            return false;
        }
        
        else if(document.f5.listthree.value==="")
        {
            alert("You have not selected any city");
            return false;
        }
        
        else if(document.f5.cfour.value==="")
        {
            alert("You have not selected any date");
            return false;
        }
         else if(document.f5.cityfour.value==="")
        {
            alert("You have not selected any city");
            return false;
        }
        
        else
        {
            var nn=document.f5.ffff.value;
            
            if(Number(nn))
            {
            return true;
            }
            else
            {
                alert("invalid ");
                return false;
            }
        
        }
        }
        </script><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>

</html>
