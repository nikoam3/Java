package Clase11.ejemploClase;

import java.time.LocalDate;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private Integer hojasDisponibles;
    private Double porcentajeTinta;

    public Impresora(String modelo , String tipoConexion , LocalDate fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }
    public Double getPorcentajeTinta(){
        return this.porcentajeTinta;
    }
    public void cargarTinta(){
        this.porcentajeTinta=100.0;
    }
    public void cargarPapel(Integer num){
        this.hojasDisponibles=num;
    }

    public boolean tienePapel(){
        return this.hojasDisponibles > 0;
    }

    public boolean necesitaTinta(){
        return this.porcentajeTinta <= 5;
    }

    public abstract String imprimir();
}
