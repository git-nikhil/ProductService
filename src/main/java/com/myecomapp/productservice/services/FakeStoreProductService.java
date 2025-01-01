package com.myecomapp.productservice.services;

import com.myecomapp.productservice.dtos.CreateProductRequestDto;
import com.myecomapp.productservice.dtos.FakeStoreProductDto;
import com.myecomapp.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {
    private final RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        FakeStoreProductDto[] product = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDto[].class);
        assert product != null;
        for (FakeStoreProductDto fakeStoreProductDto : product) {
            Product product1 = fakeStoreProductDto.toProduct();
            products.add(product1);
        }
        return products;
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
        FakeStoreProductDto fakeStoreProductDto = product.toFakeStoreProductDto();
        FakeStoreProductDto product1 = restTemplate.postForObject("https://fakestoreapi.com/products",
                fakeStoreProductDto,
                FakeStoreProductDto.class);
        assert product1 != null;
        return product1.toProduct();
    }
}
