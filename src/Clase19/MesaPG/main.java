package Clase19.MesaPG;

public class main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen("PRueba");
        ProductoFactory productoFactory = ProductoFactory.getInstance();
        almacen.agregarObjetos(productoFactory.crearProducto("CAJA10X10"));
        almacen.agregarObjetos(productoFactory.crearProducto("PELOTAFULTBOL"));
        almacen.agregarObjetos(productoFactory.crearProducto("PELOTATENIS"));
        System.out.println(almacen.calcularEspacioNecesario());
        System.out.println(almacen.toString());

    }
}
