package com.OrderFood.Service;

import com.OrderFood.Model.User;

public interface UserService {
    public User findUserByJwtToken (String jwt) throws Exception;

    public User findUserByEmail (String email) throws Exception;



}
