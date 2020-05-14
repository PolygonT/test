<%--
  Created by IntelliJ IDEA.
  User: xwh
  Date: 2020/5/14
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>testAjax</title>
    <script src="js/jquery-3.5.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"/ajax/testAjax",
                    data:{"username":"tom","age":23},
                    dataType:"text",    //设置接收到的响应数剧的格式
                    type:"POST",
                    contentType:"application/json;charset=UTF-8",
                    success:function () {  //响应成功后执行此函数
                        alert(this.data);
                    }
                })
            });
        })
    </script>
</head>
<body>
<input type="button" id="btn" value="test">
</body>
</html>
