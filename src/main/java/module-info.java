module com.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.ejercicio1 to javafx.fxml;
    opens com.ejercicio1.controladores to javafx.fxml;
    exports com.ejercicio1;
}
