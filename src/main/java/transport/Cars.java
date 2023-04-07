package transport;

public class Cars extends Transport<DriverB> {

    BodyType bodyType;


    public Cars(String brand, String model, double engineCapacity, DriverB driver,BodyType bodyType) {
        super(brand, model, engineCapacity, driver);
        this.bodyType = bodyType;
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
    public Type getType() {
        return Type.CARS;
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyType());

        }
    }

    @Override
    public void pitStop() {
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

    @Override
    public String toString() {
        return super.toString() + bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
