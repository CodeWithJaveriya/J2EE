package com.xworkz.bookmyshow.service.impl;

import com.xworkz.bookmyshow.constants.Language;
import com.xworkz.bookmyshow.dto.BookTicketsDTO;
import com.xworkz.bookmyshow.respository.BookMyShowRepository;
import com.xworkz.bookmyshow.respository.impl.BookMyShowRepositoryImpl;
import com.xworkz.bookmyshow.service.BookMyShowService;

import java.util.List;

public class BookMyShowServiceImpl implements BookMyShowService {

    BookMyShowRepository bookMyShowRepository;

    public BookMyShowServiceImpl(){
        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }
    @Override
    public void validateMovieTicketsAndSave(BookTicketsDTO dto) {
        System.out.println("Welcome to validation of movie tickets!!! Please hold on... We are validating your data");
        boolean isTicketsValidated = false;
        boolean isLocationValidated = false;
        boolean isTheatreValidated = false;
        boolean isNameValidated = false;
        boolean isLanguageValidated = false;
        boolean isPriceValidated = false;
        boolean isTimingsValidated = false;
        if(dto != null){

            if(dto.getNoOfTickets() >0){
                isTicketsValidated = true;
            }
            if(dto.getLocation() != null){
                isLocationValidated = true;
            }
            if(dto.getTheatre() != null){
                isTheatreValidated = true;
            }
            if(dto.getName() != null){
                isNameValidated = true;
            }
            if(dto.getLanguage() != null){
                isLanguageValidated = true;
            }
            if(dto.getPrice() > 0){
                isPriceValidated = true;
            }
            if(dto.getTime() != null){
                isTimingsValidated = true;
            }

        }
        if(isLocationValidated == true && isTicketsValidated==true && isTimingsValidated == true
        && isNameValidated == true && isLanguageValidated == true && isPriceValidated == true
        && isTheatreValidated == true) {
            bookMyShowRepository.save(dto);
            System.out.println("Your details are validated!!! You can proceed!!");
        }

    }

    @Override
    public BookTicketsDTO getBookingInfoById(int id) {
        System.out.println("Validating your id... Please hold on.. ");
        BookTicketsDTO dto = null;
        if(id != 0){
            dto = bookMyShowRepository.getBookingInfoById(id);
            System.out.println("Your id is validated!!! You can proceed!!!");
        }
        return dto;
    }

    @Override
    public void updateNoOfTicketsByMovieId(int noOfTickets, int id) {
        System.out.println("Validating your update method through movie id!!! Please hold on!!!");
        if(noOfTickets > 0 && id >0){
            bookMyShowRepository.updateNoOfTicketsByMovieId(noOfTickets, id);
            System.out.println("Yeahh!!! It's validated... You can proceed");
        }
    }

    @Override
    public void deleteMovieInfoByMovieId(int id) {
        System.out.println("Validating your delete method!!! Please hold on!!!");
        if(id > 0){
            bookMyShowRepository.deleteMovieInfoByMovieId(id);
            System.out.println("Yeahh!!! It's validated... You can proceed");
        }
    }

    @Override
    public BookTicketsDTO getBookingInfoByMovieName(String movieName) {
        System.out.println("Validating your getBookingInfoByMovieName method!!! Please hold on!!!");
        BookTicketsDTO dto = bookMyShowRepository.getBookingInfoByMovieName(movieName);
        if(dto != null){
            System.out.println("Your getBookingInfoByMovieName method is validated!!!!");
        }
        return dto;
    }

    @Override
    public List<BookTicketsDTO> fetchAllBookingInfo() {
        return bookMyShowRepository.fetchAllBookingInfo();
    }

    @Override
    public BookTicketsDTO getBookingInfoByLanguage(Language language) {
        BookTicketsDTO bookTicketsDTO = bookMyShowRepository.getBookingInfoByLanguage(language);
        if(bookTicketsDTO != null){
            System.out.println("Your booking info to get language method is validated..");
        }
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByLocation(String location) {
        BookTicketsDTO bookTicketsDTO = bookMyShowRepository.getBookingInfoByLocation(location);
        if(bookTicketsDTO != null){
            System.out.println("Your method of getting info by location is validated");
        }
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByTheatreName(String theatre) {
        BookTicketsDTO dto = bookMyShowRepository.getBookingInfoByTheatreName(theatre);
        if(dto != null){
            System.out.println("Your method of getting theatre name by info is validated");
        }
        return dto;
    }

    @Override
    public BookTicketsDTO getBookingInfoByPrice(double price) {
        BookTicketsDTO bookTicketsDTO = bookMyShowRepository.getBookingInfoByPrice(price);
        if(bookTicketsDTO != null){
            System.out.println("Your method of getting price through booking info is validated");
        }
        return bookTicketsDTO;
    }

    @Override
    public BookTicketsDTO getBookingInfoByTimings(String timings) {
        BookTicketsDTO bookTicketsDTO = bookMyShowRepository.getBookingInfoByTimings(timings);
        if(bookTicketsDTO != null){
            System.out.println("Your method of getting timings through booking info is validated");
        }
        return bookTicketsDTO;
    }

    @Override
    public List<BookTicketsDTO> getAll() {
        return bookMyShowRepository.getAll();
    }

    @Override
    public List<String> getTheatreNameByMovieName(String movieName) {
        return bookMyShowRepository.getTheatreNameByMovieName(movieName);
    }

    @Override
    public List<String> getMovieNameAndTheatreNameUsingLocation(String location) {
        return bookMyShowRepository.getMovieNameAndTheatreNameUsingLocation(location);
    }

    @Override
    public void updatePriceByTheatreName(String theatreName, double updatedPrice) {
        if(theatreName != null && updatedPrice != 0.0 && !theatreName.isEmpty()){
            bookMyShowRepository.updatePriceByTheatreName(theatreName, updatedPrice);
        }
    }

    @Override
    public void updateNoOfTicketsByMovieName(String movieName, int updatedNoOfTickets) {
        if(movieName != null && updatedNoOfTickets != 0 && !movieName.isEmpty()){
            bookMyShowRepository.updateNoOfTicketsByMovieName(movieName, updatedNoOfTickets);
        }
    }

    @Override
    public void deleteMovieByMovieId(int id) {
        if(id != 0){
            bookMyShowRepository.deleteMovieByMovieId(id);
        }
    }
}
