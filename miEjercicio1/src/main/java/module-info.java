module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.miEjercicio1 to javafx.fxml;
    exports com.miEjercicio1;
}