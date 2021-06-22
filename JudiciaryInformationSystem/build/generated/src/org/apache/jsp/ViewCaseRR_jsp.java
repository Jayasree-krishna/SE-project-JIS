package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ViewCaseRR_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "User-Information";
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
      out.write("        <div align=\"center\">\n");
      out.write("            \n");
      out.write("            ");

                String name=request.getParameter("d");
                
                
              
            try{
            con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from CaseHistory where CIN='"+name+"'";
            resultset = statement.executeQuery(sql);
            while(resultset.next()){
           

             
      out.write("\n");
      out.write("            <form action=\"RegisterCase\">\n");
      out.write("                <label for=\"uid\">CIN:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"cin\" value='");
      out.print(name );
      out.write("'/><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dname\">Defendant name:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"dname\" value=\"");
      out.print( resultset.getString("DefendantName"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"daddress\">Defendant address:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"daddress\" value=\"");
      out.print( resultset.getString("DefendantAddress"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"tcrime\">Type of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"tcrime\" value=\"");
      out.print( resultset.getString("CrimeType"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"lcrime\">Location of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"lcrime\" value=\"");
      out.print( resultset.getString("LocationOfCrime"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"officer\">Name of arresting officer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"officer\" value=\"");
      out.print( resultset.getString("NameOfArrestingOfficer"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dcrime\">Date of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"dcrime\" value=\"");
      out.print( resultset.getString("DateOfCrime"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"darrest\">Date of arrest:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"darrest\" value=\"");
      out.print( resultset.getString("DateOfArrest"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"slot\">Select Slot:</label>\n");
      out.write("                <input type=\"text\"  name=\"slot\" value=\"");
      out.print( resultset.getString("slot"));
      out.write("\"><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"Judge\">Name of presiding judge:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"Judge\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"Lawyer\">Name of presiding Lawyer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"Lawyer\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dstart\">Date of Starting:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"date\"  name=\"dstart\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dcomplt\"> Expctd date of completion:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"date\"  name=\"dcomplt\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"dhear\">Date of Next hearing:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"date\"  name=\"dhear\" ><br><br>\n");
      out.write("                \n");
      out.write("                <label for=\"status\">Status:</label>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <input type=\"text\"  name=\"status\" ><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Save & Back\" name=\"save\">\n");
      out.write("            </form>\n");
      out.write("       \n");
      out.write(" ");

      }          
con.close();
}
catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("                \n");
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
