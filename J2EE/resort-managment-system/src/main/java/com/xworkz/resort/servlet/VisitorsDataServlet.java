package com.xworkz.resort.servlet;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.impl.ResortServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/details")
public class VisitorsDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ResortService resortService = new ResortServiceImpl();
        List<BookingsDTO> bookingsDTO = resortService.getBackDetails();

        req.setAttribute("bookingsList", bookingsDTO);

        RequestDispatcher dispatcher = req.getRequestDispatcher("view-details.jsp");
        dispatcher.forward(req, resp);
    }
}
