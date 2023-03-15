package transport;

public class DriverD extends Driver {
    public DriverD(String fullName, boolean licence, int experience) {
        super(fullName, licence, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getFullName() + " заправляет авто");
    }
}
