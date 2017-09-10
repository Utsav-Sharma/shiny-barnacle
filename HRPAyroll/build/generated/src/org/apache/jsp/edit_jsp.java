package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div id=\"header\">\n");
      out.write("            <ul id=\"navbar\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                <li><font size=\"10\" color=\"red\">PMS</font></li>\n");
      out.write("                <form action=\"First.jsp\" method=\"get\"><li><input type=\"submit\" value=\"HOME\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"Add.jsp\" method=\"get\"><li><input type=\"submit\" value=\"REGISTER\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"List.jsp\" method=\"get\"><li><input type=\"submit\" value=\"EMPLOYEES\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"EditProfile.jsp\" method=\"get\"><li><input type=\"submit\" value=\"UPDATE\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"Salary.jsp\" method=\"get\"><li><input type=\"submit\" value=\"SALARY\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"search.jsp\" method=\"get\"><li><input type=\"submit\" value=\"SEARCH\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("                <form action=\"index.jsp\" method=\"\"><li><input type=\"submit\" value=\"EXIT\"style=\"color: white;background-color:#333; height:50px;width:120px;font-size:20px;font-family:cursive;border:0px;font-weight:bold\"></li></form>\n");
      out.write("               \n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    <font size=\"6\"><center>Employee Detail Update</center></font><br><br>\n");
      out.write("   <form action=\"Edit\" method=\"get\">\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("    <font size=\"5\">Employee Name:</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"name\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<font size=\"5\">Contact No.:</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"contact\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<font size=\"5\">Qualification:</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"qualification\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<font size=\"5\">Designation:</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"designation\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<font size=\"5\">Email</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"email\" name=\"mail\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<font size=\"5\">Salary</font>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"salary\"/>\n");
      out.write("</td>\n");
      out.write("</tr><br><br>\n");
      out.write("</table><br><br><br><br><br><br><br><br\n");
      out.write("       <table>\n");
      out.write("<tr>\n");
      out.write("<center><input type=\"submit\" value=\"DONE\"style=\"height:50px;width:120px;font-size: 20px;font-weight:bold\"/></center><br><br><br><br>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
