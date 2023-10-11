package com.javaaula.aulajava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaaula.aulajava.entities.User;
import com.javaaula.aulajava.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findALL() {
		return repository.findAll();
	}

	public User FindById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}


}