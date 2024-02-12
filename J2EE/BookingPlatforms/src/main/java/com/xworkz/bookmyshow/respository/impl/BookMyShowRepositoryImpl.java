package com.xworkz.bookmyshow.respository.impl;


import com.xworkz.bookmyshow.constants.Language;
import com.xworkz.bookmyshow.dto.BookTicketsDTO;
import com.xworkz.bookmyshow.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bookmyshow.respository.BookMyShowRepository;

import javax.persistence.*;
import java.util.List;

public class BookMyShowRepositoryImpl implements BookMyShowRepository {


    // write db logic
    @Override
    public boolean save(BookTicketsDTO dto) {
        boolean isSaved = false;
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityTransaction.commit();
        isSaved = true;
        return isSaved ;

    }

    @Override
    public BookTicketsDTO getBookingInfoById(int id) {
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       BookTicketsDTO bookTicketsDTO=  entityManager.find(BookTicketsDTO.class, id);
        System.out.println(bookTicketsDTO);
        return bookTicketsDTO;
    }

    @Override
    public  boolean updateNoOfTicketsByMovieId(int noOfTickets, int id) {
boolean isUpdated = true;
     EntityManager entityManager = EntityManagerFactorySingleton.getFactory().
                createEntityManager();
               BookTicketsDTO bookTicketsDTO= entityManager.find(BookTicketsDTO.class, id);
               if(bookTicketsDTO != null){
                   bookTicketsDTO.setNoOfTickets(noOfTickets);
                   entityManager.getTransaction().begin();
                   entityManager.merge(bookTicketsDTO);
                   entityManager.getTransaction().commit();
                   System.out.println("Successfully updated");
               }
return isUpdated;
    }

    @Override
    public void deleteMovieInfoByMovieId(int id) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().
                createEntityManager();
        BookTicketsDTO bookTicketsDTO= entityManager.find(BookTicketsDTO.class, id);
        if(bookTicketsDTO != null){
            entityManager.getTransaction().begin();
            entityManager.remove(bookTicketsDTO);
            entityManager.getTransaction().commit();
            System.out.println("Successfully deleted");
        }
    }

    @Override
    public BookTicketsDTO getBookingInfoByMovieName(String movieName) {
     EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
     Query query = entityManager.createNamedQuery("findBookingInfoByMovieName").setParameter("movieName", movieName);
     BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) query.getSingleResult();
     return bookTicketsDTO;
    }

    @Override
    public List<BookTicketsDTO> fetchAllBookingInfo() {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("fetchAllBookingInfo");
        List<BookTicketsDTO> bookTicketsDTOList = query.getResultList();
        return bookTicketsDTOList;
    }

    @Override
    public BookTicketsDTO getBookingInfoByLanguage(Language language) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query = entityManager.createNamedQuery("fetchBookingInfoByLanguage").setParameter("lang", language);
        BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) query.getSingleResult();
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByLocation(String location) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
       BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) entityManager.createNamedQuery("fetchBookingInfoByLocation").setParameter("loc", location).getSingleResult();
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByTheatreName(String theatre) {
        BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("fetchBookingInfoByTheatreName").setParameter("thea", theatre).getSingleResult();
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByPrice(double price) {
        BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) Persistence.createEntityManagerFactory("com.xworkz").
                createEntityManager().
                createNamedQuery("fetchBookingInfoByPrice").setParameter("pc", price).
                getSingleResult();
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByTimings(String timings) {
        BookTicketsDTO bookTicketsDTO = (BookTicketsDTO) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("getBookingInfoByTimings").setParameter("timings", timings).getSingleResult();
        return bookTicketsDTO;
    }

    @Override
    public List<BookTicketsDTO> getAll() {
        List<BookTicketsDTO> list = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("fetchAll").getResultList();
        return list;
    }

    @Override
    public List<String> getTheatreNameByMovieName(String movieName) {
        List<String> list = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("fetchTheatreNameByMovieName").setParameter("nm", movieName).getResultList();
        return list;
    }

    @Override
    public List<String> getMovieNameAndTheatreNameUsingLocation(String location) {
        List<String> list = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("fetchMovieNameAndTheatreNameUsingLocation").setParameter("loc", location).getResultList();
        return list;
    }

    @Override
    public void updatePriceByTheatreName(String theatreName, double updatedPrice) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updatingPriceByTheatreName" ).setParameter("tn", theatreName).setParameter("pc", updatedPrice);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        System.out.println("Successfully updated!!");

    }

    @Override
    public void updateNoOfTicketsByMovieName(String movieName, int updatedNoOfTickets) {
      EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
      entityManager.getTransaction().begin();
      entityManager.createNamedQuery("updatingNoOfTicketsByMovieName").setParameter("mn", movieName).setParameter("not", updatedNoOfTickets).executeUpdate();
      entityManager.getTransaction().commit();
    }

    @Override
    public void deleteMovieByMovieId(int id) {
       EntityManager entityManager =  Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.createNamedQuery("deletingMovieByMovieId").setParameter("id", id).executeUpdate();
       entityManager.getTransaction().commit();
    }
}
