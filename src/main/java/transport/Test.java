package transport;

public class Test {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов И.В.", true, 5);
        DriverC driverC = new DriverC("Петров П.П.", true, 7);
        DriverD driverD = new DriverD("Сидоров С.С.", true, 10);

        Cars audi = new Cars("Audi", "A 8", 3.5,driverB);

        Trucks kamaz = new Trucks("Kamaz", "Tipper", 12.5,driverC);

        Buses toyota = new Buses("Toyota", "Alphard", 3.2,driverD);

        printInfo(audi);
        printInfo(kamaz);
        printInfo(toyota);
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " упавляет автомобилем " + transport.getBrand()+ " и будет участвовать в заезде");
    }
}
