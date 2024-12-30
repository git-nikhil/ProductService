package com.myecomapp.productservice.services;

import com.myecomapp.productservice.dtos.CreateProductRequestDto;
import com.myecomapp.productservice.dtos.FakeStoreProductDto;
import com.myecomapp.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {
    private final RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getSingleProduct(long id) {
        FakeStoreProductDto product = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);
        assert product != null;
        return product.toProduct();
    }

    @Override
    public Product createProduct(CreateProductRequestDto product) {
        return null;
    }
}
