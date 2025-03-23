package com.demo2.Service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.Model.UserModel;
import com.demo2.Repository.UserRepository;

import com.demo2.dto.UserDto;
import com.demo2.dto.UserDtoIO;

import lombok.Data;

@Service
@Data
public class UserServiceImpl {
        @Autowired
        private UserRepository userRepository;


public UserDto addUser(UserDtoIO user){
        if (user == null) {
        throw new Error("User cannot be null");
        }
        UserModel newUser = new UserModel();
        newUser.setName(user.getName());
        newUser.setAge(user.getAge());
        newUser.setPassword(user.getPassword());
        newUser = userRepository.save(newUser);
        UserDto response = new UserDto();
        response.setName(user.getName());
        response.setAge(user.getAge());
        return response;
}





}
