package com.sharipov.shoppingcartservice.repository;

import com.sharipov.shoppingcartservice.domain.entity.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemEntity, Long>{
    Set<CartItemEntity> getCartItemEntitiesByCartId(Long id);
}
