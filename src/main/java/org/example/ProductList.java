package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    List<Product> products;
    public ProductList(){
        products = new ArrayList<>();
    }
    public void addProducts(Product product){
        products.add(product);
    }
    public List<Product> getProducts(){
        return products;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
