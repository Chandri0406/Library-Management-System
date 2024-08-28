<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/style.css">
        <title>Welcome</title>
        <script>
            function redirectToIndex() {
                window.location.href = 'index.jsp';
            }
        </script>
    </head>
    
    <body>
        <div class="container" id="welcomePage">
            <h2>Welcome, ${username}</h2>
            
            <div id="desktopConnection">
                <!-- Add content or functionality to connect to the desktop here -->
                <p>Desktop connection status: <span id="connectionStatus">Not Connected</span></p>
            </div>

            <!-- Button to redirect to index.jsp -->
            <button class="btn" onclick="redirectToIndex()">Logout</button>
        </div>

    </body>
</html>
