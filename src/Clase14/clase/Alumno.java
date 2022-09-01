package Clase14.clase;

public class Alumno {
    private String nombre;
    private String apellido;
    private String legajo;

    public Alumno(String nombre , String apellido , String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Alumno(){};

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
