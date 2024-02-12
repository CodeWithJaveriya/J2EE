package com.xworkz.delivery.repository.impl;

import com.xworkz.delivery.dto.ZomatoDTO;
import com.xworkz.delivery.repository.ZomatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ZomatoRepositoryImpl implements ZomatoRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(ZomatoDTO zomatoDTO) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(zomatoDTO);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<ZomatoDTO> getAllUsers() {
        Query query = entityManagerFactory.createEntityManager().createNamedQuery("getAllDeliveries");
        return query.getResultList();
    }

    @Override
    public ZomatoDTO getUserById(int id) {
       ZomatoDTO dto = (ZomatoDTO) entityManagerFactory.createEntityManager().createNamedQuery("getUserById").setParameter("id",id).getSingleResult();
       return dto;
    }

    @Override
    public boolean updateById(int id, ZomatoDTO updatedUser) {
        EntityManager em = entityManagerFactory.createEntityManager();
        ZomatoDTO dto = em.find(ZomatoDTO.class, id);
        if(dto!= null){
            em.getTransaction().begin();
            dto.setUserName(updatedUser.getUserName());
            dto.setAddress(updatedUser.getAddress());
            dto.setFoodName(updatedUser.getFoodName());
            dto.setFoodQuantity(updatedUser.getFoodQuantity());
            dto.setPhoneNumber(updatedUser.getPhoneNumber());
            dto.setEmail(updatedUser.getEmail());
            em.getTransaction().commit();
            em.close();
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<ZomatoDTO> searchByUserName(String userName) {
        List<ZomatoDTO> list =  entityManagerFactory.createEntityManager().createNamedQuery("getUserByUserName").setParameter("un",userName).getResultList();
        return list;
    }

    @Override
    public List<ZomatoDTO> searchByEmail(String email) {
        List<ZomatoDTO> list = entityManagerFactory.createEntityManager().createNamedQuery("getUserByEmail").setParameter("em",email).getResultList();
        return list;
    }

    @Override
    public List<ZomatoDTO> searchByUserNameAndEmail(String userName, String email) {
        List<ZomatoDTO> list = entityManagerFactory.createEntityManager().createNamedQuery("getUserByUserNameAndEmail").setParameter("un", userName).setParameter("em",email).getResultList();
        return list;
    }


}
