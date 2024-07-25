module com.example.noronha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.noronha to javafx.fxml;
    exports com.example.noronha;
}