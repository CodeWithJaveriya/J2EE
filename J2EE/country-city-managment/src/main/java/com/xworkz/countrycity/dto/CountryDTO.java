package com.xworkz.countrycity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "country_info")
@ToString
@EqualsAndHashCode

public class CountryDTO {

    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_code")
    private String countryCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private CityDTO cityDTO;

}
