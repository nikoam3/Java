package Clase19.Clase;

public class main {
    public static void main(String[] args) {
        Empresa empresa=new Empresa("DH");
        EmpleadoFactory empleadoFactory= EmpleadoFactory.getInstancia();
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.EMPLEADO_POR_HORA, "Juan", "Perez", 111));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.EMPLEADO_RELACION_DEPENDENCIA, "Maria", "Gomez", 222));
        Empleado empleado=empleadoFactory.crearEmpleado("ERD","Juan", "Perez", 111);
    }

}
