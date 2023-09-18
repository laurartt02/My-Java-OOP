module com.example.myjavaoop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.myjavaoop to javafx.fxml;
    exports com.example.myjavaoop;
}