package com.xworkz.feedback.servlet;

import com.xworkz.feedback.dto.FeedbackDTO;
import com.xworkz.feedback.service.FeedbackService;
import com.xworkz.feedback.service.impl.FeedbackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feed" ,loadOnStartup = +1)
public class FeedbackServlet  extends HttpServlet {


    public FeedbackServlet(){
        System.out.println("Constructor invocked");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initialization is done");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name =  req.getParameter("name");
       String email =  req.getParameter("email");
       String comments =  req.getParameter("comments");

        FeedbackDTO feedbackDTO = new FeedbackDTO();
        feedbackDTO.setName(name);
        feedbackDTO.setEmail(email);
        feedbackDTO.setComments(comments);
        FeedbackService feedbackService = new FeedbackServiceImpl();
        feedbackService.validateAndSave(feedbackDTO);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
        dispatcher.forward(req, resp);

    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}
