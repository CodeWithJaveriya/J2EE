package com.xworkz.passportperson.repository;

import com.xworkz.passportperson.dto.PassportDTO;
import com.xworkz.passportperson.dto.PersonDTO;

public interface PersonPassportRepository {

    public void save(PersonDTO personDTO);
}
