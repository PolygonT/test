<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>手机查看界面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/findByPageServlet" method="post">
    <table width="80%" align="center">
        <tr>
            <td colspan="6">当前显示的内容是：</td>
        </tr>

        <tr>
            <td colspan="6">全部记录数</td>
        </tr>

        <table border="1" width="80%" align="center">
            <tr>
                <th>手机标识号</th>
                <th>手机名称</th>
                <th>手机制造商</th>
                <th>手机价格</th>
                <th>查看详情</th>
                <th>添加到购物车</th>
            </tr>
            <c:forEach items="${pb.list}" var="mobile" varStatus="s">
                <tr>
                    <td>${mobile.mobile_version}</td>
                    <td>${mobile.mobile_name}</td>
                    <td>${mobile.mobile_made}</td>
                    <td>${mobile.mobile_price}</td>
                    <td><a href="${pageContext.request.contextPath}/lookDetailServlet?mobile_version=${mobile.mobile_version}">查看细节</a></td>
                    <td><a href="${pageContext.request.contextPath}/addToCartServlet?mobile_version=${mobile.mobile_version}">添加到购物车</a></td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <tr>
            <td>
                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <li><a href="${pageContext.request.contextPath}/findByPageServlet?currentPage=${i}&rows=2&mobile_made=${pb.mobile_made}">${i}</a></li>
                </c:forEach>
            </td>
        </tr>
        <tr>
            <td>
                共显示${pb.totalPage}页，当前为第${pb.currentPage}页
            </td>
        </tr>
        <hr>

        <tr>
            <td>
                <a href="mainPage_Login.jsp">返回主界面</a>
            </td>
        </tr>
    </table>
</form>


</body>
</html>
