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
    <title>Add</title>
</head>
<body>
<div>
    <h1>Add employee</h1>
</div>
<div>
    <%
        if(request.getAttribute("addEmp")!= null){
            out.println("<p> Employee added! </p>");
        }
    %>
</div>
<form method="post">
    <label>ФИО:
        <input type="text" name="fio"><br />
    </label>

    <label>Возраст:
        <input type="number" name="age"><br />
    </label>

    <label>Пол:
        <input type="text" name="sex">
    </label>

    <label>Время работы:
    <input type="number" name="workTime">
    </label>

    <label>Должность:
        <input type="text" name="position">
    </label>
    <button type="submit">Отправить</button>
</form>
<div>
    <button onclick="location.href='/DataBaseEmployee_war_exploded'">Back to main</button>
</div>

</body>
</html>
