package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
