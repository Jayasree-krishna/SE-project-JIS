package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class CaseManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "CaseHistory";
String userid="root";
String password ="jayasree";
try{
Class.forName(driver);
}catch(ClassNotFoundException e){
    e.printStackTrace();
}
Connection con=null;
Statement statement=null;
ResultSet resultset=null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <h1>List Of Registered Users</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>CIN</td>\n");
      out.write("                <td>DefendantName</td>\n");
      out.write("                <td>CrimeType</td>\n");
      out.write("                <td>View</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

            try{
            con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from CaseHistory";
            resultset = statement.executeQuery(sql);
            while(resultset.next()){
              
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( resultset.getString("CIN"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( resultset.getString("DefendantName"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( resultset.getString("CrimeType"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                <td><a href=\"RegistrarViewcase.jsp?d=");
      out.print(resultset.getString("CIN"));
      out.write("\">View</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
con.close();
}
catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("<form action=\"CaseManagement\">\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" name=\"back\" value=\"Back\">\n");
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
