package Clase14.simulacroExamen;

public class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int longitud;
    private Capitan capitan;

    public Embarcacion(double precioBase ,int anioFabricacion, int longitud , Capitan capitan) {
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.longitud = longitud;
        this.capitan = capitan;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double alquiler(){
        if (getAnioFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", longitud=" + longitud +
                ", capitan=" + capitan +
                '}';
    }
}
