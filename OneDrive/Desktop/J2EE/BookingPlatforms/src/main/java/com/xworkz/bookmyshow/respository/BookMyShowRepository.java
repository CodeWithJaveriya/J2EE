package com.xworkz.bookmyshow.respository;

import com.xworkz.bookmyshow.constants.Language;
import com.xworkz.bookmyshow.dto.BookTicketsDTO;

import java.util.List;

public interface BookMyShowRepository {

    public boolean save(BookTicketsDTO dto);

    public BookTicketsDTO getBookingInfoById(int id);

    public boolean updateNoOfTicketsByMovieId(int noOfTickets, int id);

    public void deleteMovieInfoByMovieId(int id);

    public  BookTicketsDTO getBookingInfoByMovieName(String movieName);

    public List<BookTicketsDTO> fetchAllBookingInfo();

    public BookTicketsDTO getBookingInfoByLanguage(Language language);

    public BookTicketsDTO getBookingInfoByLocation(String location);

    public BookTicketsDTO getBookingInfoByTheatreName(String theatre);

    public BookTicketsDTO getBookingInfoByPrice(double price);

    public BookTicketsDTO getBookingInfoByTimings(String timings);

    public List<BookTicketsDTO> getAll();

    public List<String> getTheatreNameByMovieName(String movieName);

    public List<String> getMovieNameAndTheatreNameUsingLocation(String location);
    public void updatePriceByTheatreName(String theatreName, double updatedPrice);

    public void updateNoOfTicketsByMovieName(String movieName, int updatedNoOfTickets);

    public void deleteMovieByMovieId(int id);

}
