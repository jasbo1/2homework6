package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();


        Car c1 = new Car("porche", 2000, 2.2);
        cars.add(c1);
        Car c2 = new Car("mustang", 1990, 2.6);
        cars.add(c2);
        Car c3 = new Car("lada", 2002, 4.3);
        cars.add(c3);
        Car c4 = new Car("nissan", 2010, 5.2);
        cars.add(c4);
        Car c5 = new Car("mercedes", 2013, 3.4);
        cars.add(c5);
        Car c6 = new Car("audi", 1998, 1.2);
        cars.add(c6);
        Car c7 = new Car("hundai", 2018, 2.2);
        cars.add(c7);
        Car c8 = new Car("toyota", 2000, 2.4);
        cars.add(c8);
        Car c9 = new Car("moskvich", 1989, 2.2);
        cars.add(c9);
        Car c10 = new Car("kia", 2017, 5.6);
        cars.add(c10);

        Collections.sort(cars);
        Collections.reverse(cars);

        printListForEachLoop(cars);


    }

    private static void printListForEachLoop(ArrayList<Car> list) {
        for (Car a : list)
        {
            System.out.println(a);
        }

    }
}
