package ExamenParcial;

import java.time.LocalDate;

public class Propiedad {
    private LocalDate fechaAdquirida;
    private double precio;
    private String direccion;
    private boolean hipotecada;
    private Duenio duenio;

    public Propiedad(LocalDate fechaAdquirida , double precio , String direccion , boolean hipotecada , Duenio duenio) {
        this.fechaAdquirida = fechaAdquirida;
        this.precio = precio;
        this.direccion = direccion;
        this.hipotecada = hipotecada;
        this.duenio = duenio;
    }

    public boolean venta(){
        return this.hipotecada;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "fechaAdquirida=" + fechaAdquirida +
                ", precio=" + precio +
                ", direccion='" + direccion + '\'' +
                ", hipotecada=" + hipotecada +
                ", duenio=" + duenio +
                '}';
    }
}
