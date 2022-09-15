package Clase20.Clase;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> carrito;

    public Carrito(){
        carrito = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        carrito.add(producto);
    }

    public double precioTotal(){
        double total = 0;
        for (Producto p : carrito) {
            total += p.consultarPrecio();
        }
        return total;
    }

    public String mostrarCarrito(){
        String datos = "";
        for (Producto p : carrito) {
            datos += p.mostrarDatos();
        }
        return "Detalle compra: " + datos + " Precio: " + precioTotal() + "\n";
    }
    }

