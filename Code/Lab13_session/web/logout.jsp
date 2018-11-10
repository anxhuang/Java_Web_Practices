<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:if test="${user != null}">
                ${user}
                <c:remove var="user" scope="session"/>
                <% session.invalidate(); %>
                <br>您已完成登出!
            </c:if>
        </h1>
        <a href="index.jsp">回首頁</a>
    </body>
</html>
