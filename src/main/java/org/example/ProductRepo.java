package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
//    Implement ProductRepo class with a list to store products (from the Product record)
    private final List<Product> products = new ArrayList<Product>();

//    addProduct method
    public void addProduct(Product product) {
        products.add(product);
    }

//    removeProduct method
    public void removeProduct(Product product){
        products.remove(product);
    }

//    Method to get single product
    public Product getSingleProduct(int index){
        return products.get(index);
    }

//    Method to get all products
    public List<Product> getAllProducts(){
//        Create a copy of the product list to prevent modification of the initial Arraylist
        return new ArrayList<>(products);
    }

//    toString() method to display output in human-readable form
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
