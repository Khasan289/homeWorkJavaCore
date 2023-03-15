package transport;

import java.util.Objects;

public class Cars extends Transport<DriverB> {

    public Cars(String brand, String model, double engineCapacity, DriverB driver) {
        super(brand, model, engineCapacity, driver);
    }


    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Автомобиль "+getBrand()+" остановился");
    }

    @Override
    public void PitStop() {
        System.out.println("Поменять колеса автомобилю " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга для автомобиля: 3 минуты");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля: 220 км/ч");
    }
}
