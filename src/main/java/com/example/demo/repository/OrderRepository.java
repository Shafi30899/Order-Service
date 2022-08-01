package com.example.demo.repository;

import com.example.demo.pojo.Order;
import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class OrderRepository {
//    OrderRepository orderRepositoryObj=new OrderRepository();
//    Order orderObj=new Order();
//    @Getter
//    @Setter
//    private String key;
//    @Getter
//    @Setter
//    private String index;

//    @Getter
//    @Setter
//    public Map orders=new HashMap<>();
//    orders.put

//    public static map string ,order

//method add remove get

    public static Map<String,Order> orders;

    public void add(String frIdString,Order order){//order
        orders.put(frIdString,order);

    }
    public void remove(String frIdString){
        orders.remove(frIdString);

    }
    public Order get(String frIdString){
       return orders.get(frIdString);


    }

}

