package com.xwrorkz.patientaddress.service.impl;

import com.xwrorkz.patientaddress.dto.PatientDTO;
import com.xwrorkz.patientaddress.repository.PatientAddressRepository;
import com.xwrorkz.patientaddress.repository.impl.PatientAddressRepositoryImpl;
import com.xwrorkz.patientaddress.service.PatientAddressService;

public class PatientAddressServiceImpl implements PatientAddressService {

    PatientAddressRepository patientAddressRepository;

    public PatientAddressServiceImpl(){
        patientAddressRepository = new PatientAddressRepositoryImpl();
    }

    @Override
    public void validateAndSave(PatientDTO patientDTO) {
        boolean firstNameValidated = false;
        boolean lastNameValidated = false;
        boolean martialStatusValidated = false;
        boolean bloodGroupValidated = false;
        boolean addressValidated = false;
        if(patientDTO != null){
            if(patientDTO.getFirstName() != null){
                firstNameValidated = true;
            }
            if(patientDTO.getLastName() != null){
                lastNameValidated = true;
            }
            if(patientDTO.getMartialStatus() != null){
                martialStatusValidated = true;
            }
            if(patientDTO.getBloodGroup() != null){
                bloodGroupValidated = true;
            }
            if(patientDTO.getAddressDTO() != null){
                addressValidated = true;
            }
            if(firstNameValidated == true && lastNameValidated == true &&
            martialStatusValidated == true && bloodGroupValidated == true &&
            addressValidated == true){
                patientAddressRepository.save(patientDTO);
            }
        }
    }
}
