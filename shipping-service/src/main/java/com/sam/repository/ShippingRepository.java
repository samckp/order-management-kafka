package com.sam.repository;

import com.sam.entity.OrderEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShippingRepository extends MongoRepository<OrderEvent,String> {
}
