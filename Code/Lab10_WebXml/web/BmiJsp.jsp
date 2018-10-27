<%-- 
    Document   : BmiJsp
    Created on : 2018/10/27, 上午 11:56:38
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
        ${initParam.email}<br>
        ${initParam.cm}<br>
        ${initParam.kg}<br>
        
        <form action="BmiController">
            cm: <input type="text" name="cm" value="<%= config.getInitParameter("cm")%>"><br><br>
            kg: <input type="text" name="kg" value="<%= config.getInitParameter("kg") %>"><br><br>
        <input type="submit" value="送出">
        </form>
        
    </body>
</html>
