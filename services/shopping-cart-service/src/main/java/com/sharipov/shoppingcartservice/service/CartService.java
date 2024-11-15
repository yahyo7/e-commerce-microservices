package com.sharipov.shoppingcartservice.service;

import com.sharipov.shoppingcartservice.domain.entity.CartEntity;
import com.sharipov.shoppingcartservice.domain.entity.CartItemEntity;

public interface CartService {
    CartEntity getCartById(Long id);

    CartEntity getCartByUserId(Long userId);

    CartEntity addItemToCart(Long cartId, CartItemEntity item);

    CartEntity updateItemInCart(Long cartId, Long itemId, CartItemEntity updateItem);

    void removeItemFromCart(Long cartId, Long itemId);


}
