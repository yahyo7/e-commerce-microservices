package com.sharipov.productcatalogservice.repository;

import com.sharipov.productcatalogservice.domain.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    List<CategoryEntity> findAllByParentCategoryIsNull();
}
