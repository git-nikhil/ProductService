package com.myecomapp.productservice.dtos;

import com.myecomapp.productservice.models.Category;
import com.myecomapp.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private int id;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;

    public Product toProduct() {
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        Category category1 = new Category();
            category1.setTitle(category);
            product.setCategory(category1);
        product.setImageUrl(image);
        return product;
    }
}
