package Clase14.simulacroExamen;

public class Veleros extends Embarcacion implements Comparable<Veleros>{
    private int cantMastiles;

    public Veleros(double precioBase , int anioFabricacion , int longitud , Capitan capitan , int cantMastiles) {
        super(precioBase , anioFabricacion , longitud , capitan);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    @Override
    public int compareTo(Veleros o) {
        return getCantMastiles() - o.getCantMastiles();
    }

    @Override
    public String toString() {
        return "Embarcacion{ "+ super.toString()+ "\nVeleros{" +
                "cantMastiles=" + cantMastiles +
                '}';
    }
}
