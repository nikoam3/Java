package Clase13.clase;

public class CuentaCorriente extends Cuenta implements ImpuestoAgravable {
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
    public double gravar(double porcentaje) {
        double aux = super.getSaldo() * porcentaje / 100;
        super.setSaldo(getSaldo() - aux);
        return aux;
    }

    @Override
    public void deposito(Double monto) {
        super.deposito(monto);
    }
}
