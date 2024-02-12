package com.xworkz.airpods;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.impl.AirpodsServiceImpl;

public class AirportTester {

    public static void main(String[] args) {

        AirpodsService service = new AirpodsServiceImpl();

        AirpodsDto dto = new AirpodsDto();
        dto.setBrandName("Redmi");
        dto.setColor("Black");
        dto.setPrice(18000);
        dto.setBatteryBackup(875);

       //service.store(dto);


        //service.updateColorByName("Yellow","OnePlus");

      //service.deleteByPrice(18000);
        service.readAll();


    }
}
