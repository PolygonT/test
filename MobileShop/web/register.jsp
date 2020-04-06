<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2019/12/4
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerServlet" method="post">
    <table align="center">
        <tr>
            <th>注册</th>
        </tr>

        <tr>
            <td>账号<input type="text" name="logname" placeholder="请输入账号"></td>
        </tr>

        <tr>
            <td>密码<input type="password" name="password" placeholder="请输入密码"></td>
        </tr>

        <tr>
            <td>电话<input type="text" name="phone" placeholder="请输入电话号码"></td>
        </tr>

        <tr>
            <td>地址<input type="text" name="address" placeholder="请输入地址"></td>
        </tr>

        <tr>
            <td>姓名<input type="text" name="realname" placeholder="请输入真实姓名"></td>
        </tr>

        <tr>
            <td align="center"><input type="submit" value="注册"></td>
        </tr>

    </table>
</form>
<div align="center">${requestScope.register_msg}</div>

</body>
</html>
