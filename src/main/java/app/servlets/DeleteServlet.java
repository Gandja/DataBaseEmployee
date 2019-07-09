package app.servlets;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/delete.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Model model = Model.getInstance();
        for (int i = 0; i < model.list().size(); i++) {
            if (id.equals(model.list().get(i).getId())) {
                model.delete(model.list().get(i));
                for (int j = 0; j < model.list().size(); j++) {
                    if (model.list().get(j).getId() != 1) {
                        model.list().get(j).setId(model.list().get(j).getId() - 1);
                    }
                }
            }
        }
        doGet(req, resp);
    }
}
