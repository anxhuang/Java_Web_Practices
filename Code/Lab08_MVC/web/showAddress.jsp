<%-- 
    Document   : showAddress
    Created on : 2018/10/13, 下午 02:43:35
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Address</title>
    </head>
    <body>
        <h1>您輸入的運送地址是</h1>
        姓名: ${model.user}<br>
        地址: ${model.address}<br>
        縣市: ${model.city}<br>
        郵遞區號: ${model.zip}<br>
    </body>
</html>
