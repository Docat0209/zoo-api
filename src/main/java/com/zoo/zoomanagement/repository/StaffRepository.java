package com.zoo.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoo.zoomanagement.model.Staff;

public interface StaffRepository extends JpaRepository<Staff,Integer>{
    
}
