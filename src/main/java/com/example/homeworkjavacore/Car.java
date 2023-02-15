package com.example.homeworkjavacore;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = validateBrand(brand);
        this.model =validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.productionYear = validateYear(productionYear);
        this.productionCountry = validateCountry(productionCountry);
    }

    public String validateBrand(String brand) {
        if (brand == null || brand == "") {
            return "default";
        }else {
            this.brand = brand;
        }
        return brand;
    }
    public String validateModel(String model) {
        if (model == null || model == "") {
            return "default";
        }else {
            this.model = model;
        }
        return model;
        }

    public double validateEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            return 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }

    public String validateColor(String color) {
        if (color == null || color == "") {
            return "белый";
        }else {
            this.color = color;
        }
        return color;
    }

    public int validateYear(int productionYear) {
        if (productionYear <= 0) {
            return 2000;
        }else {
            this.productionYear = productionYear;
        }
        return productionYear;
    }

    public String validateCountry(String productionCountry) {
        if (productionCountry == null || productionCountry == "") {
            return "default";
        }else {
            this.productionCountry = productionCountry;
        }
        return productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engineVolume, car.engineVolume) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }

    @Override
    public String toString() {
        return brand + ' ' + model + '\'' +
                ", объем двигателя-" + engineVolume + " л. " + '\'' +
                ", цвет " + color + '\'' +
                ", год выпуска " + productionYear +
                ", старна производства-" + productionCountry + '\'' +
                '}';
    }
}
