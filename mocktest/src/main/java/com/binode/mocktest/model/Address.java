package com.binode.mocktest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Address {
    @Id
    private Long addressId;
    private String city;
    private String state;
    private String zipcode;

    @OneToMany(mappedBy = "address")
    private List<Student> students;

    public Address() {
    }

    public Address(Long addressId, String city, String state, String zipcode, List<Student> students) {
        this.addressId = addressId;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.students = students;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
