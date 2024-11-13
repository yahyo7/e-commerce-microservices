package com.sharipov.shoppingcartservice.repository;

import com.sharipov.shoppingcartservice.domain.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
}
