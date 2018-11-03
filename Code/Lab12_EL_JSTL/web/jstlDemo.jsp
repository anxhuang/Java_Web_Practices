<%-- 
    Document   : jstlDemo
    Created on : 2018/11/3, 下午 02:38:48
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@page isErrorPage="true" %>
        
        <h3>addr物件建立 回傳address1:</h3>
        <jsp:useBean id="addr" class="com.domain.Address" scope="session" />
        <jsp:setProperty name="addr" property="address1" value="100 台北市忠孝東路一段" />
        <jsp:getProperty name="addr" property="address1" />
        <br>
        <h3>刪除addr物件</h3>
        <c:remove var="addr" scope="session" />   <!-- 刪除session櫃台的addr -->
        <c:catch var="NullPointerException">
            <h3>讀取addr物件</h3>
            <jsp:getProperty name="addr" property="address1" />     <!-- 若addr物件不存在 會產生例外 -->
        </c:catch>
        <h3>判斷Exception是否有值</h3>
        <c:if test="${not empty NullPointerException}">
            addr is not exist, throws exception: ${NullPointerException}
        </c:if>
        <br>
        <br>
        
        <h3>c:out 使瀏覽器直接輸出HTML語法程式碼</h3>
        <!-- value="key" 會列印key參考到的value, 若沒有寄放此key, 則輸出 c:out 內文(body) -->
        <c:out value="${x}" escapeXml="true">   
            <script type="text/javascript">
                alert('JS程式執行了');
            </script>
            <h1 this is not a heading X > Y ... is that true & is the other true too ?
        </c:out>
    </body>
</html>
