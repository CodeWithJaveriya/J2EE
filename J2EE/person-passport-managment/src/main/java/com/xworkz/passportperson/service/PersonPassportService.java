package com.xworkz.passportperson.service;

import com.xworkz.passportperson.dto.PassportDTO;
import com.xworkz.passportperson.dto.PersonDTO;

public interface PersonPassportService {

    public void saveAndValidate(PersonDTO personDTO);
}
