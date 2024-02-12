package com.xworkz.feedback.service.impl;

import com.xworkz.feedback.dto.FeedbackDTO;
import com.xworkz.feedback.repository.FeedbackRepo;
import com.xworkz.feedback.repository.impl.FeedbackRepoImpl;
import com.xworkz.feedback.service.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService {

    FeedbackRepo feedbackRepo;

    public FeedbackServiceImpl(){
        feedbackRepo = new FeedbackRepoImpl();
    }
    @Override
    public boolean validateAndSave(FeedbackDTO dto) {
        System.out.println("Validating service method");
        boolean nameVerified = false;
        boolean emailVerified = false;
        boolean commentsVerified = false;
        if(dto != null){
            if(dto.getName() != null){
                nameVerified = true;
            }
            if(dto.getEmail() != null){
                emailVerified = true;
            }
            if(dto.getComments() != null){
                commentsVerified = true;
            }
            if(nameVerified==true && emailVerified == true && commentsVerified == true){
                feedbackRepo.save(dto);
                return true;
            }else{
                System.out.println("Details are not correct");
            }
        }
        return false;
    }
}
