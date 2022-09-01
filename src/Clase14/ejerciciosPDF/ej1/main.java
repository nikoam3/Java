package Clase14.ejerciciosPDF.ej1;

public class main {
    public static void main(String[] args) {
        TiempoIndeterminado empleado1 = new TiempoIndeterminado("Nicolas" , "Amaya" , 23049 , 1000.0);
        empleado1.setAntiguedad(6);
        empleado1.suplementoAntiguedad();

        empleado1.setCantidadHijos(2);
        empleado1.suplementoHijo();
        System.out.println(empleado1.toString());

        Comision empleado2 = new Comision("Bruno" , "Amaya" , 23050 , 900.0 , 5);
        empleado2.ventasRealizadas(100.0);
        empleado2.ventasRealizadas(150.0);
        empleado2.ventasRealizadas(50.0);
        empleado2.ventasRealizadas(200.0);

        empleado2.suplementoComision();
        System.out.println(empleado2.toString());

        PlazoFijo empleado3 = new PlazoFijo("Agostina" , "Comello" , 23051 , 800.0 , 6);
        System.out.println(empleado3.toString());
    }
}
