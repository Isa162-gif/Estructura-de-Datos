module com.isaiassystems.rectangulor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.rectangulor to javafx.fxml;
    exports com.isaiassystems.rectangulor;
    exports com.isaiassystems.rectangulor.controller;
    opens com.isaiassystems.rectangulor.controller to javafx.fxml;
}