<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="controller.LoginServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Login</title>
    </head>
    <body>
        <div class="center" id="loginForm">
            <div class="title">Login</div>
            <form action="LoginServlet" method="post">
                
                <div class="form-group">
                         <% 
                         String errorMessage = (String) request.getAttribute("errorMessage");
                     if (errorMessage != null) {
                    %>
        <p style="color: red;"><%= errorMessage %></p>
        <a href="register.jsp">Register here</a>
                 <% 
                  }
                   
%>
<br>
<br>
<br>
                <label for="Username">Username:</label>
                <input type="text" id="Username" name="Username" class="input" required><br>
                </div>
                
                <div class="errormsg" id="errorMessage" >
        
                </div>
            
                <div class="form-group">
                <label for="Password">Password:</label>
                <input type="password" id="Password" name="Password" class="input" required><br>
                </div>
            
                <div class="button-container">
                <input type="submit" value="Login" class="btn">
                </div>
            </form>
        </div>
    </body>
</html>