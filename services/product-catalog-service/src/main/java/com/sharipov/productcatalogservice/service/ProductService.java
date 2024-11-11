package com.sharipov.productcatalogservice.service;

import com.sharipov.productcatalogservice.domain.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(Long id);
    ProductEntity createProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity productEntity, Long id);
    void deleteProductById(Long id);
}
