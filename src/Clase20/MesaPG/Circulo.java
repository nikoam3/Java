package Clase20.MesaPG;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return this.radio * this.radio * Math.PI;
    }
}
