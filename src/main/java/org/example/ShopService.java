package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ShopService {
    //List<OrderList> listOfAllOrders;
    //ArrayList<Order> allMyOrders;

   public Order findOrderByOrderId(OrderList orderlist, String searchOrderID){
        for(Order order : orderlist.getOrders()){
            if(order.getOrderId().equals(searchOrderID)){
                System.out.println("Your order is: " + order);
                return order;
                }
        }return null;

    }

    public ShopService() {
    }
    /*  public ShopService(){
        listOfAllOrders = new ArrayList<>();
    }
    public List<OrderList> getOrderlists(){
        return listOfAllOrders;
    }*/
}
