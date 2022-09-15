package Clase20.MesaPG;

public class Rectangulo extends Figura{
    private double alto;
    private double largo;

    public Rectangulo(double alto , double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return this.alto * this.largo;
    }
}
