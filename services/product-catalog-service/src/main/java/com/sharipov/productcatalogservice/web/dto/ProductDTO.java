package com.sharipov.productcatalogservice.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import lombok.Data;


import java.math.BigDecimal;


@Data
public class ProductDTO {
    private String name;
    private String description;
    private BigDecimal price;
    @JsonProperty("category")
    private CategoryDTO categoryDTO;
}
