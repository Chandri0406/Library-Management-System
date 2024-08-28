<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/style.css" >
        <title>Welcome</title>
    </head>
    
    <body>
        <%-- Not a form
                 Add div and class and id where needed
                 Needs to connect to desktop idk how
        --%>
        <h2>Welcome, ${username}</h2>
            <form action="LoginServlet" method="post">
                <input type="submit" value="Logout">
            </form>
    </body>
</html>
