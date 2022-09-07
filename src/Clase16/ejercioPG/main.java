package Clase16.ejercioPG;

public class main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(11, 300.0);
        Cuenta cuenta2 = new Cuenta(22, 200.0);
        Cuenta cuenta3 = new Cuenta(3, 500.0);
        Persona persona = new Persona("Nico", "Amaya", 25);
        persona.agregarCuentas(cuenta1);
        persona.agregarCuentas(cuenta2);
        persona.agregarCuentas(cuenta3);
        System.out.println(persona.getNombreCompleto());
        System.out.println(persona.toString());
        System.out.println(persona.getSaldoTotal());
        persona.mostrarCuentas();
    }
}
