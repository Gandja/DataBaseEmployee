<%--
  Created by IntelliJ IDEA.
  User: dgandzha
  Date: 03.07.2019
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<div>
    <h1>Delete employee</h1>
</div>
<form method="post">
    <label>ID
    <input type="number" name="id">
    </label>
    <button type="submit">Удалить</button>
</form>
<div>
    <button onclick="location.href='/DataBaseEmployee_war_exploded'">Back to main</button>
</div>
</body>
</html>
