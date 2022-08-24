package Clase10.ejemploClase;

import java.util.Objects;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio , String nombre , Double cuotaMensual , String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }
    public Socio(){

    };

    public Double calcularCuotaMensual(){
        return cuotaMensual;
    }
    public  Double getCuotaMensual(){
        return this.cuotaMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(numeroSocio , socio.numeroSocio);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
