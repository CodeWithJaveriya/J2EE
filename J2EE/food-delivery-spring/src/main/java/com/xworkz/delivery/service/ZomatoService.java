package com.xworkz.delivery.service;

import com.xworkz.delivery.dto.ZomatoDTO;

import java.util.List;

public interface ZomatoService {


    public boolean validateAndSave(ZomatoDTO zomatoDTO);

    public List<ZomatoDTO> getAllUsers();

    ZomatoDTO getUserById(int id);

    boolean updateById(int id, ZomatoDTO updatedUser);

    boolean deleteById(int id);

    List<ZomatoDTO> validateAndReturn(String userName, String email);


    List<ZomatoDTO> searchByName(String userName);
}
