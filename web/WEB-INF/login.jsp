<%-- 
    Document   : login
    Created on : Oct 14, 2020, 11:02:22 AM
    Author     : 816590
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="login">
        <label>username</label>
        <input type="text" name="username" value="">
        <br>
        <label>password</label>
        <input type="password" name="password" value="">
        <br>
        <input type="submit" value="Login">
        </form>
        
        <p> ${message} </p>
    </body>
</html>
