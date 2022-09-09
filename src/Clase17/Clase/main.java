package Clase17.Clase;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nico", "Amaya", "37897454", 1000.0);
        try {
            cliente.comprar(10000.0);
        }catch (ClienteException e){
            System.err.println(e.toString());
        }

        try {
            cliente.saldarDeuda(150.0);
        }catch (ClienteException e){
            System.err.println(e.toString());
        }
    }
}
