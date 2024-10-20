package com.OrderFood.controller;

import com.OrderFood.Model.CartItem;
import com.OrderFood.Model.Order;
import com.OrderFood.Model.User;
import com.OrderFood.Service.OrderService;
import com.OrderFood.Service.UserService;
import com.OrderFood.request.AddCartItemRequest;
import com.OrderFood.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest req,
                                                  @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        Order order = orderService.createOrder(req , user);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/order/user")
    public ResponseEntity<List<Order>> getOrderHistory(
                                             @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Order> order = orderService.getUsersOrders(user.getId());
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
