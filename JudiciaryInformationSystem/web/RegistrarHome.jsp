<%-- 
    Document   : RegistrarHome
    Created on : 23 Dec, 2020, 5:49:41 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
                <%String name="";
            if(session.getAttribute("logged-in")!=null)
                name=(String)session.getAttribute("username");  %>
                
                <form action="Registrar">
                    <h1>Welcome <%= name%></h1><br>
                    <label for="search">Enter Keyword:</label>
                    <input type="text" name="search">
                    <input type="submit" value="GO" name="go"><br><br>
                    <textarea name="textarea" rows="5" cols="100"></textarea><br>
                    <input type="submit" value="Usermanagement" name="user">
                    <input type="submit" value="CaseManagement" name="case"><br><br>
                    <input type="submit" value="RegisterCase" name="register">
                    <input type="submit" value="Create Account" name="signup">
                </form>
        </div>
            
            
    </body>
</html>
