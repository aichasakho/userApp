module sn.dev.userapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;


    opens sn.dev.userapp to javafx.fxml;
    exports sn.dev.userapp;
}