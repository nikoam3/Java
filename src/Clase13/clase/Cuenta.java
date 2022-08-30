package Clase13.clase;

public abstract class Cuenta implements Comparable<Object>{
    private double saldo;
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
    public int compareTo(Object o) {
        return (int) (this.saldo - ((Cuenta) o).getSaldo()); //necesitamos castear el objeto 'o' para que la funcion no de error, ya que compara dos clases iguales
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                '}';
    }
}
