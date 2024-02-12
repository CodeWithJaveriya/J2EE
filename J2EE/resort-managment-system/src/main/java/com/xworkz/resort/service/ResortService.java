package com.xworkz.resort.service;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.dto.FeedbackDTO;

import java.util.List;

public interface ResortService {

    public boolean validateAndSaveBookings(BookingsDTO bookingsDTO);

    public boolean validateAndSaveFeedback(FeedbackDTO feedbackDTO);

    public List<BookingsDTO> getBackDetails();
}
