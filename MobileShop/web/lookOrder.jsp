<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单页面</title>
</head>
<body>
<table width="60%" align="center">
    <tr>
        <td>
            <h3>您的订单如下:</h3>
        </td>
    </tr>
    <table width="60%" align="center" border="1">
        <th width="100">手机标识号</th>
        <th width="100">手机名称</th>
        <th width="100">手机制造商</th>
        <th width="100">手机价格</th>
        <c:forEach items="${sessionScope.order.keySet()}" var="key" varStatus="s">
            <tr>
                <td width="100">${sessionScope.order.get(key).mobile_version}</td>
                <td width="100">${sessionScope.order.get(key).mobile_name}</td>
                <td width="100">${sessionScope.order.get(key).mobile_made}</td>
                <td width="100">${sessionScope.order.get(key).mobile_price}</td>
            </tr>
        </c:forEach>
    </table>
    <tr>
        <td>
            总价格为：${sessionScope.orderValue}
        </td>
    </tr>
    <br>

    <tr>
        <td>
            <a href="mainPage_Login.jsp">返回主界面</a>
        </td>
    </tr>

</table>

</body>
</html>
