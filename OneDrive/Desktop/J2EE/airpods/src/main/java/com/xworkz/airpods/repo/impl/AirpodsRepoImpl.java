package com.xworkz.airpods.repo.impl;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repo.AirpodsRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AirpodsRepoImpl implements AirpodsRepo {



    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager em = emf.createEntityManager();



    public boolean store(AirpodsDto dto1) {


        if(em!=null) {
            em.getTransaction().begin();
            em.persist(dto1);
            em.getTransaction().commit();
            em.close();
            System.out.println("Successfully inserted");
            return true;
        }

        return false;
    }



    public boolean updateColorByName(String color, String name) {
        if(em!=null) {
            em.getTransaction().begin();
            Query query = em.createNamedQuery("updateColorByName");
            query.setParameter("col", color);
            query.setParameter("nm", name);
            query.executeUpdate();
            em.getTransaction().commit();
            System.out.println("Successfully updated");
            return true;

        }
        return false;
    }



    public boolean deleteByPrice(int price) {
        if(em != null) {
            em.getTransaction().begin();
            Query query = em.createNamedQuery("deleteByPrice");
            query.setParameter("pr", price).executeUpdate();
            em.getTransaction().commit();
            System.out.println("Successfully deleted");
            return true;

        }
        return false;
    }



    public List<AirpodsDto> readAll() {
        em.getTransaction().begin();
        Query query = em.createNamedQuery("readAll");
        List<AirpodsDto> list =  query.getResultList();
        em.getTransaction().commit();
        return list;
    }
}
