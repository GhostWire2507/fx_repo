package bscsmy3s1.mokopanemakhetha;

import java.time.Year;

// Base class for all vehicles
public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Calculate age of vehicle
    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }

    // Display general info
    public String displayInfo() {
        return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year +
                "\nAge: " + calculateAge() + " years";
    }
}