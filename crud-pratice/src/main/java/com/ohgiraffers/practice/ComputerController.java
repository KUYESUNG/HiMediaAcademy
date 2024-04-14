package com.ohgiraffers.practice;

import com.ohgiraffers.practice.product.ProductDTO;
import com.ohgiraffers.practice.product.ProductService;
import com.ohgiraffers.practice.rental.RentalDTO;
import com.ohgiraffers.practice.rental.RentalService;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ComputerController {

    private final PrintResult printResult;
    private final ProductService productService;
    private final RentalService rentalService;

    public ComputerController() {
        printResult = new PrintResult();
        productService = new ProductService();
        rentalService = new RentalService();
    }
    public void showAll() {

        List<ProductAndRentalDTO> productAndRentalList = productService.showAll();

        if (productAndRentalList != null) {
            printResult.printShowAll(productAndRentalList);
        } else {
            printResult.printErrorMessage("all");
        }
    }

    public void searchProductById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        ProductAndRentalDTO productAndRental = productService.searchProductById(id);

        if (productAndRental != null) {
            printResult.searchProductById(productAndRental);
        } else {
            printResult.printErrorMessage("searchProductById");
        }
    }

    public void modifyRentalById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String rental = parameter.get("rental");

        RentalDTO rentalList = new RentalDTO();
        rentalList.setId(id);
        rentalList.setRental(rental);

        if (rentalService.modifyRental(rentalList)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }
    }

    public void registComputer(Map<String, String> parameter) {

        String model = parameter.get("model");
        String ram = parameter.get("ram");
        String ssd = parameter.get("ssd");
        String brand = parameter.get("brand");
        String date = parameter.get("date");
        int price = Integer.parseInt(parameter.get("price"));
        String rental = parameter.get("rental");

        ProductDTO product = new ProductDTO();
        product.setModel(model);
        product.setRam(ram);
        product.setSsd(ssd);
        product.setBrand(brand);
        product.setDate(date);

        RentalDTO rental2 = new RentalDTO();
        rental2.setPrice(price);
        rental2.setRental(rental);

        if (productService.productRegist(product)) {
            printResult.printSuccessMessage("productRegist");
        } else {
            printResult.printErrorMessage("productRegist");
        }

        if (rentalService.rentalRegist(rental2)) {
            printResult.printSuccessMessage("rentalRegist");
        } else {
            printResult.printErrorMessage("rentalRegist");
        }
    }

    public void deleteComputer(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        if (productService.deleteProduct(id)) {
            printResult.printSuccessMessage("deleteProduct");
        } else {
            printResult.printErrorMessage("deleteProduct");
        }

        if (rentalService.deleteRental(id)) {
            printResult.printSuccessMessage("deleteRental");
        } else {
            printResult.printErrorMessage("deleteRental");
        }
    }
}
