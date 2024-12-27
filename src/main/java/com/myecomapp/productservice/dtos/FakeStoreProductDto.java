package com.myecomapp.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}