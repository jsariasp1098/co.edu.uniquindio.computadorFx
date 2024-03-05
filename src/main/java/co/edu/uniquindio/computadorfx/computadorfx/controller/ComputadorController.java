package co.edu.uniquindio.computadorfx.computadorfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.computadorfx.computadorfx.model.Computador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ComputadorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup TipoComputador;

    @FXML
    private Button btnCrearComputador;

    @FXML
    private RadioButton radioButtonBasico;

    @FXML
    private RadioButton radioButtonGamer;

    @FXML
    private RadioButton radioButtonOficina;

    @FXML
    private TextArea txtComputadorCreado;

    @FXML
    private TextField txtDiscoDuroSsd;

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
    void onCrearComputador(ActionEvent event) {
        //System.out.println("Hola a Todos");
        CrearComputador();
    }

    @FXML
    void initialize() {

    }

    private void CrearComputador(){
        if(radioButtonBasico.isSelected()){
            computadorBasico();
        } else if (radioButtonOficina.isSelected()) {
            computadorOficina();
        }else if(radioButtonGamer.isSelected()) {
            computadorGamer();
        }else {
            txtComputadorCreado.setText("Ninguna Seleccion");
            System.out.printf("Ninguna Seleccion");
        }
       // txtComputadorCreado.setText("Hola a Todos");
    }

    private void computadorBasico (){
        Computador computadorBasico = Computador.builder().procesador(txtProcesador.getText())
                .discoDuroHdd(txtDiscoDurosHdd.getText()).memoriaRam(txtMemoriaRam.getText()).Builder();
        txtComputadorCreado.setText("Computador Basico Creado con= Procesador: "
                + computadorBasico.getProcesador() +", Disco Duro Mecanico: " +computadorBasico.getDiscoDuroHdd()
                + " GB y Memoria Ram de: "+computadorBasico.getMemoriaRam() + " GB");
    }
    private void computadorOficina (){
        Computador computadorOficina = Computador.builder().procesador(txtProcesador.getText())
                .discoDuroHdd(txtDiscoDurosHdd.getText()).memoriaRam(txtMemoriaRam.getText()).discoDuroSsd(
                txtDiscoDuroSsd.getText()).Builder();
        txtComputadorCreado.setText("Computador de Oficina Creado con= Procesador: "
                + computadorOficina.getProcesador() +", Disco Duro Mecanico: " +computadorOficina.getDiscoDuroHdd()
                +" GB, Dico Duro de Estado Solido: "+computadorOficina.getDiscoDuroSsd() +
                " y GB, Memoria Ram de: "+computadorOficina.getMemoriaRam() + " GB");
    }

    private void computadorGamer (){
        Computador computadorGamer = Computador.builder().procesador(txtProcesador.getText())
                .discoDuroHdd(txtDiscoDurosHdd.getText()).memoriaRam(txtMemoriaRam.getText()).discoDuroSsd(
                        txtDiscoDuroSsd.getText()).tarjetaGrafica(txtTarjetaGrafica.getText()).monitor(
                        txtMonitor.getText()).Builder();
        txtComputadorCreado.setText("Computador Gamer Creado con= Procesador: "
                + computadorGamer.getProcesador() +", Disco Duro Mecanico: " +computadorGamer.getDiscoDuroHdd()
                +" GB, Dico Duro de Estado Solido: "+computadorGamer.getDiscoDuroSsd() +
                " GB, Memoria Ram de: "+computadorGamer.getMemoriaRam() + " GB, Tarjeta Grafica: "+
                computadorGamer.getTarjetaGrafica() + " y Monitor de: " +computadorGamer.getMonitor());
    }

}
