package com.xworkz.countrycity;

import com.xworkz.countrycity.dto.CityDTO;
import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.service.CountryCityService;
import com.xworkz.countrycity.service.impl.CountryCityServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        CountryCityService countryCityService = new CountryCityServiceImpl();
        for(int i = 1; i <= size; i++){
            CountryDTO countryDTO = new CountryDTO();
            CityDTO cityDTO = new CityDTO();
            System.out.println("Enter country name");
            countryDTO.setCountryName(sc.next());
            System.out.println("Enter Country Code");
            countryDTO.setCountryCode(sc.next());
            countryDTO.setCityDTO(cityDTO);
            System.out.println("Enter city name");
            cityDTO.setCityName(sc.next());
            System.out.println("Enter country of city name");
            cityDTO.setCountryOfCity(sc.next());
            System.out.println("Enter country of city id");
            cityDTO.setCityId(sc.nextInt());
            System.out.println("Enter country of city pin number");
            cityDTO.setCityPinNumber(sc.nextInt());
            countryCityService.validateAndSave(countryDTO);
        }
    }
}
