package transport;

public class Test {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов И.В.", true, 5);
        DriverC driverC = new DriverC("Петров П.П.", true, 7);
        DriverD driverD = new DriverD("Сидоров С.С.", true, 10);

        Cars audi = new Cars("Audi", "A 8", 3.5, driverB,BodyType.SEDAN);

        Trucks kamaz = new Trucks("Kamaz", "Tipper", 12.5, driverC, LoadCapacity.N3);

        Buses toyota = new Buses("Toyota", "Alphard", 3.2, driverD, Size.XS);

     /*   printInfo(audi);
        printInfo(kamaz);
        printInfo(toyota);

        audi.pitStop();
    }
    public static void printInfo(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " упавляет автомобилем " + transport.getBrand()+ " и будет участвовать в заезде");
    }*/

        //System.out.println(BodyType.COUPE.getType());
        //System.out.println(BodyType.SUV);
        System.out.println(audi);
        audi.printType();
    }
    }

