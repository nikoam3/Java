package Clase11.ejemploClase;

import java.time.LocalDate;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo , String tipoConexion , LocalDate fechaFabricacion) {
        super(modelo , tipoConexion , fechaFabricacion);
    }

    @Override
    public String imprimir() {
        if (!necesitaTinta() && tienePapel()){
            return "Impresion de prueba Epson";
        }else{
            return "No hay recursos para imprimir";
        }
    }
}
