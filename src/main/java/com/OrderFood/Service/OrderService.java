package com.OrderFood.Service;

import com.OrderFood.Model.Order;
import com.OrderFood.Model.User;
import com.OrderFood.request.OrderRequest;

import java.util.List;

public interface OrderService {
    public Order createOrder(OrderRequest order , User user) throws Exception;

    public Order updateOrder(Long orderId , String orderStatus) throws Exception;

    public void calcelOrder(Long orderId) throws Exception;

    public List<Order> getUsersOrders(Long userId) throws Exception;

    public List<Order> getRestaurantOrder(Long restaurantId , String orderStatus) throws Exception;

    public Order findOrderById(Long orderId) throws Exception;
}
