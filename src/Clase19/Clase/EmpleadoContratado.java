package Clase19.Clase;

public class EmpleadoContratado extends Empleado {

    private Double importePorHora;
    private Integer horasTrabajadas;


    public EmpleadoContratado(String nombre , String apellido , Integer legajo , Double importePorHora) {
        super(nombre , apellido , legajo);
        this.importePorHora = importePorHora;
        horasTrabajadas = 0;
    }

    public EmpleadoContratado(String nombre , String apellido , Integer legajo) {
        super(nombre , apellido , legajo);
    }

    @Override
    public Double calcularSueldo() {
        return importePorHora * horasTrabajadas;
    }

    public void cargarHoras(Integer horasIngresadas) {
        horasTrabajadas += horasIngresadas;
    }
}

