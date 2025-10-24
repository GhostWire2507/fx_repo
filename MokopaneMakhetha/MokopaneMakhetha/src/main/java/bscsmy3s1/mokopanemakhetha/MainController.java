package bscsmy3s1.mokopanemakhetha;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class MainController {

    @FXML private TextField txtBrand;
    @FXML private TextField txtModel;
    @FXML private TextField txtYear;
    @FXML private TextField txtExtra;
    @FXML private ComboBox<String> cmbType;
    @FXML private TextArea txtDisplay;
    @FXML private Button btnAddVehicle;
    @FXML private Button btnShowVehicles;

    @FXML
    public void initialize() {
        cmbType.getItems().addAll("Car", "Bus", "Truck");

        // Button hover effects
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.DARKCYAN);

        btnAddVehicle.setOnMouseEntered(e -> btnAddVehicle.setEffect(shadow));
        btnAddVehicle.setOnMouseExited(e -> btnAddVehicle.setEffect(null));
        btnShowVehicles.setOnMouseEntered(e -> btnShowVehicles.setEffect(shadow));
        btnShowVehicles.setOnMouseExited(e -> btnShowVehicles.setEffect(null));
    }

    @FXML
    protected void onAddVehicle() {
        try {
            String brand = txtBrand.getText();
            String model = txtModel.getText();
            int year = Integer.parseInt(txtYear.getText());
            String type = cmbType.getValue();

            if (brand.isEmpty() || model.isEmpty() || type == null) {
                txtDisplay.setText("⚠️ Please fill in all fields.");
                return;
            }

            Vehicle v;
            switch (type) {
                case "Car":
                    int doors = Integer.parseInt(txtExtra.getText());
                    v = new Car(brand, model, year, doors);
                    break;
                case "Bus":
                    int capacity = Integer.parseInt(txtExtra.getText());
                    v = new Bus(brand, model, year, capacity);
                    break;
                case "Truck":
                    double load = Double.parseDouble(txtExtra.getText());
                    v = new Truck(brand, model, year, load);
                    break;
                default:
                    txtDisplay.setText("Invalid vehicle type.");
                    return;
            }

            VehicleManager.addVehicle(v);
            txtDisplay.setText("✅ Vehicle added successfully!");

        } catch (Exception e) {
            txtDisplay.setText("⚠️ Invalid input! Please check your entries.");
        }
    }

    @FXML
    protected void onShowVehicles() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : VehicleManager.getVehicles()) {
            sb.append(v.displayInfo()).append("\n--------------------\n");
        }
        txtDisplay.setText(sb.toString());
    }
}