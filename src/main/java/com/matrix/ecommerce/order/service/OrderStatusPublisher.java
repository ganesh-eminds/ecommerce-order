package com.matrix.ecommerce.order.service;

import com.matrix.ecommerce.order.dto.OrderRequestDto;
import com.matrix.ecommerce.order.event.OrderEvent;
import com.matrix.ecommerce.order.event.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

@Service
public class OrderStatusPublisher {

    @Autowired
    private Sinks.Many<OrderEvent> orderSinks;


    public void publishOrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus) {
        OrderEvent orderEvent = new OrderEvent(orderRequestDto, orderStatus);
        orderSinks.tryEmitNext(orderEvent);
    }
}
