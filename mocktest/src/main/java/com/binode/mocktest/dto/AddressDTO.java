package com.binode.mocktest.dto;

public class AddressDTO {
    private Long addressId;
    private String city;
    private String state;
    private String zipcode;

    public AddressDTO() {
    }

    public AddressDTO(Long addressId, String city, String state, String zipcode) {
        this.addressId = addressId;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
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
}
