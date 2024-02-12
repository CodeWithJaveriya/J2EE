package com.xworkz.newyear.service.impl;

import com.xworkz.newyear.dto.NewYearDTO;
import com.xworkz.newyear.repository.NewYearRepo;
import com.xworkz.newyear.repository.impl.NewYearRepoImpl;
import com.xworkz.newyear.service.NewYearService;

import java.util.List;

public class NewYearServiceImpl implements NewYearService {

    public NewYearRepo newYearRepo;

    public NewYearServiceImpl(){
        newYearRepo = new NewYearRepoImpl();
    }
    @Override
    public boolean save(NewYearDTO newYearDTO) {
        System.out.println("Welcome to service method");
        boolean firstNameValidated = false;
        boolean lastNameValidated = false;
        boolean addressValidated = false;
        boolean feesValidated = false;
        if(newYearDTO!=null){
            if(newYearDTO.getFirstName()!=null){
                firstNameValidated = true;
            }
            if(newYearDTO.getLastName() != null){
                lastNameValidated = true;
            }
            if(newYearDTO.getAddress() != null){
                addressValidated = true;
            }
            if(newYearDTO.getFees() != 0){
                feesValidated = true;
            }
            if(firstNameValidated == true && lastNameValidated== true&&
            addressValidated==true && feesValidated==true){
                newYearRepo.save(newYearDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<NewYearDTO> getAllRegistrations() {
        return newYearRepo.getAllRegistrations();
    }

    @Override
    public NewYearDTO getUserById(int id) {
        return newYearRepo.getUserById(id);
    }

    @Override
    public boolean updateById(int id, NewYearDTO updatedRegistrations) {
        return newYearRepo.updateById(id, updatedRegistrations);
    }

    @Override
    public boolean deleteById(int id) {
        return newYearRepo.deleteById(id);
    }
}
