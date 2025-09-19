module com.isaiassystems.ordenrecursividad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.ordenrecursividad to javafx.fxml;
    exports com.isaiassystems.ordenrecursividad;
    exports com.isaiassystems.ordenrecursividad.controller;
    opens com.isaiassystems.ordenrecursividad.controller to javafx.fxml;
}