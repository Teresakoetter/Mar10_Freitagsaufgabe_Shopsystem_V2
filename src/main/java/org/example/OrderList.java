package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    List<Order> orders;


    public OrderList() {
        orders = new ArrayList<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public List<Order> getOrders(){
        return orders;
    }

    @Override
    public String toString() {
        return "OderList{" +
                "orders=" + orders +
                '}';
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
