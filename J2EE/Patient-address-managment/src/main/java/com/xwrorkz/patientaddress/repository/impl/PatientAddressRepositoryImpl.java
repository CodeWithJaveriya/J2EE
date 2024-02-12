package com.xwrorkz.patientaddress.repository.impl;

import com.xwrorkz.patientaddress.dto.PatientDTO;
import com.xwrorkz.patientaddress.entitymanager.EntityManagerFactorySingleton;
import com.xwrorkz.patientaddress.repository.PatientAddressRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PatientAddressRepositoryImpl implements PatientAddressRepository {
    @Override
    public void save(PatientDTO patientDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(patientDTO);
        entityManager.getTransaction().commit();
        System.out.println("Successfully added");
    }
}