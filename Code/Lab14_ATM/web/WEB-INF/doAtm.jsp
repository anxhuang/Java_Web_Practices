<%-- 
    Document   : doAtm
    Created on : 2018/11/10, 下午 04:35:01
    Author     : mac
--%>

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
            <h1>${doAtmTitle}</h1>
            <p>目前帳戶餘額：${account.balance}</p>
            <form action="AtmController" method="POST">
                <input type="text" name="amount" placeholder="請輸入金額"><br>
                <br>
                <input type="hidden" name="operation" value="doAtm">
                <input type="submit" value="結算">
            </form>
            <br>
            <a href="index.jsp">回首頁</a>
        </div>
    </body>
</html>
