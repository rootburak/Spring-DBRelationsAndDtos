package com.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.Model.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel,Integer>{

}
