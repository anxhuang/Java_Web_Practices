<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>@import url(css/global.css);</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="centerbox">
            <h1>Login</h1>
            <p>
                <font color="red">${loginError}</font>
            </p>
            <form action="ApplicationController" method="POST">
                <input type="text" name="user" placeholder="Username"><br>
                <input type="password" name="pass" placeholder="Password"><br>
                <br>
                <input type="hidden" name="operation" value="LoginSubmit">
                <input type="submit" value="登入">
                <input type="reset" value="清空">
            </form>
            <br>
            <a href="index.jsp">回首頁</a>
        </div>
    </body>
</html>
