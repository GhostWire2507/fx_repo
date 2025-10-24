package bscsmy3s1.mokopanemakhetha;

// Truck subclass extending Vehicle
public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nType: Truck" + "\nLoad Capacity: " + loadCapacity + " tons";
    }
}