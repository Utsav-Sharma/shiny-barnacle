/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package write;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class Find extends HttpServlet {

    

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
             resp.setContentType("text/html;charset=UTF-8");
        String ename=req.getParameter("ename");
        PrintWriter wr=resp.getWriter();
        Connection con;
Statement st;
ResultSet rs;

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:pay");
st=con.createStatement();
rs=st.executeQuery("select * from emp where name='"+ename+"'");

while(rs.next())
{
   wr.print("<html><body style='background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%)'>");
               
              wr.print("<table  align='center'><tr style='background:Cyan'>");
              wr.print("<th>eid</th>");
              wr.print("<th>Username</th>");
              wr.print("<th>Contact</th>");
              wr.print("<th>Email</th>");
              wr.print("<th>Address</th>");
              wr.print("<th>Designation</th>");
              wr.print("<th>Basic Salary</th>");
              
              wr.print("</tr>");
              wr.print("<tr>");
              
              wr.print("<td>"+rs.getString(1)+"</td>");
              wr.print("<td>"+rs.getString(2)+"</td>");
              wr.print("<td>"+rs.getString(3)+"</td>");
              wr.print("<td>"+rs.getString(4)+"</td>");
              wr.print("<td>"+rs.getString(5)+"</td>");
              wr.print("<td>"+rs.getString(6)+"</td>");
              wr.print("<td>"+rs.getInt(7)+"</td>");
            
               wr.print("</tr></table>");
               wr.print("</html></body>");
            }
}

catch(Exception e)
{
System.out.println(e.getMessage());
}
        
    }

   

}
