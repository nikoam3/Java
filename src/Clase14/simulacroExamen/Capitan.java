package Clase14.simulacroExamen;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matricula;

    public Capitan(String nombre , String apellido , int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
