package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       ProductRepo productRepo = new ProductRepo();
       OrderRepo orderRepo = new OrderListRepo();

       ShopService shopService = new ShopService(productRepo, orderRepo);

       productRepo.addProduct(new Product("Headphones", 500,200,100));
       productRepo.addProduct(new Product("Laptop",800,300,50));

        List<Product> orderProducts = List.of(
                new Product("Laptop", 200, 200, 20),
                new Product("Headphones", 120, 400, 10)
        );
        shopService.placeNewOrder("Order001", orderProducts);

    }
}