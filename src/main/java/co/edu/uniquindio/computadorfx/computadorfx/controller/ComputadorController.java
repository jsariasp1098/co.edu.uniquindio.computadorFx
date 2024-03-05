package co.edu.uniquindio.computadorfx.computadorfx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ComputadorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearComputador;

    @FXML
    private TextField txrDiscoDuroSsd;

    @FXML
    private TextField txtDiscoDurosHdd;

    @FXML
    private TextField txtMemoriaRam;

    @FXML
    private TextField txtMonitor;

    @FXML
    private TextField txtProcesador;

    @FXML
    private TextField txtTarjetaGrafica;

    @FXML
    private RadioButton radioButtonBasico;

    @FXML
    private RadioButton radioButtonGamer;

    @FXML
    private RadioButton radioButtonOficina;

    @FXML
    private TextArea txtComputadorCreado;

    @FXML
    void onCrearComputador(ActionEvent event) {
        //System.out.println("Hola a Todos");
        CrearComputador();
    }

    @FXML
    void initialize() {

    }

    private void CrearComputador(){
        if(radioButtonBasico.isSelected()){
            txtComputadorCreado.setText("Computador Basico");
            System.out.printf("Computador Basico");
        } else if (radioButtonOficina.isSelected()) {
            txtComputadorCreado.setText("Computador Oficina");
            System.out.printf("Computador Oficina");
        }else if(radioButtonGamer.isSelected()) {
            txtComputadorCreado.setText("Computador Gamer");
            System.out.printf("Computador Gamer");
        }else {
            txtComputadorCreado.setText("Ninguna Seleccion");
            System.out.printf("Ninguna Seleccion");
        }
       // txtComputadorCreado.setText("Hola a Todos");
    }

}
