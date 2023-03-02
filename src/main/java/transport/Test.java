package transport;

public class Test {
    public static void main(String[] args) {
        Bus a = new Bus("Merсedes", "long", 2023, "Germany", "White", 180);
        Bus b = new Bus("Toyota", "Alphard", 2007, "Japan", "black", 200);
        Bus c = new Bus("УАЗ", "Буханка", 1992, "Россия", "оливковый", 160);

        Car ab = new Car("Kia", "Optima", 2.0, "red", 250, 2022, "South Korea", "sedan", "333", 4, new Car.Key(false,false));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(ab);

    }
}
