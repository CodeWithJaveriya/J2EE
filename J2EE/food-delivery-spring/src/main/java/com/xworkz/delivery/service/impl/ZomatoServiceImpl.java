package com.xworkz.delivery.service.impl;

import com.xworkz.delivery.dto.ZomatoDTO;
import com.xworkz.delivery.repository.ZomatoRepository;
import com.xworkz.delivery.service.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ZomatoServiceImpl implements ZomatoService {

    @Autowired
    ZomatoRepository repository;


    @Override
    public boolean validateAndSave(ZomatoDTO zomatoDTO) {
        boolean userNameVerified = false;
        boolean addressVerified = false;
        boolean foodNameVerified = false;
        boolean emailVerified = false;
        boolean foodQuantityVerified = false;
        boolean phoneNumberVerified = false;
        if(zomatoDTO!= null){
            if(zomatoDTO.getUserName() != null){
                userNameVerified = true;
            }
            if(zomatoDTO.getAddress() != null){
                addressVerified = true;
            }
            if(zomatoDTO.getFoodName()!= null){
                foodNameVerified = true;
            }
            if(zomatoDTO.getEmail() != null){
                emailVerified = true;
            }
            if (zomatoDTO.getFoodQuantity() != 0){
                foodQuantityVerified = true;
            }
            if(zomatoDTO.getPhoneNumber() != 0){
                phoneNumberVerified = true;
            }
            if(userNameVerified == true && addressVerified==true && foodNameVerified==true &&
            emailVerified == true && foodQuantityVerified==true && phoneNumberVerified==true){
                repository.save(zomatoDTO);
                System.out.println("Verified!!!!");
                return true;
            }
        }
        return false;
    }

    @Override
    public List<ZomatoDTO> getAllUsers() {
        return repository.getAllUsers();
    }

    @Override
    public ZomatoDTO getUserById(int id) {
        return repository.getUserById(id);
    }

    @Override
    public boolean updateById(int id, ZomatoDTO updatedUser) {
        return repository.updateById(id,updatedUser);
    }

    @Override
    public boolean deleteById(int id) {
        return repository.deleteById(id);
    }

    @Override
    public List<ZomatoDTO> validateAndReturn(String userName, String email) {
       if(userName!=null && email!=null){
           return repository.searchByUserNameAndEmail(userName,email);
       } else if (userName!=null) {
           return repository.searchByUserName(userName);
       } else if(email!=null){
           return repository.searchByEmail(email);
       }
       return Collections.emptyList();
    }

    @Override
    public List<ZomatoDTO> searchByName(String userName) {
        List<ZomatoDTO> list =null;
        if(userName!=null){
         list= repository.searchByUserName(userName);
        }
        return list;
    }


}
