package Clase16.ejercioPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Map cuentas;

    public Persona(String nombre , String apellido , int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas = new TreeMap();
    }

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    public boolean esMayorEdad(){
        if (this.edad > 60){
            return true;
        } else {
            return false;
        }
    }

    public void agregarCuentas(Cuenta cuenta){
        cuentas.put(cuenta.getNroCuenta(), cuenta.getSaldo());
    }

    public double getSaldoTotal(){
        double saldoTotal = 0;
        for (Object cuentas: cuentas.values()) {
            saldoTotal += (double) cuentas;
        }
        return saldoTotal;
    }

    public void mostrarCuentas(){
        for (Object cuenta: cuentas.values()) {
            System.out.println(cuenta);
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cuentas=" + cuentas +
                '}';
    }
}
