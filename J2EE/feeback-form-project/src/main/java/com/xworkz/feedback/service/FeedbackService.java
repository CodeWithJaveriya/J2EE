package com.xworkz.feedback.service;

import com.xworkz.feedback.dto.FeedbackDTO;

public interface FeedbackService {

    public boolean validateAndSave(FeedbackDTO dto);

}
