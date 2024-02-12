package com.xworkz.bankatm.repository;

import com.xworkz.bankatm.dto.BankAccountDTO;

public interface BankAtmRepository {

    public void save(BankAccountDTO accountDTO);
}
