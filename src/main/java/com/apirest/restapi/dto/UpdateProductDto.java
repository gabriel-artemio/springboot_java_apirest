package com.apirest.restapi.dto;

public record UpdateProductDto(
    String name,

    String description,

    Boolean available
) {
    
}
