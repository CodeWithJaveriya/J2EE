package com.xwrorkz.patientaddress.dto;

import com.xwrorkz.patientaddress.constants.BloodGroup;
import com.xwrorkz.patientaddress.constants.MartialStatus;
import lombok.*;

import javax.persistence.*;

@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "patient_info")

public class PatientDTO {

    @Id
    @Column(name = "patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "martial_status")
    @Enumerated(EnumType.STRING)
    private MartialStatus martialStatus;
    @Column(name = "blood_group")
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressDTO addressDTO;

}
