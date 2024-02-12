package com.xworkz.mobilebatter.service.impl;

import com.xworkz.mobilebatter.dto.MobileDTO;
import com.xworkz.mobilebatter.repository.MobileBatteryRepository;
import com.xworkz.mobilebatter.repository.impl.MobileBatteryRepositoryImpl;
import com.xworkz.mobilebatter.service.MobileBatteryService;

public class MobileBatteryServiceImpl implements MobileBatteryService {

    MobileBatteryRepository mobileBatteryRepository;

    public MobileBatteryServiceImpl(){
        mobileBatteryRepository = new MobileBatteryRepositoryImpl();
    }
    @Override
    public void validateAndSave(MobileDTO mobileDTO) {
        boolean mobileNameVerified = false;
        boolean modelVerified = false;
        boolean yearOfMobileLaunchVerified = false;
        boolean batteryVerified = false;
        if(mobileDTO != null){
            if(mobileDTO.getMobileName() != null){
             mobileNameVerified = true;
            }
            if(mobileDTO.getMobileModel() != null){
                modelVerified = true;
            }
            if(mobileDTO.getYearOfMobileLaunch() != 0){
                yearOfMobileLaunchVerified = true;
            }
            if(mobileDTO.getBatteryDTO() != null){
                batteryVerified = true;
            }
            if(mobileNameVerified == true && modelVerified == true &&
            yearOfMobileLaunchVerified == true && batteryVerified == true){
                mobileBatteryRepository.save(mobileDTO);
            }
        }
    }
}
