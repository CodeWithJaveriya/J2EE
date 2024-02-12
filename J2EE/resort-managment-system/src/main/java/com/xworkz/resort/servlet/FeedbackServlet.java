package com.xworkz.resort.servlet;

import com.xworkz.resort.dto.FeedbackDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.impl.ResortServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback" , loadOnStartup = +1)
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String comments = req.getParameter("comments");

        FeedbackDTO feedbackDTO = new FeedbackDTO();
        feedbackDTO.setName(name);
        feedbackDTO.setEmail(email);
        feedbackDTO.setComments(comments);
        ResortService resortService = new ResortServiceImpl();
        resortService.validateAndSaveFeedback(feedbackDTO);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);
    }
}
