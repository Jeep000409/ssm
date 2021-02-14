package com.dao;

import com.domain.Orders;

import java.util.List;

public interface OrdersDao {
    List<Orders> findOrdersAll();
    void insertOrders(Orders orders);
}
