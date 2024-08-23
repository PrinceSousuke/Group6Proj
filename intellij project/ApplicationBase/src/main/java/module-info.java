module pro100.group6.applicationbase {
    requires javafx.controls;
    requires javafx.fxml;


    opens pro100.group6.applicationbase to javafx.fxml;
    exports pro100.group6.applicationbase;
    exports pro100.group6.applicationbase.model.abstractmodel;
    opens pro100.group6.applicationbase.model.abstractmodel to javafx.fxml;
    exports pro100.group6.applicationbase.model.enums;
    opens pro100.group6.applicationbase.model.enums to javafx.fxml;
    exports pro100.group6.applicationbase.model.character;
    opens pro100.group6.applicationbase.model.character to javafx.fxml;
}