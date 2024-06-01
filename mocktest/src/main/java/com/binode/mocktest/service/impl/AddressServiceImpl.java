package com.binode.mocktest.service.impl;

import com.binode.mocktest.Repository.AddressRepository;
import com.binode.mocktest.Repository.StudentRepository;
import com.binode.mocktest.dto.AddressDTO;
import com.binode.mocktest.model.Address;
import com.binode.mocktest.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
    private ModelMapper modelMapper;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;

    }


    @Override
    public void addAddress(AddressDTO address) {
        Address addressEntity = modelMapper.map(address, Address.class);
        addressRepository.save(addressEntity);

    }

    @Override
    public List<AddressDTO> getAddresses() {
        return  addressRepository.findAll().stream().map(address ->
                modelMapper.map(address, AddressDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AddressDTO getAddress(int id) {
        return null;
    }

    @Override
    public void deleteAddress(int id) {

    }
}
