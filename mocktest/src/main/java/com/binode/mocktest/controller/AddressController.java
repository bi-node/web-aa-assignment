package com.binode.mocktest.controller;

import com.binode.mocktest.dto.AddressDTO;
import com.binode.mocktest.model.Address;
import com.binode.mocktest.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<AddressDTO> getAllAddress() {
       return addressService.getAddresses();
    }

    @PostMapping
    public String insertAddress(@RequestBody AddressDTO addressDTO) {
        addressService.addAddress(addressDTO);
        return "success";
    }

}
