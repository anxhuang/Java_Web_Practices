<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>${welcome}</h1>
            <form action="ApplicationController" action="POST">
                <p>Select an operations:
                    <select name="operation">
                        <c:choose>
                            <c:when test="${user == null}">
                                <option>Login</option>
                            </c:when>
                            <c:otherwise>
                                <option>ATM</option>
                                <option>Logout</option>
                            </c:otherwise>
                        </c:choose>
                    </select>
                </p>
                <p><input type="submit" value="確定"></p>
            </form>
        </div>
    </body>
</html>
