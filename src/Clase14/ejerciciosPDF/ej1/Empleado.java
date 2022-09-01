package Clase14.ejerciciosPDF.ej1;

public class Empleado {
    private String nombre;
    private String apellido;
    private int matricula;
    private double sueldoBasico;

    public Empleado(String nombre , String apellido , int matricula , double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula=" + matricula +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
