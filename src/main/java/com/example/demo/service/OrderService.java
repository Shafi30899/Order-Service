package com.example.demo.service;

import com.example.demo.pojo.Order;

public interface OrderService {

    Order createOrder(String frId,Order order);
    Order updateOrderByFrId(String frId,Order order);
    Order readOrderByFrId(String frId);
    void deleteOrderByFrId(String frId);
}
