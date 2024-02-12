package com.xworkz.bookmyshow.dto;

import com.xworkz.bookmyshow.constants.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Data
@Table(name = "movie_tickets")
/*
@NamedQuery(name = "findAll", query = "select dto from BookTicketsDTO as dto")
*/
@NoArgsConstructor
@Builder
@AllArgsConstructor
//Consolidating all queries
@NamedQueries({@NamedQuery(name = "findBookingInfoByMovieName", query = " from BookTicketsDTO dto where dto.name = :movieName"),
               @NamedQuery(name = "fetchAllBookingInfo",  query = "from BookTicketsDTO"),
               @NamedQuery(name = "fetchBookingInfoByLanguage", query = "select dto from BookTicketsDTO dto where dto.language =:lang"),
               @NamedQuery(name = "fetchBookingInfoByLocation", query = "select dto from BookTicketsDTO dto where dto.location =:loc"),
               @NamedQuery(name = "fetchBookingInfoByTheatreName", query = "select dto from BookTicketsDTO dto where dto.theatre =: thea"),
               @NamedQuery(name = "fetchBookingInfoByPrice", query = "select dto from BookTicketsDTO dto where dto.price =: pc"),
               @NamedQuery(name = "fetchBookingInfoByTimings" , query = "select dto from BookTicketsDTO dto where dto.time =: timings"),
               @NamedQuery(name = "fetchAll", query = "select dto from BookTicketsDTO dto"),
               @NamedQuery(name = "fetchTheatreNameByMovieName", query = "select dto.theatre from BookTicketsDTO dto where dto.name =: nm"),
               @NamedQuery(name = "fetchMovieNameAndTheatreNameUsingLocation", query = "select dto.name , dto.theatre from BookTicketsDTO dto where dto.location =: loc"),
               @NamedQuery(name = "updatingPriceByTheatreName", query = "update BookTicketsDTO dto set dto.price =: pc where dto.theatre =: tn"),
               @NamedQuery(name = "updatingNoOfTicketsByMovieName", query = "update BookTicketsDTO dto set dto.name =: mn where dto.noOfTickets =: not"),
               @NamedQuery(name = "deletingMovieByMovieId" , query = "delete BookTicketsDTO dto from dto.id =: id")
})



public class BookTicketsDTO {

    @Id
    @Column(name = "movie_id")
    /*@GenericGenerator(name = "ref" , strategy = "increment")
    @GeneratedValue(generator = "ref")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movie_name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "language")
    private Language language;
    @Column(name = "location")
    private String location;
    @Column(name = "price")
    private double price;
    @Column(name = "no_of_tickets")
    private int noOfTickets;
    @Column(name = "theatre")
    private String theatre;
    @Column(name = "timings")
    private String time;
}
