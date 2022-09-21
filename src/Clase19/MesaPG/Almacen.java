package Clase19.MesaPG;

import java.util.ArrayList;

public class Almacen {
    private String nombre;
    private ArrayList<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    public void agregarObjetos(Producto producto){
        productos.add(producto);
    }
    public double calcularEspacioNecesario(){
        double total = 0;
        for (Producto p:productos) {
            total += p.calcularEspacio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "productos=" + productos +
                '}';
    }
}
