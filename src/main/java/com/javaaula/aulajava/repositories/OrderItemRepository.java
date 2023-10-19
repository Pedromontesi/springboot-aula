package com.javaaula.aulajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaaula.aulajava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
