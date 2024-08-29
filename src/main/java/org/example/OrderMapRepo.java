package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private final Map<Integer, Order> orders = new HashMap<>();
    private int currentIndex = 0;

//    Implementations of the OrderRepo methods
    @Override
    public void addOrder(Order order) {
        orders.put(currentIndex++, order);
    }
    @Override
    public void removeOrder(Order order) {
        orders.values().remove(order);
    }
    @Override
    public Order getOrder(int index) {
        return orders.get(index);
    }
    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(orders.values());
    }
}
