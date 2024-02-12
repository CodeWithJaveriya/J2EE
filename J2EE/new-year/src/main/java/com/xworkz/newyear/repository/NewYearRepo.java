package com.xworkz.newyear.repository;

import com.xworkz.newyear.dto.NewYearDTO;

import java.util.List;

public interface NewYearRepo {

    boolean save(NewYearDTO newYearDTO);

    List<NewYearDTO> getAllRegistrations();

    NewYearDTO getUserById(int id);

    boolean updateById(int id, NewYearDTO updatedRegistrations);

    boolean deleteById(int id);


}
