package Clase5;

public class C5 {
    public static void main(String[] args) {
        //clase 5
        //INSTANCIAS

        C5_cliente.setBanco("Digital Bank");

        C5_cliente primerCliente = new C5_cliente(111, "Pepito");
        C5_cliente segundoCliente = new C5_cliente(222, "Juan");
        C5_cliente tercerCliente = new C5_cliente();

        System.out.println(primerCliente);
        primerCliente.incrementarDeuda(100000.0);
        System.out.println(primerCliente.getNombre());
        System.out.println(C5_cliente.getBanco());

        C5_usuario primerJugador = new C5_usuario("Nico", "1234");
        System.out.println(primerJugador);

        primerJugador.aumentarPuntaje();
        System.out.println(primerJugador);

        primerJugador.bonus(5);
        System.out.println(primerJugador);

        primerJugador.subirNivel();
        System.out.println(primerJugador);
    }
}

