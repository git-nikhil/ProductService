package com.myecomapp.productservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequestDto {
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
    public FakeStoreProductDto toFakeStoreProductDto() {
        FakeStoreProductDto dto = new FakeStoreProductDto();
        dto.setTitle(title);
        dto.setDescription(description);
        dto.setImage(image);
        dto.setCategory(category);
        dto.setPrice(price);
        return dto;
    }
}
