package bscsmy3s1.mokopanemakhetha;

// Bus subclass extending Vehicle
public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nType: Bus" + "\nCapacity: " + passengerCapacity + " passengers";
    }
}