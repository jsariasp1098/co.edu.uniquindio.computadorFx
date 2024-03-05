module co.edu.uniquindio.computadorfx.computadorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.computadorfx.computadorfx to javafx.fxml;
    exports co.edu.uniquindio.computadorfx.computadorfx;

    opens co.edu.uniquindio.computadorfx.computadorfx.controller;
    exports co.edu.uniquindio.computadorfx.computadorfx.controller;

    //opens co.edu.uniquindio.computadorfx.computadorfx.model;
}