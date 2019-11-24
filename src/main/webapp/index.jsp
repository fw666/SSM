<%--
  Created by IntelliJ IDEA.
  User: 12
  Date: 2019/11/11
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
index
<br>
<form action="/user/selectUser" method="post">
    <input type="text" name="id" value="1">
    <br>
    <input type="submit" value="submit">
</form>
<a href="/user/selectUser">selectUser</a>
</body>
</html>
