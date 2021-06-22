<%-- 
    Document   : CaseRegisterPage
    Created on : 20 Dec, 2020, 1:06:53 PM
    Author     : student
--%>

<%@page import="java.util.Random"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            
            <%
                int cin=0;
                Random rand = new Random();
                cin = rand.nextInt(100); 
                %>
            <form action="RegisterCase">
                <label for="uid">CIN:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="cin" value='<%= cin %>'/><br><br>
                
                <label for="dname">Defendant Id:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="did"><br><br>
                
                <label for="dname">Defendant name:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="dname"><br><br>
                
                <label for="daddress">Defendant address:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="daddress"><br><br>
                
                <label for="tcrime">Type of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="tcrime" ><br><br>
                
                <label for="lcrime">Location of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="lcrime" ><br><br>
                
                <label for="officer">Name of arresting officer:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="text"  name="officer" ><br><br>
                
                <label for="dcrime">Date of crime:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="date"  name="dcrime" ><br><br>
                
                <label for="darrest">Date of arrest:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="date"  name="darrest"><br><br>
                
                <label for="slot">Select Slot:</label>
              <select name="slot">
                <option value="Mrng9-10">9am-10am</option>
                <option value="Mrng11-12">11am-12am</option>
                <option value="Aftn2-3">2pm-3pm</option>
                <option value="Aftn4-5">4pm-5pm</option>
              </select><br><br>
                
                
                <input type="submit" value="Register" name="register">
            </form>
        </div> 
    </body>
</html>
