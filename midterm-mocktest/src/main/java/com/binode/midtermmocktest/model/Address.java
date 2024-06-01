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

    public Address() {
    }

    public Address(long address_id, String city, String state, String zipcode, Student student) {
        this.address_id = address_id;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.student = student;
    }
// getters and setters


    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
