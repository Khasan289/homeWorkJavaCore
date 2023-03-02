package transport;

import java.util.Objects;

public class Transport {

    protected final String brand;
    protected final String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maximumMovementSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maximumMovementSpeed) {
        this.brand = brand == null || brand == "" ? "default" : brand;
        this.model = model == null || model == "" ? "default" : model;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry == "" ? "default" : productionCountry;
        this.color = color == null || color == "" ? "белый" : color;
        this.maximumMovementSpeed = maximumMovementSpeed <= 0 ? 100 : maximumMovementSpeed;




    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;






    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maximumMovementSpeed == transport.maximumMovementSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                " марка " + brand + '\'' +
                ", модель " + model + '\'' +
                ", цвет " + color + '\'' +
                ", год выпуска " + productionYear +
                ", страна выпуска " + productionCountry + '\'' +
                ", максимальная скорость " + maximumMovementSpeed + " км/ч " +
                '}';
    }
}
