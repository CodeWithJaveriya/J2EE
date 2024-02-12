package com.xworkz.airpods.service.impl;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repo.AirpodsRepo;
import com.xworkz.airpods.repo.impl.AirpodsRepoImpl;
import com.xworkz.airpods.service.AirpodsService;

import java.util.List;

public class AirpodsServiceImpl implements AirpodsService {

    AirpodsRepo airpodsRepo;
    public AirpodsServiceImpl(){

        airpodsRepo = new AirpodsRepoImpl();

    }


    public boolean store(AirpodsDto dto) {

        if(dto!=null) {
            if(!(dto.getId()>0 && dto.getPrice()<2000)) {
                return airpodsRepo.store(dto);
            }
        }
        return false;
    }

    public boolean updateColorByName(String updatedColor, String name) {

        if(updatedColor!=null && name !=null) {
            System.out.println("data for updation is valid");
            return airpodsRepo.updateColorByName(updatedColor,name);
        }
        return false;
    }

    public boolean deleteByPrice(int price) {
        if(price != 0) {
            System.out.println("price valid");
            return airpodsRepo.deleteByPrice(price);
        }
        return false;
    }

    public List<AirpodsDto> readAll() {

        return airpodsRepo.readAll();
    }
}
