<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

    .bb {
    
        background-color:white;
    }
    .bb:focus {
      background-color: yellow;
    }
   .ss {
        background-color:lightgreen;
   
   }
   .rr {
    font-weight:bold;
   }
   .b {
       background-color:green;
     color:white;
   }
   



</style>
<body>
<form action="marklist" method="post">
<table border="1" width="300px">
    <tr><th class="ss">SUBJECT</th>
        <th class="ss">MARKS</th></tr>
        <tr><td class="rr">STUDENT</td><td><input type="text" name="nn" class="bb"></td></tr>
        <tr><td class="rr">DOB</td><td><input type="Date" name="n" class="bb"></td></tr> 
        <tr><td class="rr">REG NO</td><td><input type="text" name="n1" class="bb"></td></tr>    
        <tr><td class="rr">Tamil</td><td><input type="text" name="n2" class="bb"></td></tr>
        <tr><td class="rr">English</td><td><input type="text" name="n3" class="bb"></td></tr>
        <tr><td  class="rr">MATHS</td><td><input type="text" name="n4" class="bb"></td></tr>
        <tr><td class="rr">SCIENCE</td><td><input type="text" name="n5" class="bb"></td></tr>
        <tr><td class="rr">SOCIALSCIENCE</td><td><input type="text" name="n6" class="bb"></td></tr>
</table>     
     <br><br>
     <input type="submit" class="b">


</form>

</body>
</html>