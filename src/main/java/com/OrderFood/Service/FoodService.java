package com.OrderFood.Service;

import com.OrderFood.Model.Category;
import com.OrderFood.Model.Food;
import com.OrderFood.Model.Restaurant;
import com.OrderFood.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req , Category category , Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantFood(Long restaurantId ,
                                        boolean isVegetarian ,
                                        boolean isNonveg ,
                                        boolean isSeasonal ,
                                        String foodCategory
    );

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailablityStatus(Long foodId) throws Exception;


}
