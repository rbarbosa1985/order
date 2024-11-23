package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if (order.getBasic() < 100.0){
            return 20.0;
        }

        if (order.getBasic() > 100.0 && order.getBasic() < 200.0){
            return 12.0;
        }

        return 0;
    }
}
