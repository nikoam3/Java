package Clase10.ejemploPG;

public class main {
    public static void main(String[] args) {
        Vendedor nuevoVendedor = new Vendedor("Nicolas", "23049");
        nuevoVendedor.setSueldo(200000);
        nuevoVendedor.setDescuentos(50000);
        nuevoVendedor.setComision(3);
        nuevoVendedor.setImporteVentas(300000);
        System.out.println(nuevoVendedor.toString());

        Empleado empleado1 = new Empleado("Nicolas", "23049");
        Empleado empleado2 = new Empleado("Juan", "23050");
        Empleado empleado3 = new Empleado("Bruno", "23049");

        if (empleado1.equals(empleado2)){
            System.out.println(empleado1.toString() + " Es el mismo empleado que " + empleado2.toString());
        }else{
            System.out.println(empleado1.toString() + " No es el mismo empleado que " + empleado2.toString());
        }
        if (empleado2.equals(empleado3)){
            System.out.println(empleado2.toString() + " Es el mismo empleado que " + empleado3.toString());
        }else{
            System.out.println(empleado2.toString() + " No es el mismo empleado que " + empleado3.toString());
        }
        if (empleado1.equals(empleado3)){
            System.out.println(empleado1.toString() + " Es el mismo empleado que " + empleado3.toString());
        }else{
            System.out.println(empleado1.toString() + " No es el mismo empleado que " + empleado3.toString());
        }
    }
}
