package transport;

public class Buses extends Transport<DriverD> {


    public Buses(String brand, String model, double engineCapacity, DriverD driver) {
        super(brand, model, engineCapacity, driver);
    }


    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " поехал");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Автобус " + getBrand() + " остановился");
    }


    @Override
    public void PitStop() {
        System.out.println("Протереть автобусу окна");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Время круга автобуса: 6 минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса: 120 км/ч");
    }
}
