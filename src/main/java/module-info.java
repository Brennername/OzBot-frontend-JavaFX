module nexen.ozbotfrontendjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens nexen.ozbotfrontendjavafx to javafx.fxml;
    exports nexen.ozbotfrontendjavafx;
}