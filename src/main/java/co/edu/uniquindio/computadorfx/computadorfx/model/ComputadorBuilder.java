package co.edu.uniquindio.computadorfx.computadorfx.model;

public class ComputadorBuilder {
    private String procesador, discoDuroHdd, discoDuroSsd, memoriaRam, tarjetaGrafica, monitor;

    public ComputadorBuilder() {
    }
    public ComputadorBuilder procesador(String procesador) {
        this.procesador = procesador;
        return this;
    }
    public ComputadorBuilder discoDuroHdd(String discoDuroHdd) {
        this.discoDuroHdd = discoDuroHdd;
        return this;
    }
    public ComputadorBuilder discoDuroSsd(String discoDuroSsd) {
        this.discoDuroSsd = discoDuroSsd;
        return this;
    }
    public ComputadorBuilder memoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }
    public ComputadorBuilder tarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }
    public ComputadorBuilder monitor(String monitor) {
        this.monitor = monitor;
        return this;
    }
    public Computador Builder (){
        return new Computador(procesador, discoDuroHdd, discoDuroSsd, memoriaRam, tarjetaGrafica, monitor);
    }
}
