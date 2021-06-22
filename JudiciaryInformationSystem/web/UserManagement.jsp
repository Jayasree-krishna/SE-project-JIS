<%-- 
    Document   : UserManagement
    Created on : 23 Dec, 2020, 6:21:45 PM
    Author     : student
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager" %>
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
%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Of Registered Users</h1>
        <table border="1">
            <tr>
                <td>UserName</td>
                <td>Category</td>
            </tr>
            
            <%
            try{
            con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from LogInDetails";
            resultset = statement.executeQuery(sql);
            while(resultset.next()){
              
            %>
            <tr>
                <td><%= resultset.getString("UserId")%></td>
                <td><%= resultset.getString("Category")%></td>
                <td><a href="delete.jsp?d=<%=resultset.getString("UserId")%>">edit</a></td>
            </tr>
            <%
                }
con.close();
}
catch(Exception e){
e.printStackTrace();
}
%>
</table>
<form action="UserManagement">
    <input type="submit" name="new" value="NewUser">
    <input type="submit" name="back" value="Back">
</form>
    </body>
</html>
