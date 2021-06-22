package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"SignUp\">\n");
      out.write("            <fieldset style=\"width: 30%\">\n");
      out.write("              <legend align=\"center\">Create Account:-</legend>\n");
      out.write("              \n");
      out.write("              <label for=\"type\">Type of User:</label>\n");
      out.write("              <select name=\"type\">\n");
      out.write("                <option value=\"Lawyer\">Lawyer(LW)</option>\n");
      out.write("                <option value=\"Judge\">Judge(JG)</option>\n");
      out.write("                <option value=\"Defendant\">Defendant(DF)</option>\n");
      out.write("                <option value=\"Registrar\">Registrar(RR)</option>\n");
      out.write("              </select><br><br>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <label>username starts with the letters based on type of user ex:type=lawyer then username must starts with LW</label>\n");
      out.write("              <label for=\"uid\">UserName:</label>\n");
      out.write("              <input type=\"text\" name=\"uid\"><br><br>\n");
      out.write("           \n");
      out.write("              <label for=\"pswd\">Password</label>\n");
      out.write("              <input type=\"password\" name=\"pswd\"><br><br>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <label for=\"que\">Security Question...</label>\n");
      out.write("              <select name=\"que\">\n");
      out.write("                <option value=\"nickname\">Your Nickname?</option>\n");
      out.write("                <option value=\"luckynumber\">Your LuckyNumber</option>\n");
      out.write("                <option value=\"hero\">Your SuperHero</option>\n");
      out.write("                <option value=\"childname\">Your Childhood name</option>\n");
      out.write("              </select><br><br>\n");
      out.write("              <label for=\"ans\">Answer:</label>\n");
      out.write("              <input type=\"text\" name=\"ans\"><br><br>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <input type=\"submit\" value=\"Create\" name=\"create\">\n");
      out.write("              <input type=\"submit\" value=\"Back\" name=\"back\">\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
