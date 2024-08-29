package org.example;

import java.util.List;

public interface OrderRepo {
//    OrderRepo interface which holds the methods from the OrderListRepo
    void addOrder(Order order);
    void removeOrder(Order order);
    Order getOrder(int index);
    List<Order> getAllOrders();
}
