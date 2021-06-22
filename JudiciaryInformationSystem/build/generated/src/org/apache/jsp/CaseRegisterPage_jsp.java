package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class CaseRegisterPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            \n");
      out.write("            ");

                int cin=0;
                Random rand = new Random();
                cin = rand.nextInt(100); 
                
      out.write("\n");
      out.write("            <form action=\"RegisterCase\">\n");
      out.write("                <label for=\"uid\">CIN:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"cin\" value='");
      out.print( cin );
      out.write("'/><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dname\">Defendant Id:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"did\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dname\">Defendant name:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"dname\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"daddress\">Defendant address:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"daddress\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"tcrime\">Type of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"tcrime\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"lcrime\">Location of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"lcrime\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"officer\">Name of arresting officer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"officer\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dcrime\">Date of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"date\"  name=\"dcrime\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"darrest\">Date of arrest:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"date\"  name=\"darrest\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"slot\">Select Slot:</label>\n");
      out.write("              <select name=\"slot\">\n");
      out.write("                <option value=\"Mrng9-10\">9am-10am</option>\n");
      out.write("                <option value=\"Mrng11-12\">11am-12am</option>\n");
      out.write("                <option value=\"Aftn2-3\">2pm-3pm</option>\n");
      out.write("                <option value=\"Aftn4-5\">4pm-5pm</option>\n");
      out.write("              </select><br><br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Register\" name=\"register\">\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
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
