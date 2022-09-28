package com.coursenelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursenelio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
