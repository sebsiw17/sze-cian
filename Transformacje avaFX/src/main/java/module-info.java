module com.example.transformacjejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.transformacjejavafx to javafx.fxml;
    exports com.example.transformacjejavafx;
}