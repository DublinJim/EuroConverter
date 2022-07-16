module com.example.euroconverter {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.euroconverter to javafx.fxml;
    exports com.example.euroconverter;
}