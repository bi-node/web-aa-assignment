package com.binode.mocktest.controller;

import com.binode.mocktest.dto.AddressDTO;
import com.binode.mocktest.model.Address;
import com.binode.mocktest.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<AddressDTO> getAllAddress() {
       return addressService.getAddresses();
    }

}
