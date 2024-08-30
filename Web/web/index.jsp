<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
        <title>Library Management System</title>
    </head>
   
    <body>
        <div class="center" id="indexbox" >
            
            <div class="title">
                Welcome to the Library Management System
            </div>
            <br><br>
            <div class="button-container"><%-- Shift here --%>
                <a href="login.jsp" ><button class="push-btn">Login</button></a> <%-- Style --%>
            </div>
            
            <div class="button-container" id="regbtn">
                <a href="register.jsp"><button class="push-btn">Register</button></a>
            </div>
            
        </div>
    </body>
</html>
