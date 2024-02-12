package com.xworkz.mobilebatter.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mobile_info")
@ToString
@EqualsAndHashCode

public class MobileDTO {

    @Id
    @Column(name = "mobile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobileId;
    @Column(name = "mobile_name")
    private String mobileName;
    @Column(name = "mobile_model")
    private String mobileModel;
    @Column(name = "year_of_launch")
    private int yearOfMobileLaunch;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "battery_id")
    private BatteryDTO batteryDTO;
}
