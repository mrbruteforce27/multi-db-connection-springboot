package dev.mb.database.entity.postgre;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "PERSON_ID")
    private int personId;

    @Column(name = "HOUSE_NO")
    private String houseNumber;

    @Column(name = "STREET")
    private String street;

    @Column(name = "LOCALITY")
    private String locality;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PINCODE")
    private String pincode;
}
