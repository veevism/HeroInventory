module com.example.herooinventory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.herooinventory to javafx.fxml;
    exports com.example.herooinventory;
}