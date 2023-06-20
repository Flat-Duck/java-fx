module com.example.subjects {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.subjects to javafx.fxml;
    exports com.example.subjects;
}