package Clase11.ejemploClase;

import java.time.LocalDate;

public class ImpresoraCanon extends Impresora{
    public ImpresoraCanon(String modelo , String tipoConexion , LocalDate fechaFabricacion) {
        super(modelo , tipoConexion , fechaFabricacion);
    }

    @Override
    public String imprimir() {
        if (!necesitaTinta() && tienePapel()){
            return "Impresion de prueba Canon";
        }else{
            return "No hay recursos para imprimir";
        }
    }

    @Override
    public boolean necesitaTinta() {
        return getPorcentajeTinta()<=10;
    }
}
