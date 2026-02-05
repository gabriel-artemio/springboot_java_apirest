package com.apirest.restapi.dto;

import java.util.List;

public record  CreateProductDto(
    String name,

    String description,

    String category,

    List<CreateProductVariationDto> productVariations,

    Boolean available
) {
    
}
