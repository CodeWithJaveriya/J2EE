package com.xworkz.blogs.repository.impl;

import com.xworkz.blogs.dto.BlogDTO;
import com.xworkz.blogs.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.blogs.repository.BlogRepo;

import javax.persistence.EntityManager;


public class BlogRepoImpl implements BlogRepo {
    @Override
    public boolean addPost(BlogDTO blogDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(blogDTO);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
