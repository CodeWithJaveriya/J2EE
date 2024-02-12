package com.xworkz.countrycity.service.impl;

import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.repository.CountryCityRepository;
import com.xworkz.countrycity.repository.impl.CountryCityRepositoryImpl;
import com.xworkz.countrycity.service.CountryCityService;

public class CountryCityServiceImpl implements CountryCityService {

    CountryCityRepository countryCityRepository;

    public CountryCityServiceImpl(){
        countryCityRepository = new CountryCityRepositoryImpl();
    }
    @Override
    public void validateAndSave(CountryDTO countryDTO) {
        boolean nameValidated = false;
        boolean codeValidated = false;
        boolean cityValidated = false;
        if(countryDTO != null){
            if(countryDTO.getCountryName() != null){
                nameValidated = true;
            }
            if(countryDTO.getCountryCode() != null){
                codeValidated = true;
            }
            if(countryDTO.getCityDTO() != null){
                cityValidated = true;
            }
            if(nameValidated == true && codeValidated == true && cityValidated == true){
                countryCityRepository.save(countryDTO);
            }
        }
    }
}
