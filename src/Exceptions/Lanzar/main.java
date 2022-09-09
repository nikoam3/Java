package Exceptions.Lanzar;

public class main {
    public static void main(String[] args) {
        try {
            Fecha2 fecha = new Fecha2(-2 , 3 , 2022);
        }
        catch (Exception e) {
            System.err.println("Valores no validos");
        }

        //PARA LA CLASE FECHA1

        Fecha1 fechaa = new Fecha1(5,-3,-5000);

    }

}
