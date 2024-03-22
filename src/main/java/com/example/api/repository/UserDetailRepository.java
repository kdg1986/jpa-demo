package com.example.api.repository;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.entity.UserDetail;
import com.example.api.entity.Users;


import java.util.List;


public interface UserDetailRepository  extends JpaRepository<UserDetail, Integer>{
}
