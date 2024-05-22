module org.example.messengerclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.messengerclient to javafx.fxml;
    exports org.example.messengerclient;
}