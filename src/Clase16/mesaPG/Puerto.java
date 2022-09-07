package Clase16.mesaPG;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private ArrayList<Contenedor> contenedores = new ArrayList<>();

    public void ingresarContenedores(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void ordenarContenedores() {
        Collections.sort(contenedores);
    }

    public int cantidadContenedoresPeligrosos() {
        int contador = 0;
        for (Contenedor c : contenedores) {
            if (c.isMaterialPeligroso() && c.getPais() == "Desconocido") {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "contenedores=" + contenedores +
                '}';
    }
}
