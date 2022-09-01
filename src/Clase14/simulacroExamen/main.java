package Clase14.simulacroExamen;

public class main {
    public static void main(String[] args) {
        Yates yates1 = new Yates(20000.0, 2019, 2, new Capitan("Nico", "Amaya", 1234), 4);
        Yates yates2 = new Yates(30000.0, 2021, 2, new Capitan("Nico", "Amaya", 1234), 6);
        yates1.setValorAdicional(2000.0);
        yates2.setValorAdicional(2500.0);
        System.out.println(yates1.alquiler());
        System.out.println(yates2.alquiler());
        if (yates1.compareTo(yates2) > 0){
            System.out.println(yates1.toString() + " Es mas grande que " + yates2.toString() );
        } else if (yates1.compareTo(yates2) < 0) {
            System.out.println(yates2.toString() + " Es mas grande que " + yates1.toString() );
        } else {
            System.out.println("Ambos yates son iguales");
        }
    }
}
