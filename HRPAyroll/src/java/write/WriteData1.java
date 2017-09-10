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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class WriteData1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String eid = req.getParameter("eid");
        String ename = req.getParameter("ename");
        String econt = req.getParameter("econt");
        String eemail = req.getParameter("eemail");
        String eadd = req.getParameter("eadd");
        String equal = req.getParameter("equal");
        String edesg = req.getParameter("edesg");
        int esal = Integer.parseInt(req.getParameter("esal"));
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(econt);
        System.out.println(eemail);
        System.out.println(eadd);
        System.out.println(equal);
        System.out.println(edesg);
        System.out.println(esal);
        Connection con;
        Statement st;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:pay");
            st = con.createStatement();

            int i = st.executeUpdate("insert into emp(id,name,contact,email,addr,qualification,designation,salary)values('" + eid + "','" + ename + "','" + econt + "','" + eemail + "','" + eadd + "','" + equal + "','" + edesg + "'," + esal + ")");
            if (i > 0) {
                RequestDispatcher rd = req.getRequestDispatcher("successful.jsp");
                rd.forward(req, resp);
             
                resp.sendRedirect("successful.jsp");
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
 
    }

}
