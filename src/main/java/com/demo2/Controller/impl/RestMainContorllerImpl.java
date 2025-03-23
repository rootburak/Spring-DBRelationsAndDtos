package com.demo2.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.Controller.IUserController;
import com.demo2.Service.impl.AddressServiceImpl;
import com.demo2.Service.impl.UserServiceImpl;
import com.demo2.dto.AddressDto;
import com.demo2.dto.AddressDtoIO;
import com.demo2.dto.UserDto;
import com.demo2.dto.UserDtoIO;
@RestController
@RequestMapping("/rest/api/user")
public class RestMainContorllerImpl implements IUserController{

        
    @Autowired
    UserServiceImpl UserService;
    @Autowired
    AddressServiceImpl AddressService;

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserDtoIO user){
        return UserService.addUser(user);
    }
    @PostMapping("/add-address")
    public AddressDto addAddress(@RequestBody AddressDtoIO address){
        return AddressService.addAddress(address);
    }

}
