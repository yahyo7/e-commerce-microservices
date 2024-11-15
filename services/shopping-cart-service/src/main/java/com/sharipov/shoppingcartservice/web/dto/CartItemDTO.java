package com.sharipov.shoppingcartservice.web.dto;

import com.sharipov.shoppingcartservice.domain.entity.CartEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDTO {

    private Long productId;
    private String productName;
    private Integer quantity;
    private BigDecimal price;
    private Long cartId;
}
