package com.xworkz.airpods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;

@Data
@Table(name = "airpods_dto")
@Entity

@NamedQuery(name = "deleteByPrice" , query = "Delete from AirpodsDto dto where dto.price =: pr")
@NamedQuery(name = "updateColorByName", query = "Update AirpodsDto dto set dto.color=: col where dto.brandName=: nm")
@NamedQuery(name = "readAll", query = "select dto from AirpodsDto dto")
public class AirpodsDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airpods_id")
    private int id;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "price")
    private int price;
    @Column(name = "color")
    private String color;
    @Column(name = "battery_backup")
    private int batteryBackup;
}
