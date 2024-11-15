package com.sharipov.shoppingcartservice.web.mapper;

import com.sharipov.shoppingcartservice.domain.entity.CartItemEntity;
import com.sharipov.shoppingcartservice.web.dto.CartItemDTO;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CartItemMapper {

    public static CartItemEntity toEntity(CartItemDTO dto){
        if (dto == null) return null;
        CartItemEntity item = new CartItemEntity();
        item.setCartId(dto.getCartId());
        item.setProductId(dto.getProductId());
        item.setProductName(dto.getProductName());
        item.setQuantity(dto.getQuantity());

        return item;
    }



    public static CartItemDTO toDTO(CartItemEntity entity){
        if (entity == null) return null;
        CartItemDTO dto = new CartItemDTO();
        dto.setCartId(entity.getCartId());
        dto.setProductId(entity.getProductId());
        dto.setProductName(entity.getProductName());
        dto.setQuantity(entity.getQuantity());

        return dto;
    }

    public static Set<CartItemDTO> toLisDTO(Set<CartItemEntity> cartItems){
        return cartItems.stream()
                .map(CartItemMapper::toDTO)
                .collect(Collectors.toSet());
    }




}
