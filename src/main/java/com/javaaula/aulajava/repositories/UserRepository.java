package com.javaaula.aulajava.repositories;

import com.javaaula.aulajava.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
