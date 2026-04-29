package com.micro.product_service.Service;

import com.micro.product_service.Entity.Product;
import com.micro.product_service.*;
import com.micro.product_service.Repository.ProductRepository;
import com.micro.product_service.dto.Mapper;
import com.micro.product_service.dto.ProductRequest;

import com.micro.product_service.dto.ProductResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String save(ProductRequest productRequest) {
        Product product=Mapper.productRequestToProduct(productRequest);
        productRepository.save(product);
        return "Product saved successfully";
    }

    @Override
    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream().map(Mapper::productToProductResponse).toList();
    }

    @Override
    public @Nullable ProductResponse findById(Long id) {
        Product product=productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        return Mapper.productToProductResponse(product);
    }
}
