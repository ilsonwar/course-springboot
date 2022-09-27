package com.coursenelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursenelio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
