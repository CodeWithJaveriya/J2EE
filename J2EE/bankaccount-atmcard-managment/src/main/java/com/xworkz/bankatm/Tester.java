package com.xworkz.bankatm;

import com.xworkz.bankatm.dto.ATMCardDTO;
import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.service.BankAtmService;
import com.xworkz.bankatm.service.impl.BankAtmServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        BankAtmService  bankAtmService = new BankAtmServiceImpl();
        for(int i = 1; i <= size; i++){
            BankAccountDTO accountDTO = new BankAccountDTO();
            ATMCardDTO cardDTO = new ATMCardDTO();
            System.out.println("Enter bank name");
            accountDTO.setBankName(sc.next());
            System.out.println("Enter account type");
            accountDTO.setAccountType(sc.next());
            System.out.println("Enter balance");
            accountDTO.setBalance(sc.nextDouble());
            accountDTO.setAtmCardDTO(cardDTO);
            System.out.println("Enter atm name");
            cardDTO.setAtmName(sc.next());
            System.out.println("Enter atm location");
            cardDTO.setLocation(sc.next());
            cardDTO.setAmountReceived(new Date());
            cardDTO.setAmountSent(new Date());
            bankAtmService.saveAndValidate(accountDTO);
        }

    }
}
