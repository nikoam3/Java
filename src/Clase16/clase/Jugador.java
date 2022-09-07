package Clase16.clase;

public class Jugador implements Comparable<Jugador> {
    private int numCamiseta;
    private String nombre;
    private boolean titular;
    private boolean lesionado;

    public Jugador(int numCamiseta , String nombre , boolean titular , boolean lesionado) {
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        this.titular = titular;
        this.lesionado = lesionado;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.numCamiseta - o.numCamiseta;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numCamiseta=" + numCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
