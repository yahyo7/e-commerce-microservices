package com.sharipov.productcatalogservice.domain.entity;

import io.micrometer.core.annotation.Counted;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    @Column(name = "category_id")
    private Long categoryId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", updatable = false, insertable = false)
    private CategoryEntity category;
}
