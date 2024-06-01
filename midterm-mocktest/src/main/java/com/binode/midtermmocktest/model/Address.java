package com.binode.midtermmocktest.model;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long address_id;
    private String city;
    private String state;
    private String zipcode;
    @OneToOne(mappedBy = "address")
    private Student student;


}
