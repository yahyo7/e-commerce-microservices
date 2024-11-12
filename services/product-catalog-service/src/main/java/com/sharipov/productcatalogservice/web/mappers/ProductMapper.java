package com.sharipov.productcatalogservice.web.mappers;

import com.sharipov.productcatalogservice.domain.entity.ProductEntity;
import com.sharipov.productcatalogservice.web.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    public static ProductEntity toEntity(ProductDTO productDTO) {
        ProductEntity product = new ProductEntity();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(CategoryMapper.toEntity(productDTO.getCategoryDTO()));
        return product;
    }

    public static ProductDTO toDTO(ProductEntity product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

    public static List<ProductEntity> listToEntity(List<ProductDTO> productDTOList){
        return productDTOList.stream()
                .map(ProductMapper::toEntity)
                .collect(Collectors.toList());
    }

    public static List<ProductDTO> listToDTO(List<ProductEntity> productDTOList){
        return productDTOList.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }


}
