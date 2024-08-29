package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
//    List to store orders
    private final List<Order> orders = new ArrayList<Order>();

//    addOrder method to add an order
    public void addOrder(Order order) {
        orders.add(order);
    }

//    removeOrder method to remove an order
    public void removeOrder(Order order) {
        orders.remove(order);
    }

//    getOrder method to get a single order by its index
    public Order getOrder(int index) {
        return orders.get(index);
    }

//    getAllOrders method to get all orders
    public List<Order> getAllOrders () {
//        Create a copy of the original orders ArrayList to prevent modifications
        return new ArrayList<>(orders);
    }



//    public Order getOrder(int id) {
//        for (Order order : orders) {
//            getOrder()
//        }
//    }

//    public List<Order> getAllOrderss(){
//        return orders;
//    }
}
