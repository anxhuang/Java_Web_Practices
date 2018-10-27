<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        您選擇的水果是:
        <ul>
            <%
                String[] fruit = (String[]) request.getAttribute("fruit");
                for (String f : fruit) {
                    out.println("<li>" + f + "</li>");
                }
            %>
        </ul>
    </body>
</html>
