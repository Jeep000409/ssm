package com.service;

import com.domain.PageBean;
import com.domain.Product;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void insert(Product product);
    Product findById(Integer id);
    void update(Product product);
    void delById(Integer id);
    void delSome(Integer[] ids);
//    currPage:当前页面  pageSize:每页条数
    PageBean<Product> findByPage(Integer currPage, Integer pageSize);
//    测试分页助手
    void testPageHelper(Integer currPage ,Integer pageSize);
//    根据分页参数查询
    PageInfo<Product> findByPageHelper(Integer currPage, Integer pageSize);
}
