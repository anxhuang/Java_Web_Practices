<%-- 
    Document   : CustomerView
    Created on : 2018/11/3, 上午 10:32:56
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
        <h1>Customer Information</h1>
        <p>客戶名稱: ${customer.name}</p>
        <p>公司地址: <br>
        <ul>
            <li>${customer.officeAddress.address1}</li>
            <li>${customer.officeAddress.address2}</li>
            <li>${customer.officeAddress.city}</li>
            <li>${customer.officeAddress.region}</li>
            <li>${customer.officeAddress.postCode}</li>
        </ul>
        </p>
        <p>帳單地址: <br>
        <ul>
            <li>${customer.billingAddress.address1}</li>
            <li>${customer.billingAddress.address2}</li>
            <li>${customer.billingAddress.city}</li>
            <li>${customer.billingAddress.region}</li>
            <li>${customer.billingAddress.postCode}</li>
        </ul>
        </p>
        <p>郵寄地址: <br>
            <ul>
                <li>${customer.deliveryAddress.address1}</li>
                <li>${customer.deliveryAddress.address2}</li>
                <li>${customer.deliveryAddress.city}</li>
                <li>${customer.deliveryAddress.region}</li>
                <li>${customer.deliveryAddress.postCode}</li>
            </ul>
        </p>
        <p>透過 index 存取 Array: <br>
            <ul>
                <li>${customer.addresses[2].address1}</li>
                <li>${customer.addresses[2].address2}</li>
                <li>${customer.addresses[2].city}</li>
                <li>${customer.addresses[2].region}</li>
                <li>${customer.addresses[2].postCode}</li>
            </ul>
        </p>
        <p>透過 key 存取 Map ( key 若為整數，EL 預設採用 Long 型態): <br>
            <ul>
                <li>${map[1]}</li>
                <li>${map[(1).intValue()]}</li>
                <li>${map["1"]}</li>
                <br>
                <li>${customers[1]} 1為Long型態→無輸出</li> 
                <li>${customers[(1).intValue()]}</li>
                <li>${customers[(1).intValue()].name}</li>
                <li>${customers[(1).intValue()].officeAddress.address1}</li>
                <li>${customers[(1).intValue()].addresses[2].address1}</li>
            </ul>
        </p>
    </body>
</html>
