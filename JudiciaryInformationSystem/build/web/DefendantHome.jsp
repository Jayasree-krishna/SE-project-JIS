<%-- 
    Document   : DefendantHome
    Created on : 25 Dec, 2020, 8:40:13 PM
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
                String uid="";
                if(session.getAttribute("logged-in")!=null){
                    uid=(String)session.getAttribute("username");
                }
         %>
        
         
         <form action="DefendantHome">
             <%
             try{
               
           
             con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select CIN from CaseHistory where DefendantId='"+uid+"'";
            resultset = statement.executeQuery(sql);
              while(resultset.next()){
                   dfcin=resultset.getString("CIN"); 
             %>
             <label for="cin">CIN:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="cin" value='<%=dfcin%>'/><br><br>
         
         
     <%
       }         
con.close();
}
catch(Exception e){
e.printStackTrace();
}
%>
                <label for="dstart">Date Of start:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                
                <%
             try{
               
           
             con = DriverManager.getConnection(connectionUrl+database,userid,password);
            statement=con.createStatement();
            String sql= "select * from RegistrarAssignDetails where CIN='"+dfcin+"'";
            resultset = statement.executeQuery(sql);
              while(resultset.next()){
                    
             %>
                <input type="text"  name="dstart" value='<%=resultset.getString("DateOfStart")%>'/><br><br>
                
                <label for="judge">Assigning Judge:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="judge" value='<%=resultset.getString("AssigningJudge")%>'/><br><br>
                
                <label for="lawyer">Assigning Lawyer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="lawyer" value='<%=resultset.getString("AssigningLawyer")%>'/><br><br>
                
                <label for="dcomplt">Expected Date Of complt:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="dcomplt" value='<%=resultset.getString("DateOfComplt")%>'/><br><br>
                
                <label for="dhear">Date Of Hearing:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="dhear" value='<%=resultset.getString("DateOfHearing")%>'/><br><br>
                
                <label for="status">status:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="status" value='<%=resultset.getString("Status")%>'/><br><br>
                
                <input type="submit" value="OK" name="ok">

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
