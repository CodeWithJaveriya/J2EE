package com.xworkz.mobilebatter.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "battery_info")
@ToString
@EqualsAndHashCode

public class BatteryDTO {
    @Id
    @Column(name = "battery_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batteryId;
    @Column(name = "battery_name")
    private String batteryName;
    @Column(name = "battery_model")
    private String batteryModel;
    @Column(name = "battery_memory")
    private String batteryMemory;



}
