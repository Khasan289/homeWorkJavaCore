package transport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;

    private final String bodyType;
    private final String registrationNumber;
    private final int numberOfSeats;
    private String rubber;

    private Key key;





    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String bodyType, String registrationNumber, int numberOfSeats, Key key) {
        this.brand = brand == null || brand == "" ? "default" : brand;
        this.model = model == null || model == "" ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color == "" ? "белый" : color;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry == "" ? "default" : productionCountry;
        this.bodyType = bodyType == null || bodyType == "" ? "default" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber == "" ? "default" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? 5 : numberOfSeats;
        setKey(key);


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

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubber() {
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    public void changeTiresToSeasonal(int currentMonth) {

        boolean winterTires = currentMonth >= 11 && currentMonth < 13 && currentMonth >= 1 && currentMonth <= 3;
        boolean summerTires = currentMonth>3 && currentMonth<11;
        if (summerTires) {
            this.rubber="Летняя";
        } else if (winterTires) {
            this.rubber="Зимняя";
        } else {
            this.rubber="Сезон задан некорректно";
        }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удаленный запуск двигателя" : "удаленный запуск отсутствует") + ", " +
                    (keylessEntry ? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && numberOfSeats == car.numberOfSeats && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && registrationNumber.equals(car.registrationNumber) && rubber.equals(car.rubber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, numberOfSeats, rubber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "марка " + brand + '\'' +
                ", модель " + model + '\'' +
                ", объем двигателя " + engineVolume +
                ", цвет " + color + '\'' +
                ", год выпуска " + productionYear +
                ", страна выпуска " + productionCountry + '\'' +
                ", коробка передач " + transmission + '\'' +
                ", тип кузова " + bodyType + '\'' +
                ", регистрационный знак " + registrationNumber + '\'' +
                ", количество сидячих мест " + numberOfSeats +
                ", тип резины: " + rubber + '\'' +
                '}' + key;
    }
}
