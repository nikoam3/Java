package Clase19.Clase;

public class EmpleadoRelacionDependencia extends Empleado {
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
    }

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo,Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo() {
        return sueldoMensual;
    }

}
