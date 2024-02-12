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


@WebServlet(urlPatterns = "/register" , loadOnStartup = +1)
public class RegistrationServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String address = req.getParameter("address");
        String fees = req.getParameter("fees");

        NewYearService service = new NewYearServiceImpl();
        NewYearDTO dto = new NewYearDTO();

        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        dto.setAddress(address);
        dto.setFees(Integer.parseInt(fees));
        service.save(dto);

        req.setAttribute("registrationSuccessful", "Registration Successfully Completed!!");

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
        dispatcher.forward(req, resp);


    }
}
