package com.sharipov.orderservice.service;


import com.sharipov.orderservice.domain.entity.OrderEntity;

public interface OrderService {
OrderEntity getOrder(Long orderId);
OrderEntity createOrder(OrderEntity orderEntity);
OrderEntity updateOrder(OrderEntity orderEntity, Long orderId);
void deleteOrder(Long orderId);
}
