<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询购物车</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addToCartServlet" method="post">
    <table width="60%" align="center">
        <tr>
            <td>购物车中的物品</td>
        </tr>
        <c:forEach items="${sessionScope.cart.keySet()}" var="key" varStatus="s">
                <table width="60%" align="center" border="1">
                    <tr>
                        <td width="100">${sessionScope.cart.get(key).mobile_version}</td>
                        <td width="100">${sessionScope.cart.get(key).mobile_name}</td>
                        <td width="100">${sessionScope.cart.get(key).mobile_made}</td>
                        <td width="100">${sessionScope.cart.get(key).mobile_price}</td>
                        <td width="100"><a href="${pageContext.request.contextPath}/delGoodsByCartServlet?integer=${key}">删除</a></td>
                    </tr>
                </table>
        </c:forEach>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/newOrderServlet">生成订单</a>
            </td>
        </tr>
    </table>
    <hr>

    <tr>
        <td>
            <a href="mainPage_Login.jsp">返回主界面</a>
        </td>
    </tr>
</form>

</body>
</html>
