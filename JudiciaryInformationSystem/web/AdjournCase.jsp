<%-- 
    Document   : AdjournCase
    Created on : 27 Dec, 2020, 12:16:59 PM
    Author     : student
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
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
  String dfcin="";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String cin=request.getParameter("d");
            
            
        %>
        <form action="AdjournCase">
            <h3>CIN:<input type="text" name="cin" value="<%= cin%>"></h3>
            <%
             try{
               
           
             con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from RegistrarAssignDetails where CIN='"+cin+"'";
            resultset = statement.executeQuery(sql);
              while(resultset.next()){
                   dfcin=resultset.getString("DateOfHearing"); 
             %>
            <Label for="dphear">Date Of Adjourn Hearing:</label>
            <input type="text" name="dphear" value="<%= dfcin%>"><br><br>
            <label for="adjourn">Enter Reason For Adjournment:</label><br><br>
            <textarea name="adjourn" rows="5" cols="100"></textarea><br><br>
            <Label for="dhear">Date Of Next Hearing:</label>
            <input type="date" name="dhear"><br><br>
            
            <input type="submit" value="Save Changes" name="save">
            
        </form>
                 <%
       }         
con.close();
}
catch(Exception e){
e.printStackTrace();
}
%>
    </body>
</html>
