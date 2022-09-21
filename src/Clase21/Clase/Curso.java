package Clase21.Clase;

public class Curso extends OfertaAcademica{
    private double precioHora;
    private int cargaHoraria;
    private int mesesDuracion;

    public Curso(String nombre , String descripcion) {
        super(nombre , descripcion);
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(int mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }

    @Override
    public double calcularPrecio() {
        return this.cargaHoraria * this.precioHora * this.mesesDuracion;
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + " Precio: $" + calcularPrecio();
    }
}
