package com.sharipov.shoppingcartservice.web.controller;


import com.sharipov.shoppingcartservice.domain.entity.CartEntity;
import com.sharipov.shoppingcartservice.service.CartService;
import com.sharipov.shoppingcartservice.web.dto.CartDTO;
import com.sharipov.shoppingcartservice.web.dto.CartItemDTO;
import com.sharipov.shoppingcartservice.web.mapper.CartItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final CartItemMapper mapper;


//    @GetMapping
//    public List<CartDTO> getAllCarts(){
//        return cartService.
//    }


    @GetMapping("{id}")
    public ResponseEntity<CartDTO> getCartById(@PathVariable("id") Long id) {
        CartDTO response = new CartDTO();
        CartEntity cartEntity = cartService.getCartById(id);
        response.setItems(CartItemMapper.toLisDTO(cartEntity.getItems()));
        return ResponseEntity.ok(response);
    }


    @PostMapping("/{cart-id}")
    public ResponseEntity<CartDTO> addItemToCart(@PathVariable("cart-id") Long id,
                                                 @RequestBody CartItemDTO itemDTO) {
        CartDTO response = new CartDTO();
        CartEntity cart = cartService.addItemToCart(id, CartItemMapper.toEntity(itemDTO));
        response.setItems(CartItemMapper.toLisDTO(cart.getItems()));
        return ResponseEntity.ok(response);
    }


}
