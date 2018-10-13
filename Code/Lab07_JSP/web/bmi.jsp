<%-- 
    Document   : bmi
    Created on : 2018/10/13, 上午 10:23:01
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI JSP Page</title>
    </head>
    <body>
        <%
        String cm;
        String kg;
        
        //取得 form 傳送過來的資料
        cm = request.getParameter("cm");
        kg = request.getParameter("kg");
        
        //輸入到 Web Server (Tomcat) 紀錄
        getServletContext().log("cm = "+cm);
        getServletContext().log("kg = "+kg);
        
        double cmDouble = Double.parseDouble(cm);
        double kgDouble = Double.parseDouble(kg);
        double mDouble = cmDouble / 100;
        double bmiDouble = kgDouble / (mDouble * mDouble);
        
        //out 是 JSP 內建 輸出資料流
        out.print("BMI = "+bmiDouble);
        %>
    </body>
</html>
