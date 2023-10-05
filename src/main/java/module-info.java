module com.example.javafx_practise {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.javafx_practise to javafx.fxml;
    exports com.example.javafx_practise;
}