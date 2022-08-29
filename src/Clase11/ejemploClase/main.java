package Clase11.ejemploClase;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        //polimorfismo
        Impresora poliImpresora = new ImpresoraEpson("Epson", "WIFI", LocalDate.parse("2022-08-01"));
        System.out.println(poliImpresora.getClass());
        poliImpresora.cargarTinta();
        poliImpresora.cargarPapel(20);
        System.out.println(poliImpresora.imprimir());

        ImpresoraEpson impresora = new ImpresoraEpson("Epson", "USB", LocalDate.parse("2022-01-01"));
        ImpresoraCanon impresora1 = new ImpresoraCanon("Canon", "USB", LocalDate.parse("2021-10-15"));
        impresora.cargarTinta();
        impresora.cargarPapel(5);
        impresora1.cargarTinta();
        impresora1.cargarPapel(10);
        System.out.println(impresora.imprimir());
        System.out.println(impresora1.imprimir());
        System.out.println(impresora.getPorcentajeTinta());
    }
}
