/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-04-01 11:08:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>City Library</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <h1>City Library</h1>\n");
      out.write("</header>\n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a href=\"book\">About</a></li>\n");
      out.write("        <li><a href=\"login\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("<main>\n");
      out.write("    <h1>Welcome to City Library official website</h1>\n");
      out.write("\n");
      out.write("    <img src=\"image/citylibrary.jpg\"/>\n");
      out.write("\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vitae nulla sed lectus dapibus hendrerit.\n");
      out.write("        Aenean malesuada magna quis nunc laoreet, vel elementum risus tincidunt. Etiam varius justo in ex\n");
      out.write("        vestibulum, ut ultrices nulla malesuada. Nullam euismod pretium odio, quis auctor leo consequat ac. Ut eget\n");
      out.write("        malesuada lectus, in posuere lectus. Nam tincidunt enim id orci luctus aliquet.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h3> Find US :D</h3>    \n");
      out.write("        <div class=\"mapouter\">\n");
      out.write("            <div class=\"gmap_canvas\">\n");
      out.write("                <iframe width=\"801\" height=\"494\" id=\"gmap_canvas\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7920.308288484077!2d110.39771536977537!3d-6.991118499999994!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2e708b9e8e74f58f%3A0x7bab3f8b2f245f94!2sMicrolibrary%20Warak%20Kayu!5e0!3m2!1sen!2sid!4v1679225736209!5m2!1sen!2sid\" frameborder=\"10px\" scrolling=\"no\" marginheight=\"10\" marginwidth=\"10\" style=\"border: 10px solid #c0c0c0;border-radius: 10%;\"></iframe>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </main>\n");
      out.write("<footer>\n");
      out.write("    <p>Copyright &copy; 2023 Red Team 2</p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}