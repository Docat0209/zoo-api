package com.zoo.zoomanagement.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.zoomanagement.model.Staff;
import com.zoo.zoomanagement.service.StaffService;

@RestController
public class StaffController {
    @Autowired
    private StaffService service;

    // get all staff
    @GetMapping("/staff")
    public HashMap<String,List<Staff>> getAllStaff(){
        HashMap<String,List<Staff>> map = new HashMap<>();
        map.put("data", service.findAllStaff());
        return map;
    }

    // add staff
    @PostMapping("/staff/add")
    public Staff addStaff(@RequestBody Staff staff){
        return service.saveStaff(staff);
    }
    
    // update staff
    @PutMapping("/staff/update")
    public Staff updateStaff(@RequestBody Staff staff) {
        return service.updateStaff(staff);
    }

    // delete staff
    @DeleteMapping("/staff/delete/{id}")
    public String deleteStaffById(@PathVariable int id) {
        return service.deleteStaffById(id);
    }
}
