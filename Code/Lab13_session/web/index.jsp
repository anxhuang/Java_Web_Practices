<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Select an option:</h1>
        <form action="ApplicationController">
            <p>oprations:
                <select name="operation">
                    <option>Login</option>
                    <option>Shopping</option>
                    <option>Logout</option>
                </select>
            </p>
            <p><input type="submit" value="確定"></p>
        </form>
    </body>
</html>
