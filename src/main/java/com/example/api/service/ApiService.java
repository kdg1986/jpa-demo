package com.example.api.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.api.entity.UserDetail;
import com.example.api.entity.UserJoin;
import com.example.api.entity.Users;
import com.example.api.repository.UserDetailRepository;
// import com.example.api.repository.UserJoinRepository;
import com.example.api.repository.UsersRepository;


// @Component
@Service
public class ApiService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

    // @Autowired
    // UserJoinRepository userJoinRepository;

    public List<Users> getUserList() {
        return usersRepository.findAll();
    }
    public Optional<Users> getUser(Integer user_id) {
        return usersRepository.findById(user_id);
    }
    public Users getUserByName(String userName) {
        return usersRepository.findByUsername(userName);
    }
    public Users getUserByEmail(String email) {
        return usersRepository.QueryEmail(email);
    }
    public Users getUserByRegistrationDate(String regDate) {
        return usersRepository.findByRegiDate(regDate);
    }
    public List<Users> userNamelike(String userName) {
        return usersRepository.UsernameEndWith(userName);
    }
    public List<Users> userNamelikeCnt(String userName) {
        return usersRepository.UsernameEndWith(userName);
    }
    public List<Users> getUsernameSort(String sort) {
        return usersRepository.userNameSort(Sort.by(sort).ascending());
    }
    public long getCount(){
        return usersRepository.count();
    }
    public List<UserDetail> getUserDetailList() {
        return userDetailRepository.findAll();
    }
    // public List<UserJoin> getUserJoin() {
    //     return userJoinRepository.findByIdWithUsersAndUserDetail();
    // }

}
