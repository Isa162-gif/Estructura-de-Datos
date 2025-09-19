module com.isaiassystems.fibonaccir {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.fibonaccir to javafx.fxml;
    exports com.isaiassystems.fibonaccir;
    exports com.isaiassystems.fibonaccir.controller;
    opens com.isaiassystems.fibonaccir.controller to javafx.fxml;
}