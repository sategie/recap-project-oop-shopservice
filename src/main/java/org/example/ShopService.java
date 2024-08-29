package org.example;

import java.util.List;

public class ShopService {
    private  final ProductRepo productRepo;
    private final  OrderRepo orderRepo;

//    Constructor
    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

//    Method to place a new order
    public void placeNewOrder(String orderId, List<Product> products) {
        for (Product product : products) {
//            Check if ordered product does not exist
            if(!productRepo.getAllProducts().contains(product)) {
                System.out.println("Sorry, requested " + product.name() + " is not available");
                return;
            }
        }
        orderRepo.addOrder(new Order(orderId, products));
        System.out.println("Successfully placed order" + orderId);
    }




}
