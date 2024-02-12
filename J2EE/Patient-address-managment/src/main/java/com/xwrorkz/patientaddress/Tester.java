package com.xwrorkz.patientaddress;

import com.xwrorkz.patientaddress.constants.BloodGroup;
import com.xwrorkz.patientaddress.constants.MartialStatus;
import com.xwrorkz.patientaddress.dto.AddressDTO;
import com.xwrorkz.patientaddress.dto.PatientDTO;
import com.xwrorkz.patientaddress.service.PatientAddressService;
import com.xwrorkz.patientaddress.service.impl.PatientAddressServiceImpl;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        PatientAddressService pas = new PatientAddressServiceImpl();
        for(int i = 0; i >= size ; i++){
            PatientDTO patientDTO = new PatientDTO();
            AddressDTO addressDTO = new AddressDTO();
            System.out.println("Enter first name of patient");
            patientDTO.setFirstName(sc.next());
            System.out.println("Enter last name of patient");
            patientDTO.setLastName(sc.next());
            System.out.println("Enter martial status of patient");
            patientDTO.setMartialStatus(MartialStatus.valueOf(sc.next()));
            System.out.println("Enter blood group of patient");
            patientDTO.setBloodGroup(BloodGroup.valueOf(sc.next()));
            patientDTO.setAddressDTO(addressDTO);
            System.out.println("Enter address line 1");
            addressDTO.setAddressLine1(sc.next());
            System.out.println("Enter address line 2");
            addressDTO.setAddressLine2(sc.next());
            System.out.println("Enter city");
            addressDTO.setCity(sc.next());
            System.out.println("Enter state");
            addressDTO.setState(sc.next());
            System.out.println("Enter country");
            addressDTO.setCountry(sc.next());
            System.out.println("Enter pin code");
            addressDTO.setPinCode(sc.nextLong());

            pas.validateAndSave(patientDTO);


        }

    }
}
