package com.xworkz.newyear.servlet;

import com.xworkz.newyear.service.NewYearService;
import com.xworkz.newyear.service.impl.NewYearServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteRegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String id =  req.getParameter("userId");

        NewYearService service = new NewYearServiceImpl();
        boolean deleted = service.deleteById(Integer.parseInt(id));

        if(deleted){
            resp.sendRedirect("users");
        }

    }
}
