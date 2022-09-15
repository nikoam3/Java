package Clase20.Clase;

import java.util.ArrayList;

public class Combo extends Producto{
    private double descuento;
    private ArrayList<Producto> productos;

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        productos = new ArrayList<>();
    }

    public void agregar(Producto producto){
        productos.add(producto);
    }

    public double calcularDescuento(double precio){
        return precio / 100 * this.descuento;
    }
    @Override
    public double consultarPrecio() {
        double total = 0;
        for (Producto p : productos) {
            total += p.consultarPrecio();
        }
        return total - calcularDescuento(total);
    }

    @Override
    public String consultarNombre() {
        return super.getNombre();
    }

    @Override
    public String mostrarDatos() {
        String datos = "";
        for (Producto p : productos) {
            datos += p.mostrarDatos();
        }
        return "Nombre " + super.getNombre() + " Elementos " + datos + " Precio " + consultarPrecio() + "\n";
    }
}
