package org.example.glider5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));

        stage.setTitle("Hello!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}