package com.xworkz.mobilebatter.repository.impl;

import com.xworkz.mobilebatter.dto.MobileDTO;
import com.xworkz.mobilebatter.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.mobilebatter.repository.MobileBatteryRepository;

import javax.persistence.EntityManager;

public class MobileBatteryRepositoryImpl implements MobileBatteryRepository {
    @Override
    public void save(MobileDTO mobileDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mobileDTO);
        entityManager.getTransaction().commit();
        System.out.println("Successfully added");
    }
}
