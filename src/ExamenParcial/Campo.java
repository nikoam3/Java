package ExamenParcial;

import java.time.LocalDate;

public class Campo extends Propiedad{
    private boolean casco;
    private double cantHectareas;

    public Campo(LocalDate fechaAdquirida , double precio , String direccion , boolean hipotecada , Duenio duenio , boolean casco , double cantHectareas) {
        super(fechaAdquirida , precio , direccion , hipotecada , duenio);
        this.casco = casco;
        this.cantHectareas = cantHectareas;
    }

    public boolean aptoCultivo(){
        if (this.cantHectareas > 10){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean venta() {
        return super.venta();
    }

    @Override
    public String toString() {
        return "Campo{" +
                "casco=" + casco +
                ", cantHectareas=" + cantHectareas +
                '}';
    }
}
