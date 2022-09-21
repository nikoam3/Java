package Clase19.MesaPG;

public class Pelota extends Producto {
    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    public Pelota(){
        super();
    }

    @Override
    public double calcularEspacio() {
        return 4/3 * Math.PI * Math.pow(this.radio, 3.0);
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "radio=" + radio +
                '}';
    }
}
