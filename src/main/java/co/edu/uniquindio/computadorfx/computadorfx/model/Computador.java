package co.edu.uniquindio.computadorfx.computadorfx.model;

public class Computador {
    private String procesador, discoDuroHdd, discoDuroSsd, memoriaRam, tarjetaGrafica, monitor;

    public Computador() {
    }

    public Computador(String procesador, String discoDuroHdd, String discoDuroSsd, String memoriaRam, String tarjetaGrafica, String monitor) {
        this.procesador = procesador;
        this.discoDuroHdd = discoDuroHdd;
        this.discoDuroSsd = discoDuroSsd;
        this.memoriaRam = memoriaRam;
        this.tarjetaGrafica = tarjetaGrafica;
        this.monitor = monitor;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuroHdd() {
        return discoDuroHdd;
    }

    public void setDiscoDuroHdd(String discoDuroHdd) {
        this.discoDuroHdd = discoDuroHdd;
    }

    public String getDiscoDuroSsd() {
        return discoDuroSsd;
    }

    public void setDiscoDuroSsd(String discoDuroSsd) {
        this.discoDuroSsd = discoDuroSsd;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public static ComputadorBuilder builder (){
        return new ComputadorBuilder();
    }

    @Override
    public String toString() {
        return "Computador{" +
                "procesador='" + procesador + '\'' +
                ", discoDuroHdd='" + discoDuroHdd + '\'' +
                ", discoDuroSsd='" + discoDuroSsd + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
