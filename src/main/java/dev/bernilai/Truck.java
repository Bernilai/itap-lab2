package dev.bernilai;

import dev.bernilai.types.TruckBodyType;

public class Truck extends Transport {

    private int loadCapacity;
    private TruckBodyType bodyType;
    private int numberOfAxles;
    private static int truckCounter = 0;

    public Truck() {
        super();
        this.loadCapacity = 0;
        this.bodyType = TruckBodyType.UNKNOWN;
        this.numberOfAxles = 0;
    }

    public Truck(String brand, String model, int year, String color, int maxSpeed, int numberOfWheels, int loadCapacity, TruckBodyType bodyType, int numberOfAxles) {
        super(brand, model, year, color, maxSpeed, numberOfWheels);
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
        this.numberOfAxles = numberOfAxles;
        truckCounter++;
    }

    @Override
    public void start() {
        System.out.println("Truck" + " " + getBrand() + " " + getModel() + " has started");
    }

    @Override
    public void stop() {
        System.out.println("Truck" + " " + getBrand() + " " + getModel() + " has stopped");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TruckBodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(TruckBodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public static int getTruckCounter() {
        return truckCounter;
    }
}

