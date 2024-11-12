package com.sharipov.productcatalogservice.web.mappers;
import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import com.sharipov.productcatalogservice.web.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public static CategoryEntity toEntity(CategoryDTO categoryDTO){
        if (categoryDTO == null){
            return null;
        }
        CategoryEntity entity = new CategoryEntity();
        entity.setName(categoryDTO.getName());
        entity.setDescription(categoryDTO.getDescription());
        entity.setParentId(categoryDTO.getParentCategoryId());
        return entity;
    }

    public static CategoryDTO toDTO(CategoryEntity entity){
        if (entity == null){
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(entity.getName());
        categoryDTO.setDescription(entity.getDescription());
        categoryDTO.setParentCategoryId(entity.getParentId());
        return categoryDTO;
    }

}
