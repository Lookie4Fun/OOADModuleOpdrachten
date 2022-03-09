module com.example.opgave6_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opgave6_1 to javafx.fxml;
    exports com.example.opgave6_1;
}