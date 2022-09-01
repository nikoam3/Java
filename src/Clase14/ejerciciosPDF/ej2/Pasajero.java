package Clase14.ejerciciosPDF.ej2;

public class Pasajero {
    private boolean preferenciaSentado;

    public Pasajero(boolean preferenciaSentado) {
        this.preferenciaSentado = preferenciaSentado;
    }

    public boolean isPreferenciaSentado() {
        return preferenciaSentado;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "preferenciaSentado=" + preferenciaSentado +
                '}';
    }
}
