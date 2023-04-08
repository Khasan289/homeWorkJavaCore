package transport;

public class Buses extends Transport<DriverD> {

    private Size size;

    public Buses(String brand, String model, double engineCapacity, DriverD driver, Size size) {
        super(brand, model, engineCapacity, driver);
        this.size = size;
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
    public Type getType() {
        return Type.BUSES;
    }

    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getSize());

        }
    }


    @Override
    public void pitStop() {
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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
