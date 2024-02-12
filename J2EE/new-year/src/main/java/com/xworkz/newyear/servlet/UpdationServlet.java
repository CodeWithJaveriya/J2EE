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


@WebServlet(urlPatterns = "/updationList")
public class UpdationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NewYearDTO dto = new NewYearDTO();

        dto.setId(Integer.parseInt(req.getParameter("userId")));
        dto.setFirstName(req.getParameter("firstName"));
        dto.setLastName(req.getParameter("lastName"));
        dto.setAddress(req.getParameter("address"));
        dto.setFees(Integer.parseInt(req.getParameter("fees")));

        NewYearService service = new NewYearServiceImpl();
        if(service.updateById(dto.getId(), dto)){
            req.setAttribute("updateMessage", "Update Successfully");
            RequestDispatcher dispatcher = req.getRequestDispatcher("updateList.jsp");
            dispatcher.forward(req,resp);
        }
        else {
            req.setAttribute("updateMessage", "update Unsuccessfully");
            RequestDispatcher dispatcher = req.getRequestDispatcher("updateList.jsp");
            dispatcher.forward(req,resp);

        }
    }



}
