package com.xworkz.passportperson.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "")
@ToString
@EqualsAndHashCode
public class PassportDTO {

    @Id
    @Column(name = "passport_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passportId;
    @Column(name = "passport_name")
    private String passportName;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "country")
    private String country;


}
