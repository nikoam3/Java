package Clase7;

import java.util.ArrayList;

public class Revista {
    private String nombre;
    private int codido;
    private String periodicidad;
    private ArrayList<Edicion> ediciones;

    public Revista(String nombre , int codido , String periodicidad) {
        this.nombre = nombre;
        this.codido = codido;
        this.periodicidad = periodicidad;
        ediciones = new ArrayList<>();
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", codido=" + codido +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
