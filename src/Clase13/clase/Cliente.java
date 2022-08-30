package Clase13.clase;

public class Cliente {
    private String numCliente;
    private String apellido;
    private Integer dni;
    private String cuit;

    public Cliente(String numCliente , String apellido , Integer dni , String cuit) {
        this.numCliente = numCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numCliente='" + numCliente + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}
