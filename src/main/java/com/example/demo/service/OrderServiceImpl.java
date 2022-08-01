package com.example.demo.service;

import com.example.demo.pojo.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(String frId,Order order) {
        orderRepository.add(frId,order);
        return orderRepository.get(frId);

    }

    @Override
    public Order updateOrderByFrId(String frId,Order order) {
        orderRepository.add(frId,order);
        return orderRepository.get(frId);
    }

    @Override
    public Order readOrderByFrId(String frId) {
        return orderRepository.get(frId);

    }

    @Override
    public void deleteOrderByFrId(String frId) {
        orderRepository.remove(frId);

    }
}
