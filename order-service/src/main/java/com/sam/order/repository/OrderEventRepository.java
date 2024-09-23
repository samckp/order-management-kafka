package com.sam.order.repository;


import com.sam.order.entity.OrderEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderEventRepository extends MongoRepository<OrderEvent,String> {
}