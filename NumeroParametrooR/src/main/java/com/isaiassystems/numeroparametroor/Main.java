package com.isaiassystems.numeroparametroor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("digi-view.fxml"));

        // Create the scene using the loaded FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Set window title
        stage.setTitle("Digit Counter");

        // Attach the scene to the stage and show it
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Launch the JavaFX application
    }
}
