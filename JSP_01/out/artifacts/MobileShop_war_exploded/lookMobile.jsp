<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2019/12/6
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>浏览手机页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findByPageServlet" method="post">
    <table>
        <tr>
           <td>
               <h1>选择某类手机</h1>
           </td>
        </tr>
        <tr>
            <td>
                </h1>分页显示这类手机 </h1>
            </td>
        </tr>
        <tr>
            <td>
                <select name="mobile_made">
                    <option value="%.%">全部</option>
                    <option value="Apple_Inc.">苹果手机</option>
                    <option value="Samsung_group.">三星手机</option>
                    <option value="ZTE_Corporation.">中兴手机</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
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
