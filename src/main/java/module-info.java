module com.example.rpglite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpglite to javafx.fxml;
    exports com.example.rpglite;
}