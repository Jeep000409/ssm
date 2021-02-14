package com.dao;

import com.domain.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findProductAll();
    void insertProduct(Product product);
    Product findById(Integer id);
    void updateProduct(Product product);
    void delById(Integer id);
    Integer findTotalCount();
    List<Product> findByPage(int i, Integer pageSize);
}
