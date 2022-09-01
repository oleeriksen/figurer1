module com.example.figurer1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.figurer1 to javafx.fxml;
    exports com.example.figurer1;
}