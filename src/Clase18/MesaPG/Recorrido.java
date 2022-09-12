package Clase18.MesaPG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recorrido {
    private String estacionDestino;
    private String estacionPartida;
    private ArrayList<String> estaciones = new ArrayList<>(Arrays.asList("Buenos Aires", "Luján" , "Mercedes", "Suipacha", "Chivilcoy", "Alberti", "Bragado"));

    public Recorrido(String estacionDestino , String estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    public boolean tipoRecorrido(){
        return (this.estacionDestino.equals(estaciones.get(0)) && this.estacionPartida.equals(estaciones.get(estaciones.size()-1))) || (this.estacionDestino.equals(estaciones.get(estaciones.size()-1)) && this.estacionPartida.equals(estaciones.get(0)));
    }


}
