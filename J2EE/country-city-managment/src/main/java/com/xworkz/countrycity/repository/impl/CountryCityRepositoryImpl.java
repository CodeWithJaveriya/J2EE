package com.xworkz.countrycity.repository.impl;

import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.countrycity.repository.CountryCityRepository;

import javax.persistence.EntityManager;

public class CountryCityRepositoryImpl implements CountryCityRepository {
    @Override
    public void save(CountryDTO countryDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(countryDTO);
        entityManager.getTransaction().commit();
        System.out.println("Successfully added!!!");
    }
}
