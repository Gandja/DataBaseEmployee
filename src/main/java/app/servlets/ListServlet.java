package app.servlets;

import app.entities.Employee;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Employee",
                    "postgres", "1111");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employeetable");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String fio = resultSet.getString("Фамилия") + " " + resultSet.getString("Имя") + " " + resultSet.getString("Отчество");
                Integer age = resultSet.getInt("Возраст");
                String sex = resultSet.getString("Пол");
                String position = resultSet.getString("Должность");
                Integer workTime = resultSet.getInt("Время работы");
                Employee employee = new Employee(id,fio,age,sex,workTime,position);
                Model model = Model.getInstance();
                model.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Model model = Model.getInstance();
        List<Employee> employees = model.list();
        req.setAttribute("employeesList",employees);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req,resp);
        /*String fio = req.getParameter("fio");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String sex = req.getParameter("sex");
        Double workTime = Double.parseDouble(req.getParameter("workTime"));
        String position = req.getParameter("position");
        Employee employee = new Employee(fio,age,sex,workTime,position);
        Model model = Model.getInstance();
        model.add(employee);
        req.setAttribute("addEmp",employee);
        doGet(req,resp);*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
