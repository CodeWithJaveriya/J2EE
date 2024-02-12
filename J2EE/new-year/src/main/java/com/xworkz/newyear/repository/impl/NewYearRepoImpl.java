package com.xworkz.newyear.repository.impl;

import com.xworkz.newyear.dto.NewYearDTO;
import com.xworkz.newyear.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.newyear.repository.NewYearRepo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class NewYearRepoImpl implements NewYearRepo {
    @Override
    public boolean save(NewYearDTO newYearDTO) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(newYearDTO);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<NewYearDTO> getAllRegistrations() {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = em.createNamedQuery("getAllRegistrations");
      return query.getResultList();
    }

    @Override
    public NewYearDTO getUserById(int id) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        NewYearDTO dto = (NewYearDTO) em.createNamedQuery("getUserById").setParameter("id", id).getSingleResult();
      return dto;

    }

    @Override
    public boolean updateById(int id, NewYearDTO updatedRegistrations) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        NewYearDTO newYearDTO = em.find(NewYearDTO.class, id);
        if(newYearDTO!=null){
            em.getTransaction().begin();
           newYearDTO.setFirstName(updatedRegistrations.getFirstName());
           newYearDTO.setLastName(updatedRegistrations.getLastName());
           newYearDTO.setAddress(updatedRegistrations.getAddress());
           newYearDTO.setFees(updatedRegistrations.getFees());
           em.getTransaction().commit();
           return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();
        em.close();
        return true;
    }
}
