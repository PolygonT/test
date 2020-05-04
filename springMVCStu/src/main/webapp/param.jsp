<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试请求参数绑定实体类</title>
</head>
<body>
    <form action="param/saveAccount" method="post">
        <table border="1">
            <tr>
                <td>账号</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>
                <td>金额</td>
                <td><input type="text" name="money"></td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="user.name"></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="user.age"></td>
            </tr>
            <tr>
                <td rowspan=2><input type="submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
