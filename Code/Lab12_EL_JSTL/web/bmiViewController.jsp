<%-- 
    Document   : bmiViewController
    Created on : 2018/11/3, 下午 01:40:04
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
        <jsp:useBean id="bmi" class="com.domain.Bmi" scope="request"/>
        <jsp:setProperty name="bmi" property="*"/>
        
        cm: ${bmi.cm} <br>
        kg: ${bmi.kg} <br>
        bmi: ${bmi.bmi} <br>
    </body>
</html>
