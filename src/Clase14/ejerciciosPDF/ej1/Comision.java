package Clase14.ejerciciosPDF.ej1;

import java.util.ArrayList;

public class Comision extends Empleado{
    private ArrayList<Double> venta;
    private int comision;
    private double sueldo;

    public Comision(String nombre , String apellido , int matricula , double sueldoBasico , int comision) {
        super(nombre , apellido , matricula , sueldoBasico);
        this.venta = new ArrayList<>();
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void ventasRealizadas(double monto){
        venta.add(monto);
    }

    public void suplementoComision(){
        double suplemento = 0;
        for (int i = 0; i < venta.size(); i++) {
            suplemento += venta.get(i) * this.comision / 100;
        }
        setSueldo(super.getSueldoBasico() + suplemento);
    }

    @Override
    public String toString() {
        return "Comision{" +
                "venta=" + venta +
                ", comision=" + comision +
                ", sueldo=" + sueldo +
                '}';
    }
}
