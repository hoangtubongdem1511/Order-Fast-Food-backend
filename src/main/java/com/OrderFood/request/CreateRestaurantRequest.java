package com.OrderFood.request;

import com.OrderFood.Model.Address;
import com.OrderFood.Model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private String openingHours;
    private ContactInformation contactInformation;
    private List<String> images;
}
