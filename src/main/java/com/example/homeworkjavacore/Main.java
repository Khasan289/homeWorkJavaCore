package com.example.homeworkjavacore;

import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "жёлтый",
                2015,
                "",
                "Седан",
                "333",
                4,null);

        Car audi = new Car(
                "Audi",
                "A 8 50 L TDI quattro",
                3.0, "черный",
                2020,
                "Германия",
                "Седан",
                "555",
                5,
                new Car.Key(true,true));

        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                "Седан",
                "111",
                2,
                new Car.Key(true,false));

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "Кроссовер",
                "333",
                5,
                new Car.Key(false, true));

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "Седан",
                "222",
                5,
                null);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        hyundai.setRubber("осенняя");
        hyundai.changeTiresToSeasonal(5);
        System.out.println(hyundai);





    }
}
