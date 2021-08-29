module Exchange.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;

    exports application;
    opens BusinessLogic;
}