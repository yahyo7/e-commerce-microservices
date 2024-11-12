package com.sharipov.productcatalogservice.web.controller;


import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import com.sharipov.productcatalogservice.service.CategoryService;
import com.sharipov.productcatalogservice.web.dto.CategoryDTO;
import com.sharipov.productcatalogservice.web.mappers.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper mapper;

    @GetMapping("/category")
    public ResponseEntity<List<CategoryEntity>> getParentCategory(){
        List<CategoryEntity> response = categoryService.getRootCategories();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/subcategory")
    public ResponseEntity<List<CategoryEntity>> getSubCategory(){
        List<CategoryEntity> response = categoryService.getCategories();
        return ResponseEntity.ok(response);
    }


    @PostMapping
    public ResponseEntity<CategoryDTO> saveCategory(@RequestBody CategoryDTO categoryDTO){
        CategoryEntity category = mapper.toEntity(categoryDTO);
        CategoryDTO response = mapper.toDTO(categoryService.createCategory(category));
        return ResponseEntity.ok(response);
    }


}
