package com.service.impl;

import com.dao.OrdersDao;
import com.domain.Orders;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersDao ordersDao;

    @Override
    public List<Orders> findAll() {
        List<Orders> ordersList=this.ordersDao.findOrdersAll();
        return ordersList;
    }

    @Override
    public void insert(Orders orders) {
        ordersDao.insertOrders(orders);
    }

}
