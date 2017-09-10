<%-- 
    Document   : search
    Created on : Aug 24, 2017, 11:14:25 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               <title>Search Employee</title>
   <style>
        body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%);padding-bottom:190px; 
        padding-bottom:1000px;} 
            form {
	background: rgba(45, 45, 125, 0.68);
	color: white;
	padding: 40px;
	margin-top: 100px;
	padding-bottom: 80px;
	width:250px;
        opacity:0.9;
        box-shadow: 10px 10px 5px rgba(6, 1, 1, 0.43)
        
            }
            h1{color:skyblue;}
   </style>
    </head>
    <body>
    <center>    <h1>SEARCH EMPLOYEE</h1>
    <form action="Find" method="get">
        UserName:<input type="text" name="ename"><br><br>
           
    <button>Search</button>
    <br></br>

        </form></center>
    </body>
</html>
