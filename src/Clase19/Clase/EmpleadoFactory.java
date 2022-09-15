package Clase19.Clase;

public class EmpleadoFactory {
    private static EmpleadoFactory instancia;

    public static EmpleadoFactory getInstance(){
        if (instancia == null){
            return instancia = new EmpleadoFactory();
        }
        return instancia;
    }
}
