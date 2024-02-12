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

@WebServlet(urlPatterns = "/update")
public class UpdateFindServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String id = req.getParameter("userId");

      if(id!= null){
          req.setAttribute("userId", Integer.parseInt(id));

          NewYearService service = new NewYearServiceImpl();
          NewYearDTO dto = service.getUserById(Integer.parseInt(id));

          req.setAttribute("user", dto);
          RequestDispatcher dispatcher = req.getRequestDispatcher("updateList.jsp");
          dispatcher.forward(req, resp);
      }
      else {
          System.out.println("ID is null");
      }
    }
}
