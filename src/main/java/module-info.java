module com.complexno.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.complexno.demo to javafx.fxml;
    exports com.complexno.demo;
}