module com.isaiassystems.imprimirnumerosdecrementor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.imprimirnumerosdecrementor to javafx.fxml;
    exports com.isaiassystems.imprimirnumerosdecrementor;
    exports com.isaiassystems.imprimirnumerosdecrementor.controller;
    opens com.isaiassystems.imprimirnumerosdecrementor.controller to javafx.fxml;
}