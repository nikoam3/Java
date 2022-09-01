package Clase14.simulacroExamen;

public class Yates extends Embarcacion implements Comparable<Yates>{
    private int cantCamarotes;

    public Yates(double precioBase , int anioFabricacion , int longitud , Capitan capitan , int cantCamarotes) {
        super(precioBase , anioFabricacion , longitud , capitan);
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    @Override
    public int compareTo(Yates o) {
        return getCantCamarotes() - o.getCantCamarotes();
    }

    @Override
    public String toString() {
        return "Embarcacion{ "+ super.toString()+ "\nYates{" +
                "cantCamarotes=" + cantCamarotes +
                '}';
    }
}
