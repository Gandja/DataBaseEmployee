<%@ page import="java.util.List" %>
<%@ page import="app.entities.Employee" %><%--
  Created by IntelliJ IDEA.
  User: dgandzha
  Date: 03.07.2019
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<div>
    <h1>List employee</h1>
</div>

<%
    List<Employee> employees = (List<Employee>) request.getAttribute("employeesList");
    if (employees != null && !employees.isEmpty()) {
        out.println("<ui>");
        for (Employee s : employees) {
            out.println("<li>" + s.getFio() + " " + s.getPosition() + " " + s.getSex() + " " + s.getAge() + " " + s.getWorkTime() + "</li>");
        }
        out.println("</ui>");
    } else out.println("<p>There are no employees yet!</p>");
%>
<div>
    <button onclick="location.href='/DataBaseEmployee_war_exploded'">Back to main</button>
</div>

</body>
</html>
