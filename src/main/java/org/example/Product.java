package org.example;

public class Product {
    String productID;
    String productName;

    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
