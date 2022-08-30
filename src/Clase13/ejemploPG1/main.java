package Clase13.ejemploPG1;

public class main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(29, "Nicolas", "Amaya");
        Persona persona2 = new Persona(29, "Agostina", "Comello");

        if (persona2.compareTo(persona1) > 0){
            System.out.println("Persona 2 es mayor que persona 1");
        } else if (persona2.compareTo(persona1) < 0) {
            System.out.println("Persona 1 es mayor que persona 2");
        }else{
            System.out.println("Persona 2 tiene la misma edad que persona 1");
        }
    }
}
