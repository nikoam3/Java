package Clase13.clase;

public class main {
    public static void main(String[] args) {
        CajaAhorro ca = new CajaAhorro(10.0);
        CajaAhorro ca1 = new CajaAhorro(10.0);
        ca.setSaldo(1000.0);
        ca1.setSaldo(2000.0);
        if (ca.compareTo(ca1) > 0){
            System.out.println("La caja " + ca + " tiene mas saldo que " + ca1);
        } else if (ca.compareTo(ca1) < 0) {
            System.out.println("La caja " + ca1 + " tiene mas saldo que " + ca);
        }else{
            System.out.println("La caja " + ca + " tiene el mismo saldo que " + ca1);
        }
    }
}
