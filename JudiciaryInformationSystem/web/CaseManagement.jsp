<%-- 
    Document   : CaseManagement
    Created on : 24 Dec, 2020, 3:59:22 PM
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
                <td>DefendantId</td>
                <td>DefendantName</td>
                <td>CrimeType</td>
                <td>CIN</td>
                <td>Adjourn</td>
                <td>Update</td>
            </tr>
            
            <%
            try{
            con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from CaseHistory";
            resultset = statement.executeQuery(sql);
            while(resultset.next()){
              
            %>
            <tr>
                <td><%= resultset.getString("DefendantId")%></td>
                <td><%= resultset.getString("DefendantName")%></td>
                <td><%= resultset.getString("CrimeType")%></td>
                <td><%= resultset.getString("CIN")%></td>
                <td><a href="AdjournCase.jsp?d=<%=resultset.getInt("CIN")%>">ADJOURN CASE</a></td>
                <td><a href="UpdateStatus.jsp?d=<%=resultset.getInt("CIN")%>">UPDATE STATUS</a></td>

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
<form action="CaseManagement">
    
    <input type="submit" name="back" value="Back">
</form>
    </body>
</html>

