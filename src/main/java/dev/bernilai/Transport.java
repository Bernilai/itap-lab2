package dev.bernilai;

public abstract class Transport {

    private String brand;
    private String model;
    private int year;
    private String color;
    private int maxSpeed;
    private int numberOfWheels;

    // Конструктор по умолчанию
    public Transport() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
        this.maxSpeed = 0;
        this.numberOfWheels = 0;
    }

    // Полный конструктор
    public Transport(String brand, String model, int year, String color, int maxSpeed, int numberOfWheels) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void start();

    public abstract void stop();

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}