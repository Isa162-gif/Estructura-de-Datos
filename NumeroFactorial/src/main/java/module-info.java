module com.isaiassystems.numerofactorial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.numerofactorial to javafx.fxml;
    exports com.isaiassystems.numerofactorial;
    exports com.isaiassystems.numerofactorial.controller;
    opens com.isaiassystems.numerofactorial.controller to javafx.fxml;
}