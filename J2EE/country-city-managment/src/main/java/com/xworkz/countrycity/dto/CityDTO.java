package com.xworkz.countrycity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city_info")
@ToString
@EqualsAndHashCode

public class CityDTO {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "country_of_city")
    private String countryOfCity;
    @Column(name = "city_pin_number")
    private int cityPinNumber;



}
