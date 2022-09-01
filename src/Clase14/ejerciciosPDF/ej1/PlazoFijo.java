package Clase14.ejerciciosPDF.ej1;

public class PlazoFijo extends Empleado{
    private int mesesContrato;

    public PlazoFijo(String nombre , String apellido , int matricula , double sueldoBasico , int mesesContrato) {
        super(nombre , apellido , matricula , sueldoBasico);
        this.mesesContrato = mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    @Override
    public String toString() {
        return  "PlazoFijo{" +
                "mesesContrato=" + mesesContrato +
                '}';
    }
}
