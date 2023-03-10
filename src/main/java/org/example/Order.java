package org.example;

public class Order {
    String orderId;
    ProductList prodactList;

    public Order(String orderId, ProductList prodactList) {
        this.orderId = orderId;
        this.prodactList = prodactList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", prodactList=" + prodactList +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ProductList getProdactList() {
        return prodactList;
    }

    public void setProdactList(ProductList prodactList) {
        this.prodactList = prodactList;
    }
}
