package com.micro.product_service.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    @NotNull(message = "Product name cannot be empty")
    private String name;
    @NotNull(message = "Product price cannot be empty")
    private Double price;
    @NotNull(message = "Product quantity cannot be empty")
    private Integer quantity;
}
