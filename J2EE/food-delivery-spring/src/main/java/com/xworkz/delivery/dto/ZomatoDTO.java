package com.xworkz.delivery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zomato_data")
@NamedQueries({@NamedQuery(name = "getAllDeliveries" , query = "select dto from ZomatoDTO dto"),
        @NamedQuery(name = "getUserById" , query = "select dto from ZomatoDTO dto where dto.id= :id"),
@NamedQuery(name = "deleteById",query = "delete from ZomatoDTO dto where dto.id= :id"),
@NamedQuery(name = "getUserByUserName" ,query = "select dto.userName from ZomatoDTO dto where dto.userName= :un"),
@NamedQuery(name = "getUserByEmail", query = "select dto.email from ZomatoDTO dto where dto.email= :em"),
@NamedQuery(name = "getUserByUserNameAndEmail" ,query = "select dto.userName , dto.email from ZomatoDTO dto where dto.userName= :un and dto.email= :em")})

public class ZomatoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String address;
    private String foodName;
    private int foodQuantity;
    private long phoneNumber;
    private String email;


}
