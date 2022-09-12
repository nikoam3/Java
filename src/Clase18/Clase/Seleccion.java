package Clase18.Clase;

import java.util.ArrayList;

public class Seleccion {
    private String pais;
    private ArrayList<Jugador> jugadores;

    public Seleccion(String pais) {
        this.pais = pais;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public ArrayList<Jugador> obtenerReserva(){
        ArrayList<Jugador> reservas = new ArrayList<>();
        for (int i = jugadores.size()-6; i < jugadores.size(); i++) {
            reservas.add(jugadores.get(i));
        }
        return reservas;
    }
    
    public int cantidadJugadoresPosicion(String posicion) throws PosicionExcepcion {
        int cont=0;
        if (posicion.equals("ARQUERO") && posicion.equals("DEFENSOR") && posicion.equals("DELANTERO") && posicion.equals("MEDIOCAMPISTA")){
            throw new PosicionExcepcion("Ingreso incorrectamente la posicion");
        }
        for (Jugador j:jugadores) {
            if (j.getPosicion().equals(posicion)){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Seleccion{" +
                "pais='" + pais + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }
}
