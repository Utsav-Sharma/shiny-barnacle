<%-- 
    Document   : index
    Created on : Jul 24, 2017, 9:33:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
                        h1{color:skyblue;}

        .a{height: 50px;width: 160px;}
        body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%);padding-bottom:130px; }
        </style>
        
    </head>
    <body>
        <center><h1>PAYROLL MANAGEMENT SYSTEM</h1></center>
    <center>    <form><a href="newentry.jsp"> <input type="button" class="a" value="NEW ENTRY"/></a> </from></center><br><br>
    
    
    <center>    <form><a href="list.jsp"> <input type="button" class="a" value="LIST OF EMPLOYESS"/></a> </from></center><br><br>
    <center>    <form><a href="search.jsp"> <input type="button" class="a" value="SEARCH RECORD"/></a> </from></center><br><br>
    <center>    <form><a href="edit.jsp"> <input type="button" class="a" value="EDIT PROFILE"/></a> </from></center><br><br>
    <center>    <form><a href="#"> <input type="button" class="a" value="SALARY SLIP"/></a> </from></center><br><br>
    
      <center><button onclick="closeWin()" class="a">EXIT</button></center>
      <script>
          function closeWin() {
    window.close();
}

      </script>
    </body>
</html>
