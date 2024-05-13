package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.OrderEntity;

public interface OrderService {
    void saveOrder(OrderEntity order);
    OrderEntity getOrderById(Long id);
    void updateOrder(OrderEntity order);
    void deleteOrderById(Long id);
}
