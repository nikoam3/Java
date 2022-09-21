package Clase19.MesaPG;

import Clase19.Clase.EmpleadoFactory;

public class ProductoFactory {
    private static ProductoFactory instance = new ProductoFactory();
    private ProductoFactory(){}
    public static ProductoFactory getInstance() {
        if(instance == null)
            instance = new ProductoFactory();
        return instance;
    }

    public Producto crearProducto(String tipoObjeto) {
        switch (tipoObjeto) {
            case "CAJA10X10":
                return new Caja(10.0 , 10.0 , 10.0);
            case "PELOTAFULTBOL":
                return new Pelota(11.0);
            case "PELOTATENIS":
                return new Pelota(0.32);
        }
        return null;
    }
}

