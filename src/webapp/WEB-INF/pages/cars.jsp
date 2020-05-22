<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 22.05.2020
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cars</title>
    <style>
        TABLE {
            width: 600px;
            border-collapse: collapse;
        }

        TD, TH {
            padding: 1px;
            border: 1px solid lightgray;

        }

        TH {
            background: #696969;
        }
    </style>
</head>
<%
    String locale = request.getParameter("locale");
    String title = "Cars";
    if ("en".equals(locale)) {
        title = "CARS";
    } else if ("ru".equals(locale)) {
        title = "МАШИНЫ";
    }
%>
<body>
<%=title%>
</body>
<body>
<br/><br/>
<table>
    <tr>
        <th>Brand</th>
        <th>Series</th>
        <th>License Plate</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>${car.getBrand()}</td>
            <td>${car.getSeries()}</td>
            <td>${car.getLicensePlate()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
