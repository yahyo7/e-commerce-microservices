package com.sharipov.productcatalogservice.service;

import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    CategoryEntity createCategory(CategoryEntity category);

    List<CategoryEntity> getCategories();

    List<CategoryEntity> getRootCategories();
}
