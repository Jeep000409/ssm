package com.service;

import com.domain.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    void insert(Orders orders);
}
