package com.javaaula.aulajava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaaula.aulajava.entities.Order;
import com.javaaula.aulajava.repositories.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findALL() {
		return repository.findAll();
	}

	public Order FindById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}


}