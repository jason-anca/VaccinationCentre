module com.example.vaccinationmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vaccinationmanagementsystem to javafx.fxml;
    exports com.example.vaccinationmanagementsystem;
}