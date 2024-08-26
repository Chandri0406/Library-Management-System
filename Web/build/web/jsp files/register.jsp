<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form action="RegisterServlet" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br>
        
        <label for="name">First Name:</label><br>
        <input type="text" id="name" name="name" required><br>
        
        <label for="surname">Surname:</label><br>
        <input type="text" id="surname" name="surname" required><br>
        
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        
        <label for="phone">Phone:</label><br>
        <input type="text" id="phone" name="phone" required><br>
        
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br>
        
        <input type="submit" value="Register">
    </form>
    <p><a href="index.jsp">Back to Home</a></p>
</body>
</html>