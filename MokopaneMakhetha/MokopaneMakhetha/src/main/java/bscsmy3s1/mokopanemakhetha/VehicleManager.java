package bscsmy3s1.mokopanemakhetha;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private static final List<Vehicle> vehicles = new ArrayList<>();

    public static void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }
}