package com.xworkz.delivery.repository;

import com.xworkz.delivery.dto.ZomatoDTO;

import java.util.List;

public interface ZomatoRepository {

    boolean save(ZomatoDTO zomatoDTO);

    List<ZomatoDTO> getAllUsers();

    ZomatoDTO getUserById(int id);
    public boolean updateById(int id, ZomatoDTO updatedUser);

    boolean deleteById(int id);

    List<ZomatoDTO> searchByUserName(String userName);

    List<ZomatoDTO> searchByEmail(String email);

    List<ZomatoDTO> searchByUserNameAndEmail(String userName, String email);
}
