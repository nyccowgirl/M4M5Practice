module com.example.m4m5practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.m4m5practice to javafx.fxml;
    exports com.example.m4m5practice;
}