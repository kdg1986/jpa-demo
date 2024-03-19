package com.example.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.api.entity.Users;
import com.example.api.service.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/api/user")
    List<Users> userList() {
        return apiService.getUserList();
    }
    @GetMapping("/api/user/{user_id}")
    Users selectUserOne(@PathVariable("user_id") Integer user_id) {
        return apiService.getUser(user_id);
    }
    @GetMapping("/api/user/name/{userName}")
    Users selectUserName(@PathVariable("userName") String userName) {
        return apiService.getUserByName(userName);
    }
    @GetMapping("/api/user/email/{email}")
    Users selectUserEmail(@PathVariable("email") String email) {
        return apiService.getUserByEmail(email);
    }
    @GetMapping("/api/user/registry/{regDate}")
    Users selectUserRegDate(@PathVariable("regDate") String regDate) {
        return apiService.getUserByRegistrationDate(regDate);
    }
    @GetMapping("/api/user/name/like/{userName}")
    List<Users> selectUserNameLike(@PathVariable("userName") String userName) {
        return apiService.userNamelike(userName);
    }
    @GetMapping("/api/user/name/likeCount/{userName}")
    List<Users> selectUserNameLikeCnt(@PathVariable("userName") String userName) {
        return apiService.userNamelikeCnt(userName);
    }

    @GetMapping("/api/user/sort/{column}")
    List<Users> selectUserNameSort(@PathVariable("column") String column) {
        return apiService.getUsernameSort(column);
    }



}
