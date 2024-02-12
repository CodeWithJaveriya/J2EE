package com.xworkz.newyear.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "new_year_registrations")

@NamedQueries({@NamedQuery(name = "getAllRegistrations" , query = "select dto from NewYearDTO dto"),
        @NamedQuery(name = "getUserById", query = "select dto from NewYearDTO dto where dto.id =: id"),
@NamedQuery(name = "deleteById", query = "delete from NewYearDTO dto where dto.id = :id")})

public class NewYearDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "fees")
    private int fees;
}
