package com.OrderFood.controller;

import com.OrderFood.Model.Food;
import com.OrderFood.Model.Restaurant;
import com.OrderFood.Model.User;
import com.OrderFood.Service.FoodService;
import com.OrderFood.Service.RestaurantService;
import com.OrderFood.Service.UserService;
import com.OrderFood.request.CreateFoodRequest;
import com.OrderFood.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name,
                                           @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);

        List<Food> foods = foodService.searchFood(name);

        return new ResponseEntity<>(foods , HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam (required = false) boolean vegetarian,
                                                        @RequestParam (required = false) boolean nonveg,
                                                        @RequestParam  (required = false) boolean seasonal,
                                                        @RequestParam(required = false) String food_category,
                                                        @PathVariable Long restaurantId ,
                                                 @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);

        List<Food> foods = foodService.getRestaurantFood(restaurantId , vegetarian , nonveg , seasonal , food_category);

        return new ResponseEntity<>(foods , HttpStatus.OK);
    }

}
