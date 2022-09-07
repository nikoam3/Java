package Clase16.mesaPG;

public class main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        Contenedor cont1 = new Contenedor(1, "EEUU", true);
        Contenedor cont2 = new Contenedor(55, "Desconocido", true);
        Contenedor cont3 = new Contenedor(10, "Desconocido", true);
        Contenedor cont4 = new Contenedor(2, "Canada", false);

        puerto.ingresarContenedores(cont1);
        puerto.ingresarContenedores(cont2);
        puerto.ingresarContenedores(cont3);
        puerto.ingresarContenedores(cont4);

        System.out.println(puerto.toString());

        puerto.ordenarContenedores();

        System.out.println(puerto.toString());

        System.out.println("Existen " + puerto.cantidadContenedoresPeligrosos() + " contenedores con materiales peligrosos y de procedencia desconocida");

    }
}
