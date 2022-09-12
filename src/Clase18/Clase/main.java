package Clase18.Clase;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Messi", "DELANTERO", 10);

        Seleccion seleccion = new Seleccion("Argentina");

        for (int i = 0; i < 21; i++) {
            seleccion.agregarJugador(new Jugador("Test", "DELANTERO",i+2));
        }
        ArrayList<Jugador> jugadorReserva = seleccion.obtenerReserva();
        for (Jugador j:jugadorReserva) {
            System.out.println(j.toString());
        }
        try{
            System.out.println(seleccion.cantidadJugadoresPosicion("DELANTERoO"));
        }catch (PosicionExcepcion p){
            System.err.println(p.toString());
        }
        System.out.println(seleccion.toString());
    }
}
