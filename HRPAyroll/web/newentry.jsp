<%-- 
    Document   : newentry
    Created on : Jul 24, 2017, 9:34:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%);padding-bottom:190px; } 
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
            
            .parallax {
    /* The image used */
 //   background-image: url("resources/img/background.jpg");

    /* Set a specific height */
    min-height: 500px; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
h1{color:skyblue;}
        </style>
    </head>
    <body>
        <center> <h1>NEW ENTRY</h1>
       	<div class="parallax">
            <form action="WriteData1" method="get">
            Enter your id:
            <input type="text" name="eid" placeholder="Enter your eid" /><br>
            <h2>Personal Info:</h2>
            Enter your Name:
            <input type="text" name="ename" placeholder="Enter your name"/><br><br>
            Enter your contact:
            <input type="text" name="econt" placeholder="Enter your contact"/><br><br>
            Enter your email:
            <input type="text" name="eemail" placeholder="Enter your email"/><br><br>
            Enter your address:
            <input type="text" name="eadd" placeholder="Enter your address"/><br><br>
            <h2>Professional Info:</h2>
            Enter your qualification:
            <input type="text" name="equal" placeholder="Enter your qualification"/><br><br>
            Enter your designation:
            <input type="text" name="edesg" placeholder="Enter your designation"/><br><br>
            Enter your salary:
            <input type="text" name="esal" placeholder="Enter your salary"/><br><br>
            <input type="submit" value="Register"/>
        </form></center>
</div>
    </body>
</html>
