module com.isaiassystems.enbinarior {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.enbinarior to javafx.fxml;
    exports com.isaiassystems.enbinarior;
    exports com.isaiassystems.enbinarior.controller;
    opens com.isaiassystems.enbinarior.controller to javafx.fxml;
}