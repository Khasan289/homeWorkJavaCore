package transport;

public class Trucks extends Transport<DriverC> {


    public Trucks(String brand, String model, double engineCapacity, DriverC driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " поехал");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Грузовик " + getBrand()+ " остановился");
    }

    @Override
    public void PitStop() {
        System.out.println("Поменять колеса грузовику " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Время круга грузовика: 5 минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика: 150 км/ч");
    }
}
