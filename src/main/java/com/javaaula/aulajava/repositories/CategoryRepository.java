package com.javaaula.aulajava.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javaaula.aulajava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
