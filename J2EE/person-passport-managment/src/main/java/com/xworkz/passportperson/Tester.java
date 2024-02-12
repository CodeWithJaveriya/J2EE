package com.xworkz.passportperson;

import com.xworkz.passportperson.dto.PassportDTO;
import com.xworkz.passportperson.dto.PersonDTO;
import com.xworkz.passportperson.service.PersonPassportService;
import com.xworkz.passportperson.service.impl.PersonPassportServiceImpl;

import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        PersonPassportService personPassportService = new PersonPassportServiceImpl();
        for(int i = 1; i <= size; i++){
            PersonDTO personDTO = new PersonDTO();
            PassportDTO passportDTO = new PassportDTO();
            System.out.println("Enter first name of person");
            personDTO.setFirstName(sc.next());
            System.out.println("Enter last name of person");
            personDTO.setLastName(sc.next());
            System.out.println("Enter location");
            personDTO.setLocation(sc.next());
            personDTO.setPassportDTO(passportDTO);
            System.out.println("Enter passport name");
            passportDTO.setPassportName(sc.next());
            System.out.println("Enter passport number");
            passportDTO.setPassportNumber(sc.next());
            System.out.println("Enter country of passport ");
            passportDTO.setCountry(sc.next());
            personPassportService.saveAndValidate(personDTO);
        }
    }
}
