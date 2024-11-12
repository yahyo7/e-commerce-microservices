package com.sharipov.productcatalogservice.web.controller;


import com.sharipov.productcatalogservice.domain.entity.ProductEntity;
import com.sharipov.productcatalogservice.service.ProductService;
import com.sharipov.productcatalogservice.web.dto.ProductDTO;
import com.sharipov.productcatalogservice.web.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;
    private final ProductMapper mapper;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProduct(){

        List<ProductDTO> response = mapper.listToDTO(productService.getAllProducts());
        return ResponseEntity.ok(response);
    }
    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long id){
        ProductDTO response = mapper.toDTO(productService.getProductById(id));
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        ProductEntity entity = mapper.toEntity(productDTO);
        ProductDTO response = mapper.toDTO(productService.createProduct(entity));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProductById(id);
    }
}
