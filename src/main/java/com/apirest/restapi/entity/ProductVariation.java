package com.apirest.restapi.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product_variations")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductVariation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sizeName;

    private String description;

    private Boolean available;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product; // Relação adicionada
}
