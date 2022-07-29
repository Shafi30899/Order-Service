package com.example.demo.service;

import com.example.demo.pojo.Order;

public interface OrderService {

    Order createOrder(Order order);
    Order UpdateOrderByFrId(String frId);
    Order readOrderByFrId(String frId);
    DeleteOrderByFrId(String frId);
}
