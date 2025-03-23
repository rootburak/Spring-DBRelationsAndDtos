package com.demo2.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.Model.AddressModel;
import com.demo2.Repository.AddressRepository;
import com.demo2.Service.IAddressService;
import com.demo2.dto.AddressDto;
import com.demo2.dto.AddressDtoIO;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressDto addAddress(AddressDtoIO address){
        if (address == null){
                throw new Error("Address cannot be null");
        }
        AddressModel newAddress = new AddressModel();

        newAddress.setAddress(address.getAddress());
        addressRepository.save(newAddress);
        
        AddressDto response = new AddressDto();
        response.setAddress(newAddress.getAddress());
        return response;
}
    
}
