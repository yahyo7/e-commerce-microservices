package com.sharipov.productcatalogservice.service.impl;

import com.sharipov.productcatalogservice.domain.entity.ProductEntity;
import com.sharipov.productcatalogservice.domain.exeption.ResourceNotFoundException;
import com.sharipov.productcatalogservice.repository.ProductRepository;
import com.sharipov.productcatalogservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAllProducts() {
        return (List<ProductEntity>) productRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product not found."));
    }

    @Override
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity, Long id) {
        ProductEntity exist = getProductById(id);
        if (exist != null){
            exist.setPrice(productEntity.getPrice());
            exist.setDescription(productEntity.getDescription());
            exist.setName(productEntity.getName());
            productRepository.save(exist);
        }
        return exist;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
