<%-- 
    Document   : ViewCaseRR
    Created on : 24 Dec, 2020, 6:54:13 PM
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
        <div align="center">
            
            <%
                String name="";
                if(session.getAttribute("registercase")!=null){
                    name=(String)session.getAttribute("cin");
                }
                int cin=Integer.parseInt(name);

              
            
           

             %>
            <form action="ViewCaseRR">
                <label for="uid">CIN:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="cin" value='<%=cin %>'/><br><br>
                
               
                <label for="Judge">Name of presiding judge:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="Judge" ><br><br>
                
                 <label for="Judgeid">Judge Id:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="Judgeid" ><br><br>
                
                 <label for="Lawyer">Name of presiding Lawyer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="Lawyer" ><br><br>
                
                <label for="Lawyerid">Lawyer Id:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="Lawyerid" ><br><br>
                
               
                
                <label for="dstart">Date of Starting:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="date"  name="dstart" ><br><br>
                
                <label for="dcomplt"> Expctd date of completion:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="date"  name="dcomplt" ><br><br>
                
                <label for="dhear">Date of Next hearing:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="date"  name="dhear" ><br><br>
                
                <label for="status">Status:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="status" ><br><br>




                
                
                
                
                <input type="submit" value="Save & Back" name="save">
            </form>
       
 

                
        </div> 
    </body>
</html>
