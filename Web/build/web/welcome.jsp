<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Welcome</title>
    </head>
    <body>
        <div class="container">
            <h2 class="title">Welcome</h2>
            <% 
                String username = (String) session.getAttribute("username");
                if (username != null) {
            %>
                <p>Welcome, <%= username %>! You have successfully logged in.</p>
            <% } else { %>
                <p>Welcome! You have successfully logged in.</p>
            <% } %>
        </div>
    </body>
</html>
