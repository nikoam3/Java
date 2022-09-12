package Clase18.Clase;

public class Jugador {
    private String apellido;
    private String posicion;
    private int numCamiseta;

    public Jugador(String apellido , String posicion , int numCamiseta) {
        this.apellido = apellido;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numCamiseta=" + numCamiseta +
                '}';
    }
}
