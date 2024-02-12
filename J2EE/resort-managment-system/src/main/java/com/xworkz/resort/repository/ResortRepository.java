package com.xworkz.resort.repository;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.dto.FeedbackDTO;

import java.util.List;

public interface ResortRepository {

    public boolean addBookings(BookingsDTO bookingsDTO);

    public boolean addFeedback(FeedbackDTO feedbackDTO);

    public List<BookingsDTO> getDetailsOfVisitors();
}
