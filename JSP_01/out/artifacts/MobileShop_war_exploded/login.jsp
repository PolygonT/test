<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginServlet" method="post">
    <table align="center">
        <tr align="center">
            <th>登录</th>
        </tr>

        <tr>
            <td>账号<input type="text" name="logname" placeholder="请输入账号"></td>
        </tr>

        <tr>
            <td>密码<input type="password" name="password" placeholder="请输入密码"></td>
        </tr>

        <tr>
            <td align="center">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>

<div align="center">${requestScope.login_msg}</div>

</body>
</html>
