<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2020/5/7
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>
    <%--@RequestParam   参数名称的对应--%>
    <h3><a href="anno/testRequestParam?username=1234">RequestParam</a></h3>

    <%--@ResquestBody   获取整个请求体的参数--%>
    <form action="anno/testRequestBody" method="post">
        姓名<input type="text"/><br/>
        年龄<input type="text"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>

    <%--@PathVariable   restfule编程风格--%>
    <h3><a href="/anno/testPathVariable/10">PathVariable</a></h3>

    <%--@RequestHeader   获取请求头信息--%>
    <h3><a href="/anno/testRequestHeader">RequestHeader</a></h3>

    <%--@RequestHeader   获取请求头信息--%>
    <h3><a href="/anno/testCookieValue">CookieValue</a></h3>

    <%--@ModelAttribute--%>
    <form action="anno/testModelAttribute" method="post">
        id<input type="text"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>

    <%--@SessionAttributes--%>
    <h3><a href="/anno/testSessionAttributes">SessionAttribute</a></h3><br>

    <h3><a href="/anno/getSessionAttributes">getSessionAttribute</a></h3><br>

    <h3><a href="/anno/delSessionAttributes">delSessionAttribute</a></h3><br>

</body>
</html>
