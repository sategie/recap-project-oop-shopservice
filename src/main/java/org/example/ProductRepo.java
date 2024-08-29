package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
//    Implement ProductRepo class with a list to store products
    private final List<Product> products = new ArrayList<Product>();

//    addProduct method
    public void addProduct(Product product) {
        products.add(product);
    }

//    removeProduct method
    public void removeProduct(Product product){
        products.remove(product);
    }
}
