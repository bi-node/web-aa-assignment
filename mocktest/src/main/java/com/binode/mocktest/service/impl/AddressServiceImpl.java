package com.binode.mocktest.service.impl;

import com.binode.mocktest.dto.AddressDTO;
import com.binode.mocktest.model.Address;
import com.binode.mocktest.repository.AddressRepository;
import com.binode.mocktest.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private final ModelMapper modelMapper;
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(ModelMapper modelMapper, AddressRepository addressRepository) {
        this.modelMapper = modelMapper;
        this.addressRepository = addressRepository;
    }

    @Override
    public void addAddress(AddressDTO address) {
        Address newAddress = modelMapper.map(address, Address.class);
        addressRepository.save(newAddress);
    }

    @Override
    public List<AddressDTO> getAddresses() {
        return addressRepository.findAll().stream()
                .map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AddressDTO getAddress(long id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.map(value -> modelMapper.map(value, AddressDTO.class)).orElse(null);
    }

    @Override
    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }
}
