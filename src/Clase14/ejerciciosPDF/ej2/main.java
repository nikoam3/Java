package Clase14.ejerciciosPDF.ej2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero(true);
        Pasajero pasajero1 = new Pasajero(false);
        System.out.println(pasajero.toString());

        Micro micro = new Micro(2, 2);
        /*
        micro.subirPasajero(pasajero);
        micro.subirPasajero(pasajero);
        micro.subirPasajero(pasajero);
        micro.subirPasajero(pasajero1);
        micro.bajarPasajero(pasajero);
        micro.bajarPasajero(pasajero);
        micro.bajarPasajero(pasajero);
        micro.bajarPasajero(pasajero1);
        */
        micro.cargarGrupo(pasajero);
        micro.cargarGrupo(pasajero);
        micro.cargarGrupo(pasajero);
        micro.subirGrupo();


    }
}
