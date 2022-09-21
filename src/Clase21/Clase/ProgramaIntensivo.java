package Clase21.Clase;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica {
    private double descuento;
    private ArrayList<OfertaAcademica> cursos;

    public ProgramaIntensivo(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.cursos = new ArrayList<>();
    }
    public void agregarCurso(OfertaAcademica oferta){
        cursos.add(oferta);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (OfertaAcademica oferta:cursos) {
            total += oferta.calcularPrecio();
        }
        return total * (1-this.descuento/100) ;
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + " Precio: $ " + calcularPrecio();
    }
}
