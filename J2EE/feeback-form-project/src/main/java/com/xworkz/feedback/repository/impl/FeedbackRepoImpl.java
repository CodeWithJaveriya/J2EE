package com.xworkz.feedback.repository.impl;

import com.xworkz.feedback.dto.FeedbackDTO;
import com.xworkz.feedback.entitymanger.EntityManagerFactorySingleton;
import com.xworkz.feedback.repository.FeedbackRepo;

import javax.persistence.EntityManager;

public class FeedbackRepoImpl implements FeedbackRepo {
    @Override
    public boolean save(FeedbackDTO dto) {
        System.out.println("This is repository method");
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        em.close();
        return false;
    }
}
