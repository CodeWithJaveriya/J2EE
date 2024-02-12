package com.xworkz.bankatm.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account_info")
@ToString
@EqualsAndHashCode
public class BankAccountDTO {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankId;
    @Column(name = "account_name")
    private String bankName;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "balance")
    private double balance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "atm_id")
    private ATMCardDTO atmCardDTO;

}
