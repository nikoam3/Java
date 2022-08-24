package Clase10.ejercicio;

import java.util.Objects;

//SUBCLASE
public class Empleado extends Persona {
    private double sueldo;
    private double descuento;
    private String legajo;

    public Empleado(String nombre , String apellido , int edad , double sueldo , double descuento , String legajo) {
        super(nombre , apellido , edad); // herencia
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.legajo = legajo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.sueldo , sueldo) == 0 && Double.compare(empleado.descuento , descuento) == 0 && Objects.equals(legajo , empleado.legajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sueldo , descuento , legajo);
    }
}
