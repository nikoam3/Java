public class C5_cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;
    private static String banco; //es una variabla de clase, es decir que esta variable es compartida por todos los atributos

    public static String getBanco(){
        return banco;
    }

    public static void setBanco(String banco){
        C5_cliente.banco = banco;//no se puede usar "this"
    }
    public C5_cliente(Integer numeroCliente, String nombre){
        this.numeroCliente=numeroCliente;
        this.nombre=nombre;
        deuda = 0.0;
    }
    public C5_cliente(){
        deuda=0.0; //se crea este constructor vacios para que sea mas escalable a otros frameworks
    }
    public void incrementarDeuda(Double valor){
        deuda+=valor;
    }
    public void pagarDeuda(){
        deuda=0.0;
    }
    public void pagarDeudaParcial(Double valor){
        if(valor<=deuda){
            deuda-= valor;
        }
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "C5_cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nombre='" + nombre + '\'' +
                ", deuda=" + deuda +
                '}';
    }
}
