package Clase11.ejemploMesa;

public class CuentaCorriente extends Cuenta{
    private double descubierto;
    public CuentaCorriente(double descubierto){
        this.descubierto=descubierto;
    }

    public void extraerCC(Double monto) {
        if (this.descubierto + getSaldo() > monto){
            super.setSaldo(super.getSaldo() - monto);
        }
    }

    @Override
    public void deposito(Double monto) {
        super.deposito(monto);
    }
}
