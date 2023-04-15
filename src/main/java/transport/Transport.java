package transport;

import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing{

    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;

    public Transport(String brand, String model, double engineCapacity,T driver) {
        this.brand = brand == null || brand.isEmpty() ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.engineCapacity = engineCapacity <= 0 ? 1.5 : engineCapacity;
        setDriver(driver);
    }

    public abstract void startMoving();

    public abstract void finishTheMove();



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract Type getType();

    public abstract void printType();

    public abstract void getDiagnosed() throws TransportTypeException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return  "марка " + brand + '\'' +
                ", модель " + model + '\'' +
                ", объём двигателя " + engineCapacity +
                '}';
    }

}
