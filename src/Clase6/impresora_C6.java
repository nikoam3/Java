package Clase6;

public class impresora_C6 {
    private String tipoConexion;
    private String modelo;
    private int cantidadHojas;
    private String fechaFabricacion;
    private boolean conectada;

    public impresora_C6(String fechaFabricacion , String tipoConexion , String modelo){
        this.fechaFabricacion=fechaFabricacion;
        this.tipoConexion=tipoConexion;
        this.modelo=modelo;
        cantidadHojas=0;
        conectada=false;
    }
    public impresora_C6(){}

    public boolean hayHojas(int cantidad){
        return cantidadHojas>=cantidad;
    }

    public void agregarHojas(int cantidad){
        cantidadHojas+=cantidad;
    }

    public boolean getConectada(){
        return conectada;
    }

    public void conectar(){
        conectada=true;
    }

    public void imprimir(String texto, int cantidad){
        if (getConectada() && hayHojas(cantidad)){
            cantidadHojas -= cantidad;
            System.out.println(texto);
        }
    }

    @Override
    public String toString() {
        return "Clase6.impresora_C6{" +
                "tipoConexion='" + tipoConexion + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantidadHojas=" + cantidadHojas +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", conectada=" + conectada +
                '}';
    }
}
