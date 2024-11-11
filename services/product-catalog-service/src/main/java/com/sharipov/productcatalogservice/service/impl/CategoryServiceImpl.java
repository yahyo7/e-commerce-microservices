package com.sharipov.productcatalogservice.service.impl;

import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import com.sharipov.productcatalogservice.repository.CategoryRepository;
import com.sharipov.productcatalogservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryEntity createCategory(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<CategoryEntity> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<CategoryEntity> getRootCategories() {
        return categoryRepository.findAllByParentCategoryIsNull();
    }
}
