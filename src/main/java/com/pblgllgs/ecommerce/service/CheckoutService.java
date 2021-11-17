package com.pblgllgs.ecommerce.service;

import com.pblgllgs.ecommerce.dto.Purchase;
import com.pblgllgs.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
