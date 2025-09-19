module com.isaiassystems.palinr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.palinr to javafx.fxml;
    exports com.isaiassystems.palinr;
    exports com.isaiassystems.palinr.controller;
    opens com.isaiassystems.palinr.controller to javafx.fxml;
}