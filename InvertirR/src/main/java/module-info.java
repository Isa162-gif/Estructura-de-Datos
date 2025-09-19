module com.isaiassystems.invertirr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.invertirr to javafx.fxml;
    exports com.isaiassystems.invertirr;
    exports com.isaiassystems.invertirr.controller;
    opens com.isaiassystems.invertirr.controller to javafx.fxml;
}