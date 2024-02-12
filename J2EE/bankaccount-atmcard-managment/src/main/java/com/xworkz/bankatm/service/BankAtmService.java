package com.xworkz.bankatm.service;

import com.xworkz.bankatm.dto.BankAccountDTO;

public interface BankAtmService {

    public void saveAndValidate(BankAccountDTO accountDTO);
}
