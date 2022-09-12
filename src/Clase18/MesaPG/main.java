package Clase18.MesaPG;

public class main {
    public static void main(String[] args) {
        Recorrido recorrido = new Recorrido("Buenos Aires", "Bragado");
        Reserva reserva = new Reserva(1,10, recorrido);

        System.out.println(reserva.precioReserva());
    }
}
