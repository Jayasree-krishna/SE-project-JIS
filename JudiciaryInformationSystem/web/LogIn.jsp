<%-- 
    Document   : LogIn
    Created on : 19 Dec, 2020, 1:11:11 PM
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
      <form action="UserLogIn" method="post">
            <div class="container">
                <div>
                <label for="uid"><b>UserId</b></label>
                <input type="text" placeholder="Enter Username" name="uid">
            </div>
            <div>
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw">
                
            </div>
                <div>
               <label for="type">Type of User:</label>
              <select name="type">
                <option value="Lawyer">Lawyer(LW)</option>
                <option value="Judge">Judge(JG)</option>
                <option value="Defendant">Defendant(DF)</option>
                <option value="Registrar">Registrar(RR)</option>
              </select><br><br>
                </div>
                    
            <div>
               <input type="submit" name="login" value="LogIn"/>
               
                
            </div>
            </div>
        </form>
    </body>
</html>
