package com.sharipov.shoppingcartservice.service.impl;

import com.sharipov.shoppingcartservice.domain.entity.CartEntity;
import com.sharipov.shoppingcartservice.domain.entity.CartItemEntity;
import com.sharipov.shoppingcartservice.domain.exception.ResourceNotFound;
import com.sharipov.shoppingcartservice.repository.CartItemRepository;
import com.sharipov.shoppingcartservice.repository.CartRepository;
import com.sharipov.shoppingcartservice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Override
    public CartEntity getCartById(Long id) {
        return cartRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFound("Cart Not Found")
        );
    }

    @Override
    public CartEntity getCartByUserId(Long userId) {
        return cartRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFound("Cart Not Found")
        );
    }

    @Override
    public CartEntity addItemToCart(Long cartId, CartItemEntity item) {
        CartEntity exist = getCartById(cartId);
        CartItemEntity saveItem = cartItemRepository.save(item);
        exist.getItems().add(saveItem);
        return exist;
    }

    @Override
    public CartEntity updateItemInCart(Long cartId, Long itemId, CartItemEntity updateItem) {
       CartEntity cart = getCartById(cartId);
       CartItemEntity item = cart.getItems().stream()
               .filter(cartItem -> cartItem.getId().equals(itemId))
               .findFirst()
               .orElseThrow(()-> new ResourceNotFound("Product in cart not found"));
       item.setQuantity(updateItem.getQuantity());
       item.setPrice(updateItem.getPrice());
       cartItemRepository.save(item);
        return getCartById(cartId);
    }

    @Override
    public void removeItemFromCart(Long cartId, Long itemId) {
        CartEntity cart = getCartById(cartId);
        CartItemEntity item = cartItemRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFound("Product Not Found")
        );
        cartItemRepository.deleteById(itemId);
    }

}
