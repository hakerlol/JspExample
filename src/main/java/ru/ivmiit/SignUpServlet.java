package ru.ivmiit;

import ru.ivmiit.models.User;
import ru.ivmiit.repositories.UsersReposiroty;
import ru.ivmiit.repositories.UsersRepositoryInMemory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    private UsersReposiroty usersReposiroty;

    @Override
    public void init() throws ServletException {
        this.usersReposiroty = new UsersRepositoryInMemory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersReposiroty.findAll();
        req.setAttribute("usersFromServer", users);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/jsp/signUp.jsp");
        requestDispatcher.forward(req, resp);
    }
}