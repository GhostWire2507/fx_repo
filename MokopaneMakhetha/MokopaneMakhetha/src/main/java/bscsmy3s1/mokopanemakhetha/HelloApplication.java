package bscsmy3s1.mokopanemakhetha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Load the vehicle form FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("vehicle-form.fxml"));

        // Create the main scene and set its dimensions
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Set stage properties
        stage.setTitle("Vehicle Management System");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Launch JavaFX application
    }
}