module com.isaiassystems.imprimirnumerosr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.imprimirnumerosr to javafx.fxml;
    exports com.isaiassystems.imprimirnumerosr;
    exports com.isaiassystems.imprimirnumerosr.controller;
    opens com.isaiassystems.imprimirnumerosr.controller to javafx.fxml;
}