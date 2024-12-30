package com.myecomapp.productservice.services;

import com.myecomapp.productservice.dtos.CreateProductRequestDto;
import com.myecomapp.productservice.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(long id);

    Product createProduct(CreateProductRequestDto product);
}
