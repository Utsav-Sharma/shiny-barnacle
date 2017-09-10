package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newentry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{background:linear-gradient(to bottom, #ffffcc 1%, #669999 100%);padding-bottom:190px; } \n");
      out.write("            form {\n");
      out.write("\tbackground: rgba(45, 45, 125, 0.68);\n");
      out.write("\tcolor: white;\n");
      out.write("\tpadding: 40px;\n");
      out.write("\tmargin-top: 100px;\n");
      out.write("\tpadding-bottom: 80px;\n");
      out.write("\twidth:250px;\n");
      out.write("        opacity:0.9;\n");
      out.write("        box-shadow: 10px 10px 5px rgba(6, 1, 1, 0.43)\n");
      out.write("        \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .parallax {\n");
      out.write("    /* The image used */\n");
      out.write(" //   background-image: url(\"resources/img/background.jpg\");\n");
      out.write("\n");
      out.write("    /* Set a specific height */\n");
      out.write("    min-height: 500px; \n");
      out.write("\n");
      out.write("    /* Create the parallax scrolling effect */\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("h1{color:skyblue;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center> <h1>NEW ENTRY</h1>\n");
      out.write("       \t<div class=\"parallax\">\n");
      out.write("            <form action=\"WriteData1\" method=\"get\">\n");
      out.write("            Enter your id:\n");
      out.write("            <input type=\"text\" name=\"eid\" placeholder=\"Enter your eid\" /><br>\n");
      out.write("            <h2>Personal Info:</h2>\n");
      out.write("            Enter your Name:\n");
      out.write("            <input type=\"text\" name=\"ename\" placeholder=\"Enter your name\"/><br><br>\n");
      out.write("            Enter your contact:\n");
      out.write("            <input type=\"text\" name=\"econt\" placeholder=\"Enter your contact\"/><br><br>\n");
      out.write("            Enter your email:\n");
      out.write("            <input type=\"text\" name=\"eemail\" placeholder=\"Enter your email\"/><br><br>\n");
      out.write("            Enter your address:\n");
      out.write("            <input type=\"text\" name=\"eadd\" placeholder=\"Enter your address\"/><br><br>\n");
      out.write("            <h2>Professional Info:</h2>\n");
      out.write("            Enter your qualification:\n");
      out.write("            <input type=\"text\" name=\"equal\" placeholder=\"Enter your qualification\"/><br><br>\n");
      out.write("            Enter your designation:\n");
      out.write("            <input type=\"text\" name=\"edesg\" placeholder=\"Enter your designation\"/><br><br>\n");
      out.write("            Enter your salary:\n");
      out.write("            <input type=\"text\" name=\"esal\" placeholder=\"Enter your salary\"/><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Register\"/>\n");
      out.write("        </form></center>\n");
      out.write("</div>\n");
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
