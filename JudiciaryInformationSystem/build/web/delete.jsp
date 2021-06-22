<%-- 
    Document   : delete
    Created on : 23 Dec, 2020, 7:35:12 PM
    Author     : student
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int i=0;
    String id=request.getParameter("d");
    try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
         Statement st=con.createStatement();
         
         i=st.executeUpdate("DELETE FROM LogInDetails WHERE UserId='"+id+"'");
       
    } catch(Exception e){
        e.printStackTrace();
    }
%>

