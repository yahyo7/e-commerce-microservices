package com.sharipov.productcatalogservice.web.dto;

import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import lombok.Data;


@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private String description;
    private Long parentCategoryId;
}
