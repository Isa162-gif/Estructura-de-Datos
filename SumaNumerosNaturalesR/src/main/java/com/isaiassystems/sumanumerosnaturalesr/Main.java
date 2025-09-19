package com.isaiassystems.sumanumerosnaturalesr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sum-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Recursive Sum");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Launch JavaFX application
    }
}
