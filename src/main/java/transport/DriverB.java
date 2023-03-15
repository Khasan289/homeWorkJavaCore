package transport;

public class DriverB extends  Driver{
    public DriverB(String fullName, boolean licence, int experience) {
        super(fullName, licence, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Водитель категории В " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправляет авто");
    }
}
