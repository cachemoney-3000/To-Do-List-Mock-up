module com.application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires junit;
    requires org.junit.jupiter.api;

    opens baseline to javafx.fxml;
    exports baseline;
}