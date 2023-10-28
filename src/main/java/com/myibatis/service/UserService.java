package com.myibatis.service;


import com.myibatis.model.Product;
import com.myibatis.model.UserDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    List<UserDto> findAll();
    UserDto findById(int id);
    int deleteBydId(int id);
    int save(UserDto user);
    int update(int id, UserDto item);
}
