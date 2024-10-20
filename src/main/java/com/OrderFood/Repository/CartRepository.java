package com.OrderFood.Repository;

import com.OrderFood.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart , Long> {

    public Cart findByCustomerId(Long userId);
}
