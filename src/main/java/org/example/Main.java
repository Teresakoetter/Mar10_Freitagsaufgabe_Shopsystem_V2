package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductList myProducts = new ProductList();
        Product product1 = new Product("P1", "Whisky");
        Product product2 = new Product("P2", "Vodka");
        myProducts.addProducts(product1);
        myProducts.addProducts(product2);

        OrderList myOrders = new OrderList();
        Order order1 = new Order("X", myProducts);
        Order order2 = new Order("O2", myProducts);
        myOrders.addOrder(order1);
        myOrders.addOrder(order2);
        System.out.println("One of your products: " + product1);
        System.out.println("All of your products: " + myProducts);
        System.out.println("All of your orders: " + myOrders);
        ShopService myShop = new ShopService();
        System.out.println("Order ID is: " + order1.getOrderId());
        myShop.findOrderByOrderId(myOrders, "X");



    }
}