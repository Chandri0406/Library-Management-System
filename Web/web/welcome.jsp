<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
        <title>Welcome</title>
        <script>
            function redirectToIndex() {
                window.location.href = 'index.jsp';
            }
            
            function openDesktop() {
                fetch('/your-web-app/OpenDesktopApp')
                    .then(response => response.text())
                    .then(data => alert(data))
                    .catch(error => console.error('Error:', error));
            }
        </script>
    </head>
    
    <body>
         <div class="center" id="welcomebox">
             <div class="title">Welcome, ${username}</div>
            
            <div id="desktopConnection">
                <!-- Add content or functionality to connect to the desktop here -->
                <button class="push-btn" onclick="openDesktop()">Open desktop</button>
            </div>

            <div class="button-container">
            <button class="push-btn" onclick="redirectToIndex()">Logout</button>
            </div>
        </div>
    </body>
</html>
