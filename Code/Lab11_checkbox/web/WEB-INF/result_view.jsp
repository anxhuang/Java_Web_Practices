<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>興趣 Interest</h1>

        <%
            String[] interest = (String[]) session.getAttribute("interest");

            if (interest != null) {
                out.print("<ul>");
                for (String i : interest) {
                    out.print("<li>" + i + "</i>");
                }
                out.print("</ul>");
            } else {
                out.print("無");
            }
        %>
        <br>
        <h1>擅長程式語言 Programming Language</h1>
        <%
            String[] programming = (String[]) session.getAttribute("programming");

            if (programming != null) {
                out.print("<ul>");
                for (String p : programming) {
                    out.print("<li>" + p + "</i>");
                }
                out.print("</ul>");
            } else {
                out.print("無");
            }
        %>
        <br>
        <a href="index.jsp">點我回首頁</a>
    </body>
</html>
