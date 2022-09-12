package Clase18.MesaPG;

public class Reserva {
    private int codigo;
    private int cantPersonas;
    private Recorrido recorrido;


    public Reserva(int codigo , int cantPersonas , Recorrido recorrido) {
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.recorrido = recorrido;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public double precioReserva() {
        if (recorrido.tipoRecorrido())
            return (getCantPersonas() * 50.0) * 0.8;
        return getCantPersonas() * 50.0;
    }
}
