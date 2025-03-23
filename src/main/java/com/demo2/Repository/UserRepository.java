package com.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {

    
}
