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
        </script>
    </head>
    
    <body>
         <div class="center" id="welcomebox">
             <div class="title">Welcome, ${username}</div>
            
             <p id="txt">Please wait to be redirected to the desktop application</p>
            <div class="welcome-button-container">
            <button class="push-btn" onclick="redirectToIndex()">Logout</button>
            </div>
             
        </div>
    </body>
</html>
