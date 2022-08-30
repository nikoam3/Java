package Clase13.mesa;

public class main {
    public static void main(String[] args) {
        Tanque tanque = new Tanque(50);
        tanque.atacar();
        SistemaArmas senuelo = new Senuelo(15);
        senuelo.mostrar();
    }
}
