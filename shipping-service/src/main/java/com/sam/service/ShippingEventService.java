package com.sam.service;

import com.sam.dto.enums.OrderStatus;
import com.sam.entity.OrderEvent;
import com.sam.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


@Service
public class ShippingEventService {

    @Autowired
    private ShippingRepository repo;


    @KafkaListener(topics = "order-events", groupId = "shipping-service")
    public void consumeOrderEvent(OrderEvent orderEvent) {
        if (orderEvent.getStatus().equals(OrderStatus.CONFIRMED)) {
            // Automatically ship after order confirmation
            shipOrder(orderEvent.getOrderId());
        }
    }


    // Ship the order
    public void shipOrder(String orderId) {
        OrderEvent orderEvent = new OrderEvent(orderId, OrderStatus.SHIPPED, "Order Shipped successfully", LocalDateTime.now());
        repo.save(orderEvent);
    }

    // Deliver the order
    public void deliverOrder(String orderId) {
        OrderEvent orderEvent = new OrderEvent(orderId, OrderStatus.DELIVERED, "Order delivered successfully", LocalDateTime.now());
        repo.save(orderEvent);
    }

    private void saveAndPublishShippingEvent(Object event) {
//TODO:
    }
}