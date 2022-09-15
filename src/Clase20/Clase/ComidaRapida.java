package Clase20.Clase;

public class ComidaRapida extends Producto{
    private double precio;

    public ComidaRapida(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public double consultarPrecio() {
        return this.precio;
    }

    @Override
    public String consultarNombre() {
        return super.getNombre();
    }

    @Override
    public String mostrarDatos() {
        return "Nombre " + super.getNombre() + " Precio " + this.precio + "\n";
    }
}
