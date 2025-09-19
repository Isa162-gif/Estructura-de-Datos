module com.isaiassystems.binarior {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.binarior to javafx.fxml;
    exports com.isaiassystems.binarior;
    exports com.isaiassystems.binarior.controller;
    opens com.isaiassystems.binarior.controller to javafx.fxml;
}