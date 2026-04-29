package com.micro.product_service.Service;

import com.micro.product_service.dto.ProductRequest;
import com.micro.product_service.dto.ProductResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProductService {
    String save(ProductRequest productRequest);

    List<ProductResponse> findAll();

    @Nullable ProductResponse findById(Long id);
}
