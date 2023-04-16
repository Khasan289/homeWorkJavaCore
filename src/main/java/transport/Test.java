package transport;

public class Test {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иванов И.В.", true, 5);
        DriverC driverC = new DriverC("Петров П.П.", true, 7);
        DriverD driverD = new DriverD("Сидоров С.С.", true, 10);

        Cars audi = new Cars("Audi", "A 8", 3.5, driverB, BodyType.SEDAN);
        Cars chevrolet = new Cars("Шевроле", "Малибу", 1.5, driverB, BodyType.SEDAN);

        Trucks kamaz = new Trucks("Kamaz", "Tipper", 12.5, driverC, LoadCapacity.N3);

        Buses toyota = new Buses("Toyota", "Alphard", 3.2, driverD, Size.XS);

        Buses ikarys = new Buses("Икарус", "Лонг", 6.5, driverD, Size.S);

        audi.getDiagnosed();
        kamaz.getDiagnosed();
        try {
            toyota.getDiagnosed();
        } catch (TransportTypeException e) {
            throw new RuntimeException(e);
        }

    }


    }






