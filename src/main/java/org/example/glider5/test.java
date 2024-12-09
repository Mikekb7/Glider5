package org.example.glider5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file for the Register view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/glider5/Register-view.fxml"));
            Parent root = loader.load();

            // Set up the stage
            primaryStage.setTitle("Register Test");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
