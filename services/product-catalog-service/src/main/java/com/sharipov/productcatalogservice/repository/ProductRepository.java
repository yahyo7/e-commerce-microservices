package com.sharipov.productcatalogservice.repository;

import com.sharipov.productcatalogservice.domain.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
