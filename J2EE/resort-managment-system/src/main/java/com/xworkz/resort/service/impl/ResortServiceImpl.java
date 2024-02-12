package com.xworkz.resort.service.impl;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.dto.FeedbackDTO;
import com.xworkz.resort.repository.ResortRepository;
import com.xworkz.resort.repository.impl.ResortRepositoryImpl;
import com.xworkz.resort.service.ResortService;

import java.util.List;

public class ResortServiceImpl implements ResortService {

    ResortRepository resortRepository;

    public ResortServiceImpl(){
        resortRepository = new ResortRepositoryImpl();
    }
    @Override
    public boolean validateAndSaveBookings(BookingsDTO bookingsDTO) {
        boolean firstNameVerified = false;
        boolean lastNameVerified = false;
        boolean emailVerified = false;
        boolean phoneNumberVerified = false;
        boolean checkInVerified = false;
        boolean checkOutVerified = false;
        boolean paymentVerified = false;
        boolean adultsVerified = false;
        boolean childernVerified = false;
        boolean roomsVerified = false;
        if(bookingsDTO!= null){
            if(bookingsDTO.getFirstName()!= null){
                System.out.println("FirstName Verified");
                firstNameVerified = true;
            }
            if(bookingsDTO.getLastName()!= null){
                System.out.println("LastName Verified");
                lastNameVerified = true;
            }
            if(bookingsDTO.getEmail() != null){
                System.out.println("Email Verified");
                emailVerified = true;
            }
            if(bookingsDTO.getPhoneNumber() != 0){
                System.out.println("PhoneNumber Verified");
                phoneNumberVerified = true;
            }
            if(bookingsDTO.getCheckInDate() != null){
                System.out.println("Checkindate Verified");
                checkInVerified = true;
            }
            if(bookingsDTO.getCheckOutDate() != null){
                System.out.println("Checkoutdate Verified");
                checkOutVerified = true;
            }
            if(bookingsDTO.getModeOfPayment() != null){
                System.out.println("Payment Verified");
                paymentVerified = true;
            }
            if(bookingsDTO.getAdults() != 0){
                System.out.println("Adults Verified");
                adultsVerified = true;
            }
            if(bookingsDTO.getChildren() != 0){
                System.out.println("Children Verified");
                childernVerified = true;
            }
            if(bookingsDTO.getRooms() != 0){
                System.out.println("Rooms Verified");
                roomsVerified = true;
            }
            if(firstNameVerified== true && lastNameVerified == true && phoneNumberVerified== true &&
           emailVerified== true && checkInVerified== true && checkOutVerified==true && paymentVerified== true &&
            adultsVerified == true && childernVerified == true && roomsVerified==true){
                resortRepository.addBookings(bookingsDTO);
                return true;
            }else {
                System.out.println("Details are missing");
            }
        }
      return false;
    }

    @Override
    public boolean validateAndSaveFeedback(FeedbackDTO feedbackDTO) {
        boolean nameVerified = false;
        boolean emailVerified = false;
        boolean commentsVerified = false;
        if(feedbackDTO != null){
            if(feedbackDTO.getName()!= null){
                nameVerified = true;
            }
            if(feedbackDTO.getEmail()!= null){
                emailVerified = true;
            }
            if(feedbackDTO.getComments()!= null){
                commentsVerified = true;
            }
            if(nameVerified==true && emailVerified==true && commentsVerified==true){
                resortRepository.addFeedback(feedbackDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<BookingsDTO> getBackDetails() {
        return resortRepository.getDetailsOfVisitors();
    }
}
