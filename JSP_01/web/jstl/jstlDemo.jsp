<%@ page import="user.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl练习</title>
</head>
<body>

<%
    List<User> list = new ArrayList<User>();
    list.add(new User("张三",12,new Date()));
    list.add(new User("李四",13,new Date()));
    list.add(new User("王五",14,new Date()));

    request.setAttribute("list",list);
%>

<table width="500" align="center" border="1" cellspacing="0">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <tr align="center">
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birStr}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
