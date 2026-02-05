package com.apirest.restapi.interfaces;

import com.apirest.restapi.dto.CreateProductVariationDto;
import com.apirest.restapi.dto.RecoveryProductDto;
import com.apirest.restapi.dto.RecoveryProductVariationDto;
import com.apirest.restapi.entity.Product;
import com.apirest.restapi.entity.ProductVariation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-05T11:43:24-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public RecoveryProductDto mapProductToRecoveryProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        List<RecoveryProductVariationDto> productVariations = null;
        Long id = null;
        String name = null;
        String description = null;
        String category = null;
        Boolean available = null;

        productVariations = mapProductVariationToRecoveryProductVariationDto( product.getProductVariations() );
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        if ( product.getCategory() != null ) {
            category = product.getCategory().name();
        }
        available = product.getAvailable();

        RecoveryProductDto recoveryProductDto = new RecoveryProductDto( id, name, description, category, productVariations, available );

        return recoveryProductDto;
    }

    @Override
    public List<RecoveryProductVariationDto> mapProductVariationToRecoveryProductVariationDto(List<ProductVariation> productVariations) {
        if ( productVariations == null ) {
            return null;
        }

        List<RecoveryProductVariationDto> list = new ArrayList<RecoveryProductVariationDto>( productVariations.size() );
        for ( ProductVariation productVariation : productVariations ) {
            list.add( mapProductVariationToRecoveryProductVariationDto( productVariation ) );
        }

        return list;
    }

    @Override
    public RecoveryProductVariationDto mapProductVariationToRecoveryProductVariationDto(ProductVariation productVariation) {
        if ( productVariation == null ) {
            return null;
        }

        Long id = null;
        String sizeName = null;
        String description = null;
        BigDecimal price = null;
        Boolean available = null;

        id = productVariation.getId();
        sizeName = productVariation.getSizeName();
        description = productVariation.getDescription();
        price = productVariation.getPrice();
        available = productVariation.getAvailable();

        RecoveryProductVariationDto recoveryProductVariationDto = new RecoveryProductVariationDto( id, sizeName, description, price, available );

        return recoveryProductVariationDto;
    }

    @Override
    public ProductVariation mapCreateProductVariationDtoToProductVariation(CreateProductVariationDto createProductVariationDto) {
        if ( createProductVariationDto == null ) {
            return null;
        }

        ProductVariation.ProductVariationBuilder productVariation = ProductVariation.builder();

        productVariation.available( createProductVariationDto.available() );
        productVariation.description( createProductVariationDto.description() );
        productVariation.price( createProductVariationDto.price() );
        productVariation.sizeName( createProductVariationDto.sizeName() );

        return productVariation.build();
    }
}
