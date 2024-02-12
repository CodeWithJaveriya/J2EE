package com.xworkz.newyear.servlet;

import com.xworkz.newyear.dto.NewYearDTO;
import com.xworkz.newyear.service.NewYearService;
import com.xworkz.newyear.service.impl.NewYearServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/users")
public class GetRegistersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewYearService service = new NewYearServiceImpl();
        List<NewYearDTO> list = service.getAllRegistrations();

        req.setAttribute("usersList", list);

        RequestDispatcher dispatcher = req.getRequestDispatcher("registerList.jsp");
        dispatcher.forward(req, resp);
    }
}
