module com.example.secondproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.secondproject to javafx.fxml;
    exports com.example.secondproject;
}