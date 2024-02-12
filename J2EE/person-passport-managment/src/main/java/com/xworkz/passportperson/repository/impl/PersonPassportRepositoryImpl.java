package com.xworkz.passportperson.repository.impl;

import com.xworkz.passportperson.dto.PassportDTO;
import com.xworkz.passportperson.dto.PersonDTO;
import com.xworkz.passportperson.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.passportperson.repository.PersonPassportRepository;

import javax.persistence.EntityManager;

public class PersonPassportRepositoryImpl implements PersonPassportRepository {
    @Override
    public void save(PersonDTO personDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(personDTO);
        entityManager.getTransaction().commit();
        System.out.println("Successfully Added");
    }
}
