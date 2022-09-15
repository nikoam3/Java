package Clase20.Clase;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public abstract double consultarPrecio();

    public abstract String consultarNombre();

    public abstract String mostrarDatos();

    public String getNombre() {
        return nombre;
    }
}
