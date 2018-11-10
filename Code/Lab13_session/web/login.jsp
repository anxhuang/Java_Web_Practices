<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ApplicationController">
            <p>Username:
                <input type="text" name="user">
            </p>
            <p>
                <input type="hidden" name="operation" value="Login">
                <input type="submit" value="確定">
            </p>
        </form>
    </body>
</html>
