<%-- 
    Document   : programmingForm
    Created on : 2018/10/27, 下午 03:57:53
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
        <form action="programming.do" method="POST">
            擅長程式語言(JSP):<br>
            <input type="checkbox" name="programming" value="C++">C++
            <input type="checkbox" name="programming" value="C#">C#
            <input type="checkbox" name="programming" value="GO">GO
            <input type="checkbox" name="programming" value="Java">Java
            <input type="checkbox" name="programming" value="Kotlin">Kotlin
            <input type="checkbox" name="programming" value="Objective-C">Objective-C
            <input type="checkbox" name="programming" value="PHP">PHP
            <input type="checkbox" name="programming" value="Python">Python
            <input type="checkbox" name="programming" value="R">R
            <input type="checkbox" name="programming" value="Swift">Swift
            <br>
            <input type="submit" value="送出">
            <input type="reset" value="重置">
        </form>
    </body>
</html>
