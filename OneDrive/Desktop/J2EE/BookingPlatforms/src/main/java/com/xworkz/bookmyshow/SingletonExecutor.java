package com.xworkz.bookmyshow;

import com.xworkz.bookmyshow.entitymanager.EntityManagerFactorySingleton;

import javax.persistence.EntityManagerFactory;

public class SingletonExecutor {

    public static void main(String[] args) {

      EntityManagerFactory entityManagerFactory=  EntityManagerFactorySingleton.getFactory();
        System.out.println(entityManagerFactory);

        EntityManagerFactory entityManagerFactory1=  EntityManagerFactorySingleton.getFactory();
        System.out.println(entityManagerFactory1);

       /* Pointing an object to same reference
       org.hibernate.internal.SessionFactoryImpl@46d8f407
        org.hibernate.internal.SessionFactoryImpl@46d8f407*/

    }
}
