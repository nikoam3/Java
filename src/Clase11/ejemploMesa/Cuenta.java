package Clase11.ejemploMesa;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta() {
    }
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }

    public void deposito(Double monto) {
        this.saldo += monto;
    }

    public void extraer(Double monto){
        if (this.saldo >= monto){
            this.saldo -= monto;
        }
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
