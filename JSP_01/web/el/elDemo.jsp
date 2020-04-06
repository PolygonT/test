<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>el表达式</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("cc");

        request.setAttribute("list",list);
    %>

    ${list}
</body>
</html>
