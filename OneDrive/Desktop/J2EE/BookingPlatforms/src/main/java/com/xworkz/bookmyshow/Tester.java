package com.xworkz.bookmyshow;


import com.xworkz.bookmyshow.constants.Language;
import com.xworkz.bookmyshow.dto.BookTicketsDTO;
import com.xworkz.bookmyshow.respository.BookMyShowRepository;

import com.xworkz.bookmyshow.respository.impl.BookMyShowRepositoryImpl;
import com.xworkz.bookmyshow.service.impl.BookMyShowServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookMyShowServiceImpl bookMyShow = new BookMyShowServiceImpl();


        String userInput = null;
        do {
            System.out.println("Press 1 to get booking info by id");
            System.out.println("Press 2 to update no of tickets by id");
            System.out.println("Press 3 to delete movie info by id");
            System.out.println("Press 4 to book the ticket");
            System.out.println("Press 5 to get booking info by movie name");
            System.out.println("Press 6 to update price by movie name");
            System.out.println("Press 7 to update no of tickets by movie name");
            System.out.println("Press 8 to delete the movieName by id directly");
            System.out.println("Press 9 to get all tickets");
            System.out.println("Press 10 to get the booking info by language");
            System.out.println("Press 11 to get the booking info by location");
            System.out.println("Press 12 to get the booking info by theatre name");
            System.out.println("Press 13 to get the booking info by price");
            System.out.println("Press 14 to get the booking info by timings");
            System.out.println("Press 15 to get all the ticket booking");
            System.out.println("Press 16 to get theatre name by movie name");
            System.out.println("Press 17 to get theatre name and movie name by location");

            int options = sc.nextInt();
            switch (options){

                case 1 :
                    System.out.println("Enter the id to get booking info");
                    bookMyShow.getBookingInfoById(sc.nextInt());
                    break;

                case 2 :
                    System.out.println("Enter the no of tickets to be updated and id ");
                    bookMyShow.updateNoOfTicketsByMovieId(sc.nextInt(), sc.nextInt());
                    break;

                case 3 :
                    System.out.println("Enter the id to delete the movie info");
                    bookMyShow.deleteMovieInfoByMovieId(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter size");
                    int size = sc.nextInt();
                    for(int i = 1 ; i <= size; i++) {
                        System.out.println("Enter location, theatre,movie name, language, no of tickets, price, time ");
                        BookTicketsDTO bookTicketsDTO = BookTicketsDTO.builder().
                                location(sc.next()).theatre(sc.next()).
                                name(sc.next()).language(Language.valueOf(sc.next())).
                                noOfTickets(sc.nextInt()).price(sc.nextDouble()).time(sc.next()).build();
                        bookMyShow.validateMovieTicketsAndSave(bookTicketsDTO);
                    }
                    break;

                case 5:
                    System.out.println("Enter the movie name to get the booking info");
                    System.out.println(bookMyShow.getBookingInfoByMovieName(sc.next()));
                    break;

                case 6 :
                    System.out.println("Enter theatre name the price you want to update");
                    bookMyShow.updatePriceByTheatreName(sc.next() , sc.nextDouble());;
                    break;

                case 7 :
                    System.out.println("Enter movie name and the no of tickets you want to update");
                    bookMyShow.updateNoOfTicketsByMovieName(sc.next(), sc.nextInt());
                    break;

                case 8 :
                    System.out.println("Enter the id for which you want to delete the movie info");
                    bookMyShow.deleteMovieByMovieId(sc.nextInt());
                    break;

                case 9 :
                    System.out.println("Fetching all tickets");
                    System.out.println(bookMyShow.fetchAllBookingInfo());
                    break;

                case 10:
                    System.out.println("Enter the language to get the booking info");
                    System.out.println(bookMyShow.getBookingInfoByLanguage(Language.valueOf(sc.next())));
                    break;

                case 11:
                    System.out.println("Enter the location to get the booking info");
                    System.out.println(bookMyShow.getBookingInfoByLocation(sc.next()));
                    break;

                case 12:
                    System.out.println("Enter the theatre name to get booking info");
                    System.out.println(bookMyShow.getBookingInfoByTheatreName(sc.next()));
                    break;

                case 13:
                    System.out.println("Enter the price to get the booking info");
                    System.out.println(bookMyShow.getBookingInfoByPrice(sc.nextInt()));
                    break;

                case 14:
                    System.out.println("Enter the timings to get the booking info");
                    System.out.println(bookMyShow.getBookingInfoByTimings(sc.next()));
                    break;

                case 15:
                    System.out.println(bookMyShow.getAll());
                    break;

                case 16:
                    System.out.println("Enter the movie name to get theatre name");
                    System.out.println(bookMyShow.getTheatreNameByMovieName(sc.next()));
                    break;

                case 17:
                    System.out.println("Enter the location to get movie name and theatre name");
                    System.out.println(bookMyShow.getMovieNameAndTheatreNameUsingLocation(sc.next()));
                    break;

                default:
                    System.out.println("Please press the right number from given options");
                    break;

            }
            System.out.println("Do you want to continue Yes or No");
            userInput = sc.next();
        }while (userInput.equals("Yes"));
        System.out.println("Thank you!!!!! Visit Again!!!");

    }
}