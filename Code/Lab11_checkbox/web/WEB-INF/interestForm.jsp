<%-- 
    Document   : interestForm
    Created on : 2018/10/27, 下午 03:57:40
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="interest.do" method="POST">
            興趣(JSP):<br>
            <input type="checkbox" name="interest" value="程式">程式
            <input type="checkbox" name="interest" value="單車">單車
            <input type="checkbox" name="interest" value="登山">登山
            <input type="checkbox" name="interest" value="電影">電影
            <input type="checkbox" name="interest" value="遊戲">遊戲
            <input type="checkbox" name="interest" value="閱讀">閱讀
            <br>
            <input type="submit" value="送出">
            <input type="reset" value="重置">
        </form>
    </body>
</html>
