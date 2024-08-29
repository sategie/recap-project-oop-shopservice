package org.example;

public class Main {
    public static void main(String[] args) {
        ProductRepo stock1 = new ProductRepo();
//        ProductRepo stock2 = new ProductRepo();
//        ProductRepo stock3 = new ProductRepo();

        System.out.println(stock1);
        stock1.addProduct(new Product("Laptop", 200, 5, 20));
//        stock2.addProduct(new Product("Laptop", 200, 5, 20));
//        stock3.addProduct(new Product("Laptop", 200, 5, 20));
        System.out.println(stock1);
        System.out.println(stock1.getAllProducts());
    }
}