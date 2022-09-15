package Clase20.Clase;

public class main {
    public static void main(String[] args) {
        Producto p1 = new ComidaRapida("Hamburguesa", 1500.0);
        Producto p2 = new ComidaRapida("Gaseosa", 500.0);
        Producto p3 = new ComidaRapida("Papas Fritas", 500.0);

        Combo c1 = new Combo("Cajita Feliz", 10.0);
        c1.agregar(p1);
        c1.agregar(p2);
        c1.agregar(p3);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(c1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p1);

        System.out.println(carrito.mostrarCarrito());
    }
}
