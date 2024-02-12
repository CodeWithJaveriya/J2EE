package com.xworkz.mobilebatter;

import com.xworkz.mobilebatter.dto.BatteryDTO;
import com.xworkz.mobilebatter.dto.MobileDTO;
import com.xworkz.mobilebatter.service.MobileBatteryService;
import com.xworkz.mobilebatter.service.impl.MobileBatteryServiceImpl;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        MobileBatteryService mbs = new MobileBatteryServiceImpl();
        for(int i = 0; i <= size ; i++){
            MobileDTO mobileDTO = new MobileDTO();
            BatteryDTO batteryDTO = new BatteryDTO();
            System.out.println("Enter name of mobile");
            mobileDTO.setMobileName(sc.next());
            System.out.println("Enter model of mobile");
            mobileDTO.setMobileModel(sc.next());
            System.out.println("Enter year of launch of mobile");
            mobileDTO.setYearOfMobileLaunch(sc.nextInt());

            System.out.println("Enter name of battery");
            batteryDTO.setBatteryName(sc.next());
            System.out.println("Enter model of battery");
            batteryDTO.setBatteryModel(sc.next());
            System.out.println("Enter memory of battery");
            batteryDTO.setBatteryMemory(sc.next());

            mobileDTO.setBatteryDTO(batteryDTO);

            mbs.validateAndSave(mobileDTO);


        }


    }
}
