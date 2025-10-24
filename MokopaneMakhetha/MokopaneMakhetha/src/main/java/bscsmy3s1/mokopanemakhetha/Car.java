package bscsmy3s1.mokopanemakhetha;

// Car subclass extending Vehicle
public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nType: Car" + "\nDoors: " + numDoors;
    }
}