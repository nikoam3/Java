package Clase13.ejemploPG;

public class main {
    public static void main(String[] args) {
        Ladrador ladrador = new Doberman();
        System.out.println(ladrador.ladrar());

        Ladrador ladrador1 = new Lobo();
        System.out.println(ladrador1.ladrar());
    }

}
