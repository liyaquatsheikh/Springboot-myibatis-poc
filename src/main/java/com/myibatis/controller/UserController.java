package com.myibatis.controller;


import com.myibatis.model.Product;
import com.myibatis.model.UserDto;
import com.myibatis.service.ProductService;
import com.myibatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<UserDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody UserDto user){
        return service.save(user);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id")int id, @RequestBody UserDto user){
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") int id){
        return service.deleteBydId(id);
    }
}
