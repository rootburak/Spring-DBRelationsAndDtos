package com.demo2.Service;

import com.demo2.dto.AddressDto;
import com.demo2.dto.AddressDtoIO;
import com.demo2.dto.UserDto;
import com.demo2.dto.UserDtoIO;

public interface IUserService {

    public UserDto addUser(UserDtoIO user);
    public AddressDto addAddress(AddressDtoIO address);

}
