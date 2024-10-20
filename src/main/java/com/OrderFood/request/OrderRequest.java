package com.OrderFood.request;

import com.OrderFood.Model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private  Long restaurantId;
    private Address deliveryAddress;
}
