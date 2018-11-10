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
            <h1>${doAtmTitle} Result</h1>
            <p>交易: ${amount}</p>
            <p>餘額: ${account.balance}</p>
            <br>
            <a href="index.jsp">回首頁</a>
        </div>
    </body>
</html>
