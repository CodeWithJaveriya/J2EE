package com.xworkz.bankatm.service.impl;

import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.repository.BankAtmRepository;
import com.xworkz.bankatm.repository.impl.BankAtmRepositoryImpl;
import com.xworkz.bankatm.service.BankAtmService;

import java.sql.Struct;

public class BankAtmServiceImpl implements BankAtmService {

    BankAtmRepository bankAtmRepository;

    public BankAtmServiceImpl(){
        bankAtmRepository = new BankAtmRepositoryImpl();
    }
    @Override
    public void saveAndValidate(BankAccountDTO accountDTO) {
        boolean bankNameVerified = false;
        boolean accountTypeVerified = false;
        boolean balanceVerified = false;
        boolean atmCardDetailsVerified = false;
        if(accountDTO != null){
            if(accountDTO.getBankName() != null){
                bankNameVerified = true;
            }
            if(accountDTO.getAccountType() != null){
                accountTypeVerified = true;
            }
            if(accountDTO.getBalance() != 0.0){
                balanceVerified = true;
            }
            if(accountDTO.getAtmCardDTO() != null){
                atmCardDetailsVerified = true;
            }
            if(bankNameVerified == true && accountTypeVerified == true &&
            balanceVerified == true && atmCardDetailsVerified == true){
                bankAtmRepository.save(accountDTO);
            }
        }
    }
}
