<%-- 
    Document   : bmi_dynamic_include
    Created on : 2018/11/3, 下午 03:30:48
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
        <jsp:include page="/bmi_header.jsp" />
        <jsp:include page="/bmi_form.jsp">
            <jsp:param name="cm" value="180" />
            <jsp:param name="kg" value="80" />
        </jsp:include>
        <jsp:include page="/bmi_footer.jsp" />
    </body>
</html>
