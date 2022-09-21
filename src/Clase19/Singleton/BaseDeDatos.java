package Clase19.Singleton;

public class BaseDeDatos {
    private static BaseDeDatos instance = new BaseDeDatos() ;

    private BaseDeDatos(){};

    public static BaseDeDatos getInstance(){
        return instance;
    }

    /* El patrón Singleton se usa cuando
    necesita un solo punto para crear una
    instancia de clase y cuando solo
    necesita una instancia de una clase.
    Por ej: una clase que no necesita tener más de
    una instancia es la clase que se usa para la conexión a
    la base de datos.*/
}
