package com.ohgiraffers.practice;

import com.ohgiraffers.practice.product.ProductDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "modify" : successMessage = "변경이 완료되었습니다!"; break;
            case "productRegist" : successMessage = "새로운 제품이 추가되었습니다!"; break;
            case "rentalRegist" : successMessage = "새로운 제품의 대여 정보가 추가되었습니다!"; break;
            case "deleteProduct" : successMessage = "제품이 삭제 되었습니다!"; break;
            case "deleteRental" : successMessage = "제품 관련 대여정보가 삭제되었습니다!"; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "modify" : errorMessage = "변경에 실패하였습니다."; break;
            case "productRegist" : errorMessage = "새로운 제품 추가에 실패하셨습니다."; break;
            case "rentalRegist" : errorMessage = "새로운 제품의 정보 추가에 실패하였습니다."; break;
            case "deleteProduct" : errorMessage = "제품 삭제를 실패하였습니다."; break;
            case "deleteRental" : errorMessage = "제품 대여정보 삭제를 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printShowAll(List<ProductAndRentalDTO> productList) {

        System.out.println("================== 제품 전체 조회 ==================");

        for (ProductAndRentalDTO product : productList) {
            System.out.println(product);
        }

    }

    public void searchProductById(ProductAndRentalDTO productAndRental) {
        System.out.println("================== 선택하신 제품 정보입니다 ==================");
        System.out.println(productAndRental);
    }
}
