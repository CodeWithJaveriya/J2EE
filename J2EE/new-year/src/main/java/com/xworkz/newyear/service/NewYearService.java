package com.xworkz.newyear.service;

import com.xworkz.newyear.dto.NewYearDTO;

import java.util.List;

public interface NewYearService {

    boolean save(NewYearDTO newYearDTO);

    List<NewYearDTO> getAllRegistrations();

    NewYearDTO getUserById(int id);

    boolean updateById(int id, NewYearDTO updatedRegistrations);

    boolean deleteById(int id);
}
