package Clase19.Clase;

public class EmpleadoFactory {
    private static EmpleadoFactory instancia;
    public static final String EMPLEADO_RELACION_DEPENDENCIA="ERD";
    public static final String EMPLEADO_POR_HORA="EPH";

    /*atributo que almacena la única instancia que será creada*/
    public static EmpleadoFactory getInstancia()
    {
        if(instancia==null)
            instancia=new EmpleadoFactory();
        return instancia;
    }
    /*constructor privado, para que no se pueda instanciar desde fuera*/
    private EmpleadoFactory()
    {
    }
    public Empleado crearEmpleado(String codigo,String nombre, String apellido, Integer legajo)
    {
        switch (codigo)
        {
            case "ERD":
                return new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "EPH":
                return new EmpleadoContratado(nombre, apellido, legajo);
        }
        return null;
    }


    /*El propósito del patrón Factory es crear objetos, por lo que se
considera un patrón de creación.*/
}
