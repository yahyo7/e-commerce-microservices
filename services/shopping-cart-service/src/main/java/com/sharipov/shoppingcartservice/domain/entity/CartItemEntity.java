package com.sharipov.shoppingcartservice.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class CartItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private String productName;
    private Integer quantity;
    private BigDecimal price;
    @Column(name = "cart_id")
    private Long cartId;
    @ManyToOne
    @JoinColumn(name = "cart_id", updatable = false, insertable = false)
    private CartEntity cart;
}
