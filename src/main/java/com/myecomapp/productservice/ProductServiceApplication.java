package com.myecomapp.productservice;

import com.myecomapp.productservice.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        Product product1 = new Product();
        int id = product1.getId();
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
