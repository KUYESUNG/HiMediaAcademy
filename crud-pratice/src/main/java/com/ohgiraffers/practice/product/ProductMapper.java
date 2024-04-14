package com.ohgiraffers.practice.product;

import com.ohgiraffers.practice.ProductAndRentalDTO;

import java.util.List;

public interface ProductMapper {
    List<ProductAndRentalDTO> showAll();

    ProductAndRentalDTO searchProductById(int id);

    int productRegist(ProductDTO product);

    int deleteProduct(int id);
}
