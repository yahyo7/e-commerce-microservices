package com.sharipov.orderservice.service.impl;

import com.sharipov.orderservice.domain.entity.OrderEntity;
import com.sharipov.orderservice.domain.exception.ResourceNotFound;
import com.sharipov.orderservice.repository.OrderRepository;
import com.sharipov.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public OrderEntity getOrder(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(
                () -> new ResourceNotFound("Order not found.")
        );
    }

    @Override
    public OrderEntity createOrder(OrderEntity orderEntity) {
        return null;
    }

    @Override
    public OrderEntity updateOrder(OrderEntity orderEntity, Long orderId) {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {

    }
}
