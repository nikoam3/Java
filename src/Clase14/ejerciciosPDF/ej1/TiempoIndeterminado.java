package Clase14.ejerciciosPDF.ej1;

public class TiempoIndeterminado extends Empleado{
    private int antiguedad;
    private int cantidadHijos;
    private double sueldo;

    public TiempoIndeterminado(String nombre , String apellido , int matricula , double sueldoBasico) {
        super(nombre , apellido , matricula , sueldoBasico);
    }

    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    public void setCantidadHijos(int cantidadHijos){
        this.cantidadHijos = cantidadHijos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void suplementoHijo(){
        if (getCantidadHijos() * 200 >= 1000){
            setSueldo(getSueldoBasico() + 1000.0);
        }else{
            setSueldo(getSueldoBasico() + (getCantidadHijos() * 200.0));
        }
    }

    public void suplementoAntiguedad(){
        if (getAntiguedad() * 100 >= 500){
            setSueldo(getSueldoBasico() + 1000.0);
        }else{
            setSueldo(getSueldoBasico() + (getAntiguedad() * 100.0));
        }
    }

    @Override
    public String toString() {
        return "TiempoIndeterminado{" +
                "antiguedad=" + antiguedad +
                ", cantidadHijos=" + cantidadHijos +
                ", sueldo=" + sueldo +
                '}';
    }
}
