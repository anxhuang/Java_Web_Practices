<%-- 
    Document   : addressBeans
    Created on : 2018/11/3, 下午 12:16:44
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
        <jsp:useBean id="addr" class="com.domain.Address" scope="session" />
        <jsp:setProperty name="addr" property="address1" value="100 台北市忠孝東路一段" />
        <jsp:getProperty name="addr" property="address1" />
    </body>
</html>
