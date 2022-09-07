package Clase16.ejercioPG;

public class Cuenta implements Comparable<Cuenta>{
    private int nroCuenta;
    private double saldo;

    public Cuenta(int nroCuenta , double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta=" + nroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
