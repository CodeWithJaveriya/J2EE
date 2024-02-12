package com.xworkz.bankatm.repository.impl;

import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bankatm.repository.BankAtmRepository;

import javax.persistence.EntityManager;

public class BankAtmRepositoryImpl implements BankAtmRepository {
    @Override
    public void save(BankAccountDTO accountDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(accountDTO);
        entityManager.getTransaction().commit();
        System.out.println("Successfully Added");
    }
}
