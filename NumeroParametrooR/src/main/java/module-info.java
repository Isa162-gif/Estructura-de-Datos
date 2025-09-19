module com.isaiassystems.numeroparametroor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.numeroparametroor to javafx.fxml;
    exports com.isaiassystems.numeroparametroor;
    exports com.isaiassystems.numeroparametroor.controller;
    opens com.isaiassystems.numeroparametroor.controller to javafx.fxml;
}