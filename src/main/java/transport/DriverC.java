package transport;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean licence, int experience) {
        super(fullName, licence, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getFullName() + " заправляет авто");
    }
}
