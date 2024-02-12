package com.xworkz.feedback.repository;

import com.xworkz.feedback.dto.FeedbackDTO;

public interface FeedbackRepo {


    public boolean save(FeedbackDTO dto);
}
