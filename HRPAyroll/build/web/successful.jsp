<%-- 
    Document   : successful
    Created on : Jul 24, 2017, 9:57:55 PM
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
                    body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%);padding-bottom:600px; } 
       
    
            
        </style>
    </head>
    <body>
    <center> <h1>Employee Registered Successfully!!</h1></center>
    <center> <table border="1">
            <tr>
                <th>
                   Employee ID:
                </th>
                <th>
                    Name:
                </th>
           <th>
                  contact:
                </th>
          <th>
                  E-Mail:
                </th>
          <th>
                  Address:
                </th>
          <th>
                  Qualification:
                </th>
          <th>
                  Designation:
                </th>
          <th>
                  Salary:
                </th>
          
            </tr>
            <tr>
                
                <td>
                    <% 
                out.println(    request.getParameter("eid"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("ename"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("econt"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("eemail"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("eadd"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("equal"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("edesg"));
                    %>
                </td>
                <td>
                    <% 
                out.println(    request.getParameter("esal"));
                    %>
                </td>
            </tr>
        </table><br><br></center>
    <center><a href="index.jsp"><input type="button" value="Home"/></a>
    <a href="list.jsp"><input type="button" value="Employee List"/></a></center>
    </body>
</html>
