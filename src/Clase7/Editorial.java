package Clase7;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private ArrayList<Revista> revistas;

    public Editorial(String nombre){
        this.nombre = nombre;
        revistas = new ArrayList<>();
    }

    public void agregarRevista(Revista revista){
        revistas.add(revista);
    }

    public void cancelarRevista(Revista revista){
        revistas.remove(revista);
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
