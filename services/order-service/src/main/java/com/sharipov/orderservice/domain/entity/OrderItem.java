package com.sharipov.orderservice.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId; // ID of the associated order (to avoid direct mapping)

    private Long productId; // ID of the product (retrieved from Product Service)

    private int quantity;

    private double price;
}
