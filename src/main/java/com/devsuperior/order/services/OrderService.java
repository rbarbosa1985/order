package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total (Order order) {
        return ((order.getBasic() - order.getBasic() * (order.getDiscount()/100))) + shippingService.shipment(order);
    }

}
