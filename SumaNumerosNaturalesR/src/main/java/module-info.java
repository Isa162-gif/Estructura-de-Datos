module com.isaiassystems.sumanumerosnaturalesr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.isaiassystems.sumanumerosnaturalesr to javafx.fxml;
    exports com.isaiassystems.sumanumerosnaturalesr;
    exports com.isaiassystems.sumanumerosnaturalesr.controller;
    opens com.isaiassystems.sumanumerosnaturalesr.controller to javafx.fxml;
}