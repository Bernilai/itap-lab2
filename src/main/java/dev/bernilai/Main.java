package dev.bernilai;

import dev.bernilai.types.EngineType;
import dev.bernilai.types.MotorcycleType;
import dev.bernilai.types.TruckBodyType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car bmwCar = new Car("BMW", "M6", 2017, "Black", 305, 4, 4, EngineType.GASOLINE, 300);
        Car subaruCar = new Car("Subaru", "Impreza", 2012, "Red", 193, 4, 5, EngineType.GASOLINE, 538);
        Car hondaCar = new Car("Honda", "Civic", 2010, "Blue", 205, 4, 5, EngineType.GASOLINE, 456);

        Motorcycle hondaMotocycle = new Motorcycle("Honda", "CBR1000RR", 2008, "Red", 250, 2, MotorcycleType.SPORTS, 1000, false);
        Motorcycle harleyMotocycle = new Motorcycle("Harley Davidson", "Low Rider S", 2020, "Black", 193, 2, MotorcycleType.CRUISER, 1868, false);
        Motorcycle uralMotorcycle = new Motorcycle("Ural", "Gear-Up Expedition", 2023, "Orange", 113, 3, MotorcycleType.CRUISER, 749, true);

        Truck kenworthTruck = new Truck("Kenworth", "T880", 2013, "Blue", 110, 12, 10360, TruckBodyType.DUMP, 5);
        Truck dongfengTruck = new Truck("Dongfeng", "DFH4250", 2014, "Yellow", 110, 10, 10200, TruckBodyType.ENCLOSED, 3);
        Truck volvoTruck = new Truck("Volvo", "FH16", 2012, "White", 110, 22, 36000, TruckBodyType.ENCLOSED, 6);

        System.out.println("Trucks total: " + Truck.getTruckCounter());

        bmwCar.start();
        subaruCar.start();
        hondaCar.start();

        hondaMotocycle.start();
        harleyMotocycle.start();
        uralMotorcycle.start();

        kenworthTruck.start();
        dongfengTruck.start();
        volvoTruck.start();

        bmwCar.stop();
        subaruCar.stop();
        hondaCar.stop();

        hondaMotocycle.stop();
        harleyMotocycle.stop();
        uralMotorcycle.stop();

        kenworthTruck.stop();
        dongfengTruck.stop();
        volvoTruck.stop();

    }
}
