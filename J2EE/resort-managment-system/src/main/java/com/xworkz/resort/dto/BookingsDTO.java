package com.xworkz.resort.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_records")
@NamedQuery(name = "getAllVisitorDetails" , query = "from BookingsDTO dto")
public class BookingsDTO {

    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "mode_of_payment")
    private String modeOfPayment;
    @Column(name = "check_in_date")
    private String checkInDate;
    @Column(name = "check_out_date")
    private String  checkOutDate;
    @Column(name = "adults")
    private int adults;
    @Column(name = "children")
    private int children;
    @Column(name = "rooms")
    private int rooms;
}
