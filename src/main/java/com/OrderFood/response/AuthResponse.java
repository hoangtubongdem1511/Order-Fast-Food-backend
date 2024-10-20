package com.OrderFood.response;

import com.OrderFood.Model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;

    private String message;

    private USER_ROLE role;

}
