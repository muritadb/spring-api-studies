package com.murita.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murita.spring_api.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
