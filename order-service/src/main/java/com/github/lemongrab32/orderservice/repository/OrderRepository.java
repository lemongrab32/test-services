package com.github.lemongrab32.orderservice.repository;

import com.github.lemongrab32.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
