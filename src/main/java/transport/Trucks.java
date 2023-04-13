package transport;

public class Trucks extends Transport<DriverC> {


    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineCapacity, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, driver);
        this.loadCapacity = loadCapacity;
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
    public Type getType() {
        return Type.TRUCKS;
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getLoadCapacity());
        }
        }

    @Override
    public void getDiagnosed() {
        System.out.println("Автомобиль " + getBrand() + " прошел диагностику.");
    }


    @Override
    public void pitStop() {
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
