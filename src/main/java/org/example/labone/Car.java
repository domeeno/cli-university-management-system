package org.example.labone;

public class Car {
    private String name;
    private String brand;
    private float mileage;

    public Car(String name, String brand, float mileage) {
        this.name = name;
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
}
