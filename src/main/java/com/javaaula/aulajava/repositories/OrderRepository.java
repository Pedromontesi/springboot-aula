package com.javaaula.aulajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaaula.aulajava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
