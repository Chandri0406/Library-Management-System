<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
        <title>Register</title>
    </head>
    <body>
        <div class="center" id="registerForm">
            
            <div class="title">
                Register
            </div>
            <%-- Remeber line breaks
                    Add div for error message
                    Add validation for error
            --%>
            <form action="RegisterServlet" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" class="input" required>
                </div>
                
                <div class="form-group">
                    <label for="name">First Name:</label>
                    <input type="text" id="name" name="name" class="input" required>
                </div>
                
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input type="text" id="surname" name="surname" class="input" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="input" required>
                </div>
                
                <div class="form-group">
                    <label for="phone">Phone:</label>
                    <input type="text" id="phone" name="phone" required pattern="\d{3} \d{3} \d{4}" placeholder="___ ___ ____" class="input" required>
                </div>
                
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" class="input" required>
                </div>
                
                <div class="button-container">
                    <input type="submit" value="Register" class="btn">
                </div>
            </form>
            
            <div class="button-container">
                <%-- Add button--%>
                <button class="btn"><a href="index.jsp">Back to Home</a></button>
            </div>
        </div>
       
    </body>
</html>