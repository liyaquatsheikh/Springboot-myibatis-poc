package com.myibatis.service;


import com.myibatis.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    int deleteBydId(int id);
    int save(Product item);
    int update(int id, Product item);
}
