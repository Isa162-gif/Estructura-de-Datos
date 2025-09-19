module com.isaiassystems.potenciar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.potenciar to javafx.fxml;
    exports com.isaiassystems.potenciar;
    exports com.isaiassystems.potenciar.controller;
    opens com.isaiassystems.potenciar.controller to javafx.fxml;
}