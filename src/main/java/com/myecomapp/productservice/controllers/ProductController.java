package com.myecomapp.productservice.controllers;

import com.myecomapp.productservice.dtos.CreateProductRequestDto;
import com.myecomapp.productservice.models.Product;
import com.myecomapp.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id")long id){
        return productService.getSingleProduct(id);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto product){
        return productService.createProduct(product);
    }
}
