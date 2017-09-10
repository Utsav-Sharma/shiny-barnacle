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
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Update extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
         resp.sendRedirect("index.jsp");
         PrintWriter pw=resp.getWriter();
       
       String ename=req.getParameter("ename");
       
       String econt=req.getParameter("econt");
       String eemail=req.getParameter("eemail");
       String eadd=req.getParameter("eadd");
      
       String equal=req.getParameter("equal");
       String edesg=req.getParameter("edesg");
       int esal=Integer.parseInt(req.getParameter("esal"));
 
       System.out.println(ename);
       System.out.println(econt);
       System.out.println(eemail);
        System.out.println(eadd);
       System.out.println(equal);
       System.out.println(edesg);
       System.out.println(esal);
 
       System.out.println("<h1>Update success</h1>");
       
       
       Connection con;
       Statement st;       
       try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con=DriverManager.getConnection("Jdbc:Odbc:pay");
           st=con.createStatement();
           st.executeUpdate("update emp set name ='"+ename+"', contact ='"+econt+"', email ='"+eemail+"',addr ='"+eadd+"',  qualification ='"+equal+"', designation ='"+edesg+"', salary ="+esal+" where name =   '"+ename+"' ");
          }catch(Exception ex){
           System.out.println(ex.getMessage());
                  
       }
       
    
    }

 
  

}
