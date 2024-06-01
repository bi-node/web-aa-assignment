package com.binode.mocktest.service;

import com.binode.mocktest.dto.AddressDTO;
import com.binode.mocktest.model.Address;

import java.util.List;

public interface AddressService {
    public void addAddress(AddressDTO address);
    public List<AddressDTO> getAddresses();
    public AddressDTO getAddress(int id);
    public void deleteAddress(int id);

}
