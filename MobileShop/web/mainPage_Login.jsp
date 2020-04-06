<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>智多星手机销售网</title>
</head>
<body>

<table width="100%">
    <tr>
        <td align="center"><h1>"智多星"智能手机销售网</h1></td>
    </tr>
    <tr>
        <table width="600" align="center">
            <tr>
                <td><h4>欢迎您${sessionScope.username}</h4></td>
                <td><a href="${pageContext.request.contextPath}/index.jsp">主页</a></td>
                <td><a href="${pageContext.request.contextPath}/findByPageServlet">浏览手机</a></td>
                <td><a href="${pageContext.request.contextPath}/lookMobile.jsp">查询手机</a></td>
                <td><a href="${pageContext.request.contextPath}/lookShoppingCart.jsp">查看购物车</a></td>
                <td><a href="${pageContext.request.contextPath}/lookOrder.jsp">查看订单</a></td>
                <td><a href="${pageContext.request.contextPath}/login.jsp">退出</a></td>
            </tr>
        </table>
    </tr>
    <tr>
        <td>
            <div align="center"><h4><font color="blue">欢迎光临“智多星”智能手机销售网</font></h4></div>
        </td>
    </tr>
    <tr>
        <td>
            <div align="center"><img src="image/welcome.jpg" width="600" height="429"></div>
        </td>
    </tr>


</table>

</body>
</html>
