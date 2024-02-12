package com.xworkz.passportperson.service.impl;

import com.xworkz.passportperson.dto.PassportDTO;
import com.xworkz.passportperson.dto.PersonDTO;
import com.xworkz.passportperson.repository.PersonPassportRepository;
import com.xworkz.passportperson.repository.impl.PersonPassportRepositoryImpl;
import com.xworkz.passportperson.service.PersonPassportService;

public class PersonPassportServiceImpl implements PersonPassportService {

       PersonPassportRepository personPassportRepository;

       public PersonPassportServiceImpl(){
           personPassportRepository = new PersonPassportRepositoryImpl();
       }
    @Override
    public void saveAndValidate(PersonDTO personDTO) {
        boolean firstNameVerified = false;
        boolean lasttNameVerified = false;
        boolean locationVerified = false;
        boolean passportVerified = false;
        if (personDTO != null) {
            if (personDTO.getFirstName() != null) {
                firstNameVerified = true;
            }
            if (personDTO.getLastName() != null) {
                lasttNameVerified = true;
            }
            if (personDTO.getLocation() != null) {
                locationVerified = true;
            }
            if (personDTO.getPassportDTO() != null) {
                passportVerified = true;
            }
            if (firstNameVerified == true && lasttNameVerified == true &&
                    locationVerified == true && passportVerified == true) {
                personPassportRepository.save(personDTO);
            }
        }
    }
}