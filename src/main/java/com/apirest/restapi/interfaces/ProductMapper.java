package com.apirest.restapi.interfaces;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.apirest.restapi.dto.CreateProductVariationDto;
import com.apirest.restapi.dto.RecoveryProductDto;
import com.apirest.restapi.dto.RecoveryProductVariationDto;
import com.apirest.restapi.entity.Product;
import com.apirest.restapi.entity.ProductVariation;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "productVariations", qualifiedByName = "mapProductVariationToRecoveryProductVariationDto")
    RecoveryProductDto mapProductToRecoveryProductDto(Product product);

    @Named("mapProductVariationToRecoveryProductVariationDto")
    @IterableMapping(qualifiedByName = "mapProductVariationToRecoveryProductVariationDto")
    List<RecoveryProductVariationDto> mapProductVariationToRecoveryProductVariationDto(List<ProductVariation> productVariations);

    @Named("mapProductVariationToRecoveryProductVariationDto")
    RecoveryProductVariationDto mapProductVariationToRecoveryProductVariationDto(ProductVariation productVariation);

    ProductVariation mapCreateProductVariationDtoToProductVariation(CreateProductVariationDto createProductVariationDto);
}
