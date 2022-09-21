package Clase19.MesaPG;

public abstract class Producto {
    private double peso;

    public Producto(){
        this.peso = peso;
    }

    public abstract double calcularEspacio();

    @Override
    public String toString() {
        return "Producto{" +
                "peso=" + peso +
                '}';
    }
}
