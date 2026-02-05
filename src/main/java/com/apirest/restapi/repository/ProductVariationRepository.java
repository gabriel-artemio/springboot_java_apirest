package com.apirest.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.restapi.entity.ProductVariation;

@Repository
public interface  ProductVariationRepository extends JpaRepository<ProductVariation, Long>{
    
}
