package Clase14.ejerciciosPDF.ej2;

import java.util.ArrayList;

public class Vehiculos {
    private int asientosDisponibles;
    private int asientosOcupados;
    private int pasajerosParados;
    public int cantidadPlazasParados;
    private ArrayList<Pasajero> pasajeros;
    public Vehiculos(int asientosDisponibles , int cantidadPlazasParados) {
        this.asientosDisponibles = asientosDisponibles;
        this.cantidadPlazasParados = cantidadPlazasParados;
        this.pasajeros = new ArrayList<>();
        this.asientosOcupados = 0;
        this.pasajerosParados = 0;
    }

    public void subirPasajero(Pasajero pasajero){
        if (pasajero.isPreferenciaSentado() && (this.asientosOcupados < this.asientosDisponibles)){
            this.asientosOcupados +=1;
            System.out.print("Pasajero se sienta. \n");
        } else if (!pasajero.isPreferenciaSentado() && this.pasajerosParados < this.cantidadPlazasParados) {
            this.pasajerosParados +=1;
            System.out.print("Pasajero ingresa parado. \n");
        }else{
            System.out.print("Vehiculo lleno. \n");
        }
    }
    public void bajarPasajero(Pasajero pasajero) {
        if (this.pasajerosParados > 0 || this.asientosOcupados > 0) {
            if (pasajero.isPreferenciaSentado()) {
                this.asientosOcupados -= 1;
                System.out.print("Pasajero sentado baja \n");
            } else {
                this.pasajerosParados -= 1;
                System.out.print("Pasajero parado baja \n");
            }
        } else {
            System.out.println("Vehiculo vacio");
        }
    }

    public void subirGrupo(){
        for (int i = 0; i < pasajeros.size(); i++) {
            subirPasajero(pasajeros.get(i));
        }
    }
    public void cargarGrupo(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
}
