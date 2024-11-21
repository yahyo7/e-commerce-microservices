package com.sharipov.orderservice.repository;

import com.sharipov.orderservice.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
