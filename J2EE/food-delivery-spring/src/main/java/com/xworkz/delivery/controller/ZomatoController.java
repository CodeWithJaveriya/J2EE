package com.xworkz.delivery.controller;

import com.xworkz.delivery.dto.ZomatoDTO;
import com.xworkz.delivery.service.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ZomatoController {
    @Autowired
    public ZomatoService service;

    @PostMapping("food")
    public String onSubmit(@ModelAttribute ZomatoDTO zomatoDTO, Model model){
        String foodName = zomatoDTO.getFoodName();
        service.validateAndSave(zomatoDTO);
        model.addAttribute("name", foodName);
        return "response";
    }

    @GetMapping("getAll")
    public String getAllUsers(Model model){
        List<ZomatoDTO> zomatoDTOS = service.getAllUsers();
        model.addAttribute("lists",zomatoDTOS);
        return "get-deliveries";
    }

    @GetMapping("update")
    public String getById(@RequestParam int id, Model model){
        ZomatoDTO dto =service.getUserById(id);
        model.addAttribute("list",dto);
        return "updated-user";
    }

    @PostMapping("updatedFood")
    public String onUpdate(@ModelAttribute ZomatoDTO zomatoDTO){
        service.updateById(zomatoDTO.getId(),zomatoDTO);
        return "get-deliveries";
    }

    @GetMapping("delete")
    public String onDelete(@RequestParam String id){
        service.deleteById(Integer.parseInt(id));
        return "get-deliveries";
    }

    @GetMapping("searchByUserName")
    public String onSearchByName(@RequestParam("userName") String userName, Model model){
        List<ZomatoDTO> zomatoDTOS = service.searchByName(userName);
        model.addAttribute("lists",zomatoDTOS);
        return "get-deliveries";
    }



}
