package com.javaaula.aulajava.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javaaula.aulajava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
