package com.xworkz.airpods.service;

import com.xworkz.airpods.dto.AirpodsDto;

import java.util.List;

public interface AirpodsService {

    public boolean store(AirpodsDto dto);

    public List<AirpodsDto> readAll();

    public boolean updateColorByName(String updatedColor , String name);

    public boolean deleteByPrice(int price);
}
