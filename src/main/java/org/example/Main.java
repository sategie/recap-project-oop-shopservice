package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo stock1 = new ProductRepo();
        ProductRepo stock2 = new ProductRepo();
//        ProductRepo stock3 = new ProductRepo();

        System.out.println(stock1);
        stock1.addProduct(new Product("Laptop", 200, 200, 20));
        stock2.addProduct(new Product("Headphones", 120, 400, 10));

        System.out.println(stock1);
        System.out.println(stock1.getAllProducts());

        System.out.println(stock2);

    }
}