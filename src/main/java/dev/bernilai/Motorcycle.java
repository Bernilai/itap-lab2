package dev.bernilai;

import dev.bernilai.Transport;
import dev.bernilai.types.MotorcycleType;

class Motorcycle extends Transport {
    private MotorcycleType motorcycleType;
    private int engineVolume;
    private boolean hasTrunk;

    // Конструктор по умолчанию
    public Motorcycle() {
        super();
        this.motorcycleType = MotorcycleType.UNKNOWN;
        this.engineVolume = 0;
        this.hasTrunk = false;
    }

    // Полный конструктор
    public Motorcycle(String brand, String model, int year, String color, int maxSpeed, int numberOfWheels, MotorcycleType motorcycleType, int engineVolume, boolean hasTrunk) {
        super(brand, model, year, color, maxSpeed, numberOfWheels);
        this.motorcycleType = motorcycleType;
        this.engineVolume = engineVolume;
        this.hasTrunk = hasTrunk;
    }

    @Override
    public  void start() {
        System.out.println("Motorcycle" + " " + getBrand() + " " + getModel() + " has started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle" + " " + getBrand() + " " + getModel() + " has stopped");
    }

    // Геттеры и сеттеры
    public MotorcycleType getMotorcycleType() { return motorcycleType; }
    public void setMotorcycleType(MotorcycleType motorcycleType) { this.motorcycleType = motorcycleType; }

    public int getEngineVolume() { return engineVolume; }
    public void setEngineVolume(int engineVolume) { this.engineVolume = engineVolume; }

    public boolean isHasTrunk() { return hasTrunk; }
    public void setHasTrunk(boolean hasTrunk) { this.hasTrunk = hasTrunk; }

//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Motorcycle Type: " + motorcycleType + ", Engine Volume: " + engineVolume + " cc, Has Trunk: " + hasTrunk);
//    }
}
