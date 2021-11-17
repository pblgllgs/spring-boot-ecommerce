package com.pblgllgs.ecommerce.dto;

import com.pblgllgs.ecommerce.entity.Address;
import com.pblgllgs.ecommerce.entity.Customer;
import com.pblgllgs.ecommerce.entity.Order;
import com.pblgllgs.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}