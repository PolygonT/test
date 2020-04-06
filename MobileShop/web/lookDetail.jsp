<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2019/12/7
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情界面</title>
</head>
<body>
<form action="#">
    <table width="60%" align="center">
        <tr>
            <td rowspan="5" align="center">产品号${mobile.mobile_version}</td>
        </tr>
        <table width="60%" border="1" align="center">
            <tr>
                <th>产品号</th>
                <th>名称</th>
                <th>制造商</th>
                <th>价格</th>
                <th>放入购物车</th>
            </tr>
            <tr>
                <td>${mobile.mobile_version}</td>
                <td>${mobile.mobile_name}</td>
                <td>${mobile.mobile_made}</td>
                <td>${mobile.mobile_price}</td>
                <td><a href="${pageContext.request.contextPath}/addToCartServlet?mobile_version=${mobile.mobile_version}">加入购物车</a></td>
            </tr>
        </table>
        <table align="center" width="60%">
            <tr>
                <td align="center">产品详情：</td>
            </tr>
            <tr>
                <td align="center">${mobile.mobile_mess}</td>
            </tr>
            <br>
            <tr>
                <td align="center">
                    <img src="image/${mobile.mobile_pic}" align="center">
                </td>
            </tr>
        </table>
        <br>

        <tr>
            <td>
                <a href="mainPage_Login.jsp">返回主界面</a>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
