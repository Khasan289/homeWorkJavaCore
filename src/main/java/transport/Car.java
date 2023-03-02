package transport;

import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;

    private final String bodyType;
    private final String registrationNumber;
    private final int numberOfSeats;
    private String rubber;

    private Key key;




    public Car(String brand, String model, double engineVolume, String color, int maximumMovementSpeed, int productionYear, String productionCountry, String bodyType, String registrationNumber, int numberOfSeats, Key key) {

        super(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.bodyType = bodyType == null || bodyType == "" ? "default" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber == "" ? "default" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? 5 : numberOfSeats;
        setKey(key);


    }


    public double getEngineVolume() {
        return engineVolume;
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
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(rubber, car.rubber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, rubber, key);
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
