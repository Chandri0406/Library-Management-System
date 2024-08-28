<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" >
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
                    <input type="text" id="username" name="username" required>
                </div>
                
                <div class="form-group">
                    <label for="name">First Name:</label>
                    <input type="text" id="name" name="name" required>
                </div>
                
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input type="text" id="surname" name="surname" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                
                <div class="form-group">
                    <label for="phone">Phone:</label>
                    <input type="text" id="phone" name="phone" required>
                </div>
                
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                </div>
                
                <div class="button-container">
                    <input type="submit" value="Register" class="button">
                </div>
            </form>
            
            <div class="button-container">
                <%-- Add button--%>
                <a href="index.jsp" class="button">Back to Home</a>
            </div>
        </div>
       
    </body>
</html>