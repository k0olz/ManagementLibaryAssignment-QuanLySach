<%-- 
    Document   : Index
    Created on : Apr 15, 2015, 12:43:20 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Css/Style.css">
    </head>
    <body>
        
        <section id="loginBox">
            <h2>Login</h2>
            <form action="LoginUser" method="post" class="minimal">
                <label for="username">
                    Username:
                    <input type="text" name="user" id="username" placeholder="Username" />
                </label>
                <label for="password">
                    Password:
                    <input type="password" name="pass" id="password" placeholder="Password" />
                </label>
                <button type="submit" class="btn-minimal">Sign in</button>
            </form>
            
        </section>
    </body>
</html>
