package com.mystic.rationdelivery.repository;

import com.mystic.rationdelivery.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface OrderRepository extends MongoRepository<Order, String> {
    public Order getOrderByOrderId(@Param("orderId") String orderId);
}
