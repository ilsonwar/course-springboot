package com.coursenelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursenelio.course.entities.OrderItem;
import com.coursenelio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
