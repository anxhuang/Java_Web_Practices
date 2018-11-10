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
            <h1>Select an option:</h1>
            <form action="AtmController">
                <p>operations:
                    <select name="operation">
                        <option>Deposit</option>
                        <option>Withdraw</option>
                    </select>
                </p>
                <p><input type="submit" value="確定"></p>
            </form>
            <br>
            <a href="index.jsp">回首頁</a>
        </div>
    </body>
</html>
