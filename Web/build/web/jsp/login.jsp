<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/style.css" >
        <title>Login</title>
    </head>
    <body>
        <div id="loginForm">
            <h2 class="title">Login</h2>
                <form action="LoginServlet" method="post">
                    Username: <input type="text" name="username" required><br>
                    Password: <input type="password" name="password" required><br>
                    <input type="submit" value="Login" class="btn">
                </form>
        </div>
       
        <button><a href="/login.jsp">Login</a></button>
        <button><a href="/index.jsp">Index</a></button>
        <button><a href="/register.jsp">Register</a></button>
        <button><a href="/welcome.jsp">Welcome</a></button>
        <button><a href="/index.jsp">Back</a></button>
    </body>
</html>
