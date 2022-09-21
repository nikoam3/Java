package Clase21.Clase;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> ofertas;

    public Instituto(String nombre){
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }
    public void agregarOferta(OfertaAcademica oferta){
        ofertas.add(oferta);
    }

    public String generarInforme(){
            String datos="";
            for (OfertaAcademica oferta:ofertas){
                datos += oferta.mostrar() + "\n";
            }
            return datos;
        }
    }

