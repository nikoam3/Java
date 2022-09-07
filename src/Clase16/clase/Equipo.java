package Clase16.clase;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        for (Jugador j : jugadores) {
            if (j.isTitular()){
                System.out.println(j.toString());
            }
        }
    }

    public int getCantidadJugadoresLesionados(){
        int contador = 0;
        for (Jugador j : jugadores) {
            if (j.isLesionado()){
                contador++;
            }
        }
        return contador;
    }
    public void ordenar(){
        Collections.sort(jugadores);
    }
}
