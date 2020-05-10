<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2020/5/3
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
yes bruh
<hr>
${msg} <%--在request域中找--%>
${sessionScope.get("msg")}
</body>
</html>
