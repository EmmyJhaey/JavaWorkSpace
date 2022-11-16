package com.emmy.collections.arrayLists;

import java.util.ArrayList;

public class ArrayListLearning {
    public static void main(String[] args) {
//        ArrayList<Integer> animals = new ArrayList<Integer>();
//
//        animals.add(12);
//        animals.add(123);
//        animals.add(452);
//        animals.add(124);
//
//
//        System.out.println(animals.size());

//        int counter = 1;
//
//       for(String animal: animals){
//           System.out.println( counter + " : " + animal);
//           counter++;
//       }

        ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

        cars.add(new Vehicle("Benz", "Blue", 200_000));
        cars.add(new Vehicle("Toyota", "Black", 50_000));
        cars.add(new Vehicle("Lexus", "Pink", 120_000));
        cars.add(new Vehicle("Mazda", "Blue", 30_000));
        cars.add(new Vehicle("G-wagon", "Black", 720_000));

        int counter = 1;
        for(Vehicle car : cars){
            System.out.println(counter + " :  " +car);
            counter++;
        }
    }
}
