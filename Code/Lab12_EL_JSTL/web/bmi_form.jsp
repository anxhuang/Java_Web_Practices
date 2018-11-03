<%-- 
    Document   : bmi_form
    Created on : 2018/11/3, 下午 03:35:15
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
        <h2>這裡是頁身 bmi_form.jsp</h2>
        <form action="bmiViewController.jsp">
            cm: <input type="text" name="cm" value="${param.cm}"><br>
            kg: <input type="text" name="kg" value="${param.kg}"><br>
            <input type="submit" value="送出">
        </form>
    </body>
</html>
