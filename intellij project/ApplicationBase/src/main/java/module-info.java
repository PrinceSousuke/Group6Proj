module pro100.group6.applicationbase {
    requires javafx.controls;
    requires javafx.fxml;


    opens pro100.group6.applicationbase to javafx.fxml;
    exports pro100.group6.applicationbase;
}