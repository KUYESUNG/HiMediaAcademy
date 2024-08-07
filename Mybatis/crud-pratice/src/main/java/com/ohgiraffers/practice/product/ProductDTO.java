package com.ohgiraffers.practice.product;

public class ProductDTO {

    private int id;
    private String model;
    private String ram;
    private String ssd;
    private String brand;
    private String date;

    public ProductDTO() {}

    public ProductDTO(int id, String model, String ram, String ssd, String brand, String date) {
        this.id = id;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
