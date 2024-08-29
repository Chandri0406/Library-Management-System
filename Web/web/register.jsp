<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="controller.RegisterServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Register</title>
    </head>
    <body>
        <div class="center" id="registerForm">
            
            <div class="title">Register</div>

            <%-- Error message div to display validation errors --%>
            <div class="errormsg">
                <% 
                    String errorMessage = (String) request.getAttribute("errorMessage");
                    if (errorMessage != null) {
                %>
                    <p><%= errorMessage %></p>
                <% 
                    } 
                %>
            </div>
            
            <form action="RegisterServlet" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input class="input" type="text" id="username" name="username" required>
                </div>
                
                <div class="form-group">
                    <label for="name">First Name:</label>
                    <input class="input" type="text" id="name" name="name" required>
                </div>
                
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input class="input" type="text" id="surname" name="surname"  required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input class="input" type="password" id="password" name="password" required>
                </div>
                
                <div class="form-group">
                    <label for="phone">Phone:</label>
                    <input class="input" type="text" id="phone" name="phone" 
                           pattern="\d{3} \d{3} \d{4}" placeholder="___ ___ ____" data-slots="_" required>
                </div>
                
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input  class="input" type="email" id="email" name="email" required>
                </div>
                 
                <br>
                <div class="reg-btn-con"> <%-- Shift here --%>
                    <input type="submit" value="Register" class="btn"> <%-- Style here --%>
                </div>
                
            </form>
            
            <div class="reg-btn-con">
                <a href="index.jsp"><button class="btn" id="b2h">Back to Home</button></a>
            </div>
        
        </div>
            
    </body>
</html>