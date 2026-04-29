package com.micro.product_service.dto;

import com.micro.product_service.Entity.Product;

public class Mapper {
    public static Product productRequestToProduct(ProductRequest productRequest) {
        Product product=new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        return product;
    }

    public static ProductResponse productToProductResponse(Product product) {
        ProductResponse productResponse=new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setPrice(product.getPrice());
        return productResponse;
    }
}
