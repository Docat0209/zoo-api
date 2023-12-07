package com.zoo.zoomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoomanagement.model.Staff;
import com.zoo.zoomanagement.repository.StaffRepository;

@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;
    
    public Staff saveStaff(Staff staff){
        return repository.save(staff);
    }

    public List<Staff> findAllStaff(){
        return repository.findAll();
    }

    public String deleteStaffById(int id){
        repository.deleteById(id);
        return id + " Staff Removed";
    }

    public Staff updateStaff(Staff staff){

        Staff existing=repository.findById(staff.getId_staff()).orElse(null);
        existing.setId_staff_type(staff.getId_staff_type());
        existing.setId_zoo(staff.getId_zoo());
        existing.setName(staff.getName());
        existing.setSalary(staff.getSalary());

        return repository.save(existing);
    }
}
