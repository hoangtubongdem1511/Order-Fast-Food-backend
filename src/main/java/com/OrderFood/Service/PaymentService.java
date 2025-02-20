package com.OrderFood.Service;

import com.OrderFood.Model.Order;
import com.OrderFood.response.PaymentResponse;
import com.stripe.exception.StripeException;


public interface PaymentService {
    public PaymentResponse createPaymentLink(Order order) throws StripeException;
}
