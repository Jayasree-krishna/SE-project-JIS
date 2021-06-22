<%-- 
    Document   : SignUp
    Created on : 19 Dec, 2020, 9:02:56 AM
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
        <form action="SignUp">
            <fieldset style="width: 30%">
              <legend align="center">Create Account:-</legend>
              
              <label for="type">Type of User:</label>
              <select name="type">
                <option value="Lawyer">Lawyer(LW)</option>
                <option value="Judge">Judge(JG)</option>
                <option value="Defendant">Defendant(DF)</option>
                <option value="Registrar">Registrar(RR)</option>
              </select><br><br>
              
              
              <label>username starts with the letters based on type of user ex:type=lawyer then username must starts with LW</label><br><br>
              <label for="uid">UserId:</label>
              <input type="text" name="uid"><br><br>
              
              <label for="uid">UserName:</label>
              <input type="text" name="uname"><br><br>
           
              <label for="pswd">Password</label>
              <input type="password" name="pswd"><br><br>
              
              
              <label for="que">Security Question...</label>
              <select name="que">
                <option value="nickname">Your Nickname?</option>
                <option value="luckynumber">Your LuckyNumber</option>
                <option value="hero">Your SuperHero</option>
                <option value="childname">Your Childhood name</option>
              </select><br><br>
              <label for="ans">Answer:</label>
              <input type="text" name="ans"><br><br>
              
              
              <input type="submit" value="Create" name="create">
              <input type="submit" value="Back" name="back">
            </fieldset>
        </form>
    </body>
</html>
