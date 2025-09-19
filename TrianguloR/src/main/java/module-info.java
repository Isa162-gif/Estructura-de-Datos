module com.isaiassystems.triangulor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.triangulor to javafx.fxml;
    exports com.isaiassystems.triangulor;
    exports com.isaiassystems.triangulor.controller;
    opens com.isaiassystems.triangulor.controller to javafx.fxml;
}