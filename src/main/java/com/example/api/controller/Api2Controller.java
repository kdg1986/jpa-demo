package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entity.Users;
import com.example.api.service.Api2Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Api2Controller {
    @Autowired
    private Api2Service api2Service;

    @DeleteMapping("/user/delete/{user_id}")
    void deleteByIdUser(@PathVariable("user_id") Integer user_id) {
        api2Service.deleteByUserId(user_id);
    }

    @DeleteMapping("/user/delete1/{user_id}")
    void deleteByIdUser1(@PathVariable("user_id") Integer user_id) {
        api2Service.deleteByIdUser1(user_id);
    }

    @PutMapping("/user/update/{user_id}")
    public void setUpdateEntity(@PathVariable("user_id") Integer user_id, @RequestBody Users entity) {
        api2Service.setUpdateEntity(user_id, entity);
    }

    @PutMapping("/user/updat1/{user_id}")
    public void setUpdateEntity1(@PathVariable("user_id") Integer user_id, @RequestBody Users entity) {
        api2Service.setUsersUsername(user_id, entity);
    }

    @PutMapping("/user/insert")
    public void setInsertEntity( @RequestBody Users entity ) {
        api2Service.setUsersInsert(entity);
    }

    @PutMapping("/user/insert1")
    public void setSeveEntity( @RequestBody Users entity ) {
        api2Service.setSeveEntity(entity);
    }
}
