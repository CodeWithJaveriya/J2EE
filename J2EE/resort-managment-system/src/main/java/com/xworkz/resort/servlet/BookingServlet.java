package com.xworkz.resort.servlet;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.impl.ResortServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/bookings", loadOnStartup = +1)
public class BookingServlet extends HttpServlet {

    public BookingServlet(){
        System.out.println("Constructor is invoked");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initialization is done");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String firstName = req.getParameter("firstName");
   String lastName = req.getParameter("lastName");
   String email = req.getParameter("email");
   String contactNumber = req.getParameter("phoneNumber");
   String modeOfPayment = req.getParameter("modeOfPayment");
   String checkInDate = req.getParameter("checkInDate");
   String checkOutDate = req.getParameter("checkOutDate");
   String adults = req.getParameter("adults");
   String children = req.getParameter("children");
   String rooms = req.getParameter("rooms");

        ResortService resortService = new ResortServiceImpl();
        BookingsDTO bookingsDTO = new BookingsDTO();
        bookingsDTO.setFirstName(firstName);
        bookingsDTO.setLastName(lastName);
        bookingsDTO.setEmail(email);
        bookingsDTO.setPhoneNumber(Long.parseLong(contactNumber));
        bookingsDTO.setModeOfPayment(modeOfPayment);
        bookingsDTO.setCheckInDate(checkInDate);
        bookingsDTO.setCheckOutDate(checkOutDate);
        bookingsDTO.setAdults(Integer.parseInt(adults));
        bookingsDTO.setChildren(Integer.parseInt(children));
        bookingsDTO.setRooms(Integer.parseInt(rooms));

        resortService.validateAndSaveBookings(bookingsDTO);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);


    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}
