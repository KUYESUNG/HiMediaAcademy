package com.ohgiraffers.practice;

import com.ohgiraffers.practice.product.ProductDTO;
import com.ohgiraffers.practice.rental.RentalDTO;

import java.util.List;

public class ProductAndRentalDTO {

    private List<ProductDTO> productList;
    private List<RentalDTO> rentalList;

    public ProductAndRentalDTO() {}

    public ProductAndRentalDTO(List<ProductDTO> productList, List<RentalDTO> rentalList) {
        this.productList = productList;
        this.rentalList = rentalList;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }

    public List<RentalDTO> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<RentalDTO> rentalList) {
        this.rentalList = rentalList;
    }

    @Override
    public String toString() {
        return "ProductAndRentalDTO{" +
                "productList=" + productList +
                ", rentalList=" + rentalList +
                '}';
    }
}
