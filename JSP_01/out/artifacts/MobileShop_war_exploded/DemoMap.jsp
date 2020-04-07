<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.domain.Mobile" %>
<%@ page import="com.service.MobileService" %>
<%@ page import="com.service.impl.MobileServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    MobileService service = new MobileServiceImpl();

    Map<Integer, Mobile> map = new HashMap<Integer, Mobile>();
    Mobile mobile = new Mobile();

    int i = 0;

    mobile = service.findPhoneByVersion("A89S6");
    map.put(i++,mobile);
    mobile = service.findPhoneByVersion("B8978");
    map.put(i++,mobile);
    mobile = service.findPhoneByVersion("C555");
    map.put(i++,mobile);
    mobile = service.findPhoneByVersion("A7865");
    map.put(i++,mobile);

    System.out.println(map);

    request.setAttribute("map",map);
%>

<c:forEach items="${map.keySet()}" var="key" varStatus="s">
    ${map.get(key).mobile_version}
</c:forEach>


</body>
</html>
