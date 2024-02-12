package com.xwrorkz.patientaddress.service;

import com.xwrorkz.patientaddress.dto.PatientDTO;

public interface PatientAddressService {

    public void validateAndSave(PatientDTO patientDTO);
}
