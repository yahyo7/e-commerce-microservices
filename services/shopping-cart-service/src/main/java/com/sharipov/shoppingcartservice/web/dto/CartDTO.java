package com.sharipov.shoppingcartservice.web.dto;

import com.sharipov.shoppingcartservice.domain.entity.CartItemEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
public class CartDTO {

    private Set<CartItemDTO> items;
}
