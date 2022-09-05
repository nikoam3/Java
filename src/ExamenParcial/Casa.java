package ExamenParcial;

import java.time.LocalDate;

public class Casa extends Propiedad implements Comparable<Casa>{
    private int cantAmbientes;
    private double cantM2;

    public Casa(LocalDate fechaAdquirida , double precio , String direccion , boolean hipotecada , Duenio duenio , int cantAmbientes , double cantM2) {
        super(fechaAdquirida , precio , direccion , hipotecada , duenio);
        this.cantAmbientes = cantAmbientes;
        this.cantM2 = cantM2;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    @Override
    public boolean venta() {
        return super.venta();
    }

    @Override
    public int compareTo(Casa o) {
        return this.cantAmbientes - o.cantAmbientes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cantAmbientes=" + cantAmbientes +
                ", cantM2=" + cantM2 +
                '}';
    }
}
