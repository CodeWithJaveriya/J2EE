package com.xworkz.blogs.servlet;

import com.xworkz.blogs.dto.BlogDTO;
import com.xworkz.blogs.service.impl.BlogServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/blog")
public class BlogServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String author = req.getParameter("author");
        String creationDate = req.getParameter("creationDate");
        String category = req.getParameter("category");

        BlogServiceImpl service = new BlogServiceImpl();
        BlogDTO dto = new BlogDTO();
        service.validateAndSave(dto);
        dto.setAuthor(author);
        dto.setTitle(title);
        dto.setContent(content);
        dto.setCreationDate(creationDate);
        dto.setCategory(category);

        boolean isValidated = service.validateAndSave(dto);

        if(isValidated ==true) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("output.jsp");
            dispatcher.forward(req, resp);
        }else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("error.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
