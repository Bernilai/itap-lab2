package dev.bernilai;

import dev.bernilai.types.EngineType;

public class Car extends Transport {

    private int numberOfSeats;
    private EngineType engineType;
    private int trunkVolume;

    public Car() {
        super();
        this.numberOfSeats = 0;
        this.engineType = EngineType.UNKNOWN;
        this.trunkVolume = 0;
    }

    public Car(String brand, String model, int year, String color, int maxSpeed, int numberOfWheels, int numberOfSeats, EngineType engineType, int trunkVolume) {
        super(brand, model, year, color, maxSpeed, numberOfWheels);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
        this.trunkVolume = trunkVolume;
    }

    @Override
    public void start() {
        System.out.println("Car" + " " + getBrand() + " " + getModel() + " has started");
    }

    @Override
    public void stop() {
        System.out.println("Car" + " " + getBrand() + " " + getModel() + " has stopped");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public EngineType getEngineType() {
        return engineType;
    }
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }
    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

}