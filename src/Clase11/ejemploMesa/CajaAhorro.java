package Clase11.ejemploMesa;

public class CajaAhorro extends Cuenta{
    private Double tasaInteres;

    public CajaAhorro(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public void cobroInteres(){
        double aux = getSaldo() * tasaInteres / 100;
        super.setSaldo(super.getSaldo() + aux);
    }
    @Override
    public void deposito(Double monto) {
        super.deposito(monto);
    }

    @Override
    public void extraer(Double monto) {
        super.extraer(monto);
    }

    @Override
    public String toString() {
        return "CajaAhorro{" +
                "tasaInteres=" + tasaInteres +
                '}' + "Saldo:" + super.getSaldo();
    }
}
