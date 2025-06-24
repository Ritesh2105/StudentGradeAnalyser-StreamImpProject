module com.example.studentgradeanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentgradeanalyzer to javafx.fxml;
    exports com.example.studentgradeanalyzer;
}