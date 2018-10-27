<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            private int j = 1;
            private Date today = new Date();
        %>

        <%= j * 10%>
        <%= today%>

        <br>

        <% for (int i = 1; i <= j * 10; i++) { %>
        hello in for loop<br>
        <% }%>
    </body>
</html>
