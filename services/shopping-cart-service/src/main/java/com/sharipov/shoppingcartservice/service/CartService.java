package com.sharipov.shoppingcartservice.service;

import com.sharipov.shoppingcartservice.domain.entity.CartEntity;

public interface CartService {
    CartEntity getCartById(Long id);
    CartEntity createCart(CartEntity cartEntity);
    CartEntity updateCart(CartEntity cartEntity);
    void deleteCartById(Long id);
}
