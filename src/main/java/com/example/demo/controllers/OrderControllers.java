package com.example.demo.controllers;


import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControllers {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/adding")
    public Order addingOrder(@RequestParam String frId,@RequestParam Order order){
        return orderService.createOrder(frId,order);
    }

    @RequestMapping("/update")
    public Order updatingOrder(@RequestParam String frId,@RequestParam Order order){
        return orderService.updateOrderByFrId(frId,order);
    }

    @GetMapping("/remove")
    public void deletingOrder(@RequestParam String frId){
        orderService.deleteOrderByFrId(frId);
    }

    @GetMapping("/search")
    public Order searchingOrder(@RequestParam String frId){
        return orderService.readOrderByFrId(frId);
    }

}
