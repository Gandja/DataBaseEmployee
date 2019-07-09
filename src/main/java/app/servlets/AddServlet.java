package app.servlets;

import app.entities.Employee;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
}
