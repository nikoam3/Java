package Clase6;

public class C6 {
    public static void main(String[] args) {
        /*
        Clase6.impresora_C6 impresosa1 = new Clase6.impresora_C6("2015", "USB", "HP-Link1234");
        impresosa1.conectar();
        impresosa1.agregarHojas(100);
        System.out.println(impresosa1.toString());
        impresosa1.imprimir("Hola Mundo!", 1);
        System.out.println(impresosa1.toString());
        */
        perros_C6 perro1 = new perros_C6("pequines", "2000", "Juan", 6, false, false, false);
        perros_C6 perro2 = new perros_C6("boxer", "2010", "Pepito", 4, false, true, false);
        System.out.println(perro1.getAnioNacimiento());
        System.out.println(perro1.sePierde());
        System.out.println(perro2.sePierde());
        perro1.setAdopcion(true);
        perro2.setAdopcion(true);
        System.out.println(perro1.toString());
        System.out.println(perro2.toString());
    }
}
