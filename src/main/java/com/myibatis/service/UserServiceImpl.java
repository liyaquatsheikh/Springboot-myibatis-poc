package com.myibatis.service;


import com.myibatis.mapper.ProductMapper;
import com.myibatis.mapper.UserMapper;
import com.myibatis.model.Product;
import com.myibatis.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserMapper mapper;
  
    @Override
    public List<UserDto> findAll() {
        return mapper.findAll();
    }

    @Override
    public UserDto findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteBydId(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int save(UserDto item) {
        return mapper.save(item);
    }

    @Override
    public int update(int id, UserDto item) {
        item.setId(id);
        return mapper.update(item);
    }
}
