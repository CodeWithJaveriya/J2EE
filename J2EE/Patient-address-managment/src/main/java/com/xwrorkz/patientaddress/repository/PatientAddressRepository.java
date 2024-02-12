package com.xwrorkz.patientaddress.repository;

import com.xwrorkz.patientaddress.dto.PatientDTO;

public interface PatientAddressRepository {

    public void save(PatientDTO patientDTO);
}
