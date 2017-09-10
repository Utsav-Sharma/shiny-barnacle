<%-- 
    Document   : list
    Created on : Jul 25, 2017, 2:13:53 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <style>
            H1{color: skyblue;}
            body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%) } 
        </style>
    </head>
    <body>
        <%@page import="java.sql.DriverManager"%>
        <%@page import="java.sql.ResultSet"%>
        <%@page import="java.sql.Statement"%>
        <%@page import="java.sql.Connection"%>

        <%

       
            String dbName = "payroll";
            Connection con;
            Statement st;
            ResultSet resultSet = null;
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con = DriverManager.getConnection("jdbc:odbc:pay");
         
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        %>
        <h1 align="center"><font><strong>Employee List</strong></font></h1>
        <table align="center" cellpadding="5" cellspacing="5" border="1">
            <tr>

            </tr>
            <tr bgcolor="#A52A2A">
                <td><b>ID</b></td>
                <td><b>NAME</b></td>
                <td><b>CONTACT</b></td>
                <td><b>MAIL</b></td>
                <td><b>ADDRESS</b></td>
                <td><b>QUALIFICATION</b></td>
                <td><b>DESIGNATION</b></td>
                <td><b>SALARY/b></td>
            </tr>
            <%    try {
                    con = DriverManager.getConnection("jdbc:odbc:pay");
                    st = con.createStatement();
                    String sql = "SELECT * FROM emp";

                    resultSet = st.executeQuery(sql);
                    while (resultSet.next()) {
            %>
            <tr> <!--bgcolor="#DEB887"-->

                <td><%=resultSet.getString("id")%></td>
                <td><%=resultSet.getString("name")%></td>
                <td><%=resultSet.getString("contact")%></td>
                <td><%=resultSet.getString("email")%></td>
                <td><%=resultSet.getString("addr")%></td>
                <td><%=resultSet.getString("qualification")%></td>
                <td><%=resultSet.getString("designation")%></td>
                <td><%=resultSet.getString("salary")%></td>

            </tr>

            <%
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table><br><br>
        <center><a href="index.jsp"><input type="button" value="Home"/></a></center>
    </body>
</html>