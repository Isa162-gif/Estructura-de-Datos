module com.isaiassystems.ordenr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.ordenr to javafx.fxml;
    exports com.isaiassystems.ordenr;
    exports com.isaiassystems.ordenr.controller;
    opens com.isaiassystems.ordenr.controller to javafx.fxml;
}