package com.xworkz.bankatm.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "atm_info")
@ToString
@EqualsAndHashCode

public class ATMCardDTO {

    @Id
    @Column(name = "atm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int atmId;
    @Column(name = "atm_name")
    private String atmName;
    @Column(name = "location")
    private String location;
    @Column(name = "amount_received")
    private Date amountReceived;
    @Column(name = "amount_sent")
    private Date amountSent;


}
