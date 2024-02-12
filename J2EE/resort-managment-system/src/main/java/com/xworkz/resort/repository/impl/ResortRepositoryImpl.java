package com.xworkz.resort.repository.impl;

import com.xworkz.resort.dto.BookingsDTO;
import com.xworkz.resort.dto.FeedbackDTO;
import com.xworkz.resort.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.resort.repository.ResortRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ResortRepositoryImpl implements ResortRepository {
    @Override
    public boolean addBookings(BookingsDTO bookingsDTO) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(bookingsDTO);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean addFeedback(FeedbackDTO feedbackDTO) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(feedbackDTO);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<BookingsDTO> getDetailsOfVisitors() {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = em.createNamedQuery("getAllVisitorDetails");
       return query.getResultList();
    }
}
