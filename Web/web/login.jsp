<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="controller.LoginServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Login</title>
    </head>
    <body>
        <div class="container" id="loginForm">
            <h2 class="title">Login</h2>
            
            <div id="errorMessage" class="error-message">
                <% 
                    String error = (String) request.getAttribute("errorMessage");
                    if (error != null) { 
                %>
                    <p><%= error %></p>
                <% } %>
            </div>

            <form action="LoginServlet" method="post">
                <label for="Username">Username:</label>
                <input type="text" id="Username" name="Username" required><br>
                
                <label for="Password">Password:</label>
                <input type="password" id="Password" name="Password" required><br>
                
                <input type="submit" value="Login" class="btn">
            </form>
        </div>
    </body>
</html>




