package Clase11.ejemploMesa;

public class main {
    public static void main(String[] args) {
        CajaAhorro ca = new CajaAhorro(6.0);
        ca.deposito(1000.0);
        ca.extraer(500.0);
        ca.cobroInteres();

        CuentaCorriente cc = new CuentaCorriente(1000.0);
        cc.deposito(100.0);
        cc.extraerCC(600.0);

        System.out.println(ca.getSaldo());
        System.out.println(cc.getSaldo());

    }
}
