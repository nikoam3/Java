package ExamenParcial;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(LocalDate.parse("2021-01-05"), 100000.0, "Peñaloza 164", true, new Duenio("Agostina", "Comello", "27372258212"), 2, 100);
        Casa casa2 = new Casa(LocalDate.parse("2020-10-15"), 90000.0, "Cervantes 344", false, new Duenio("Nicolas", "Amaya", "20378974543"), 3, 120);
        Campo campo1 = new Campo(LocalDate.parse("2022-09-01"), 500000.0, "Ruta Privincial 6, km3", false, new Duenio("Bruno", "Amaya", "20405971238"), true, 15.0);
        Campo campo2 = new Campo(LocalDate.parse("2022-08-30"), 350000.0, "Ruta Privincial 6, km11", true, new Duenio("Aldana", "Amaya", "27389514632"), false, 9.0);


        if (casa1.compareTo(casa2) > 0){
            System.out.println("La casa con " + casa1.getCantAmbientes() + " ambientes es mas grande que la casa con " + casa2.getCantAmbientes() + " ambientes" );
        } else if (casa1.compareTo(casa2) < 0) {
            System.out.println("La casa con " + casa2.getCantAmbientes() + " ambientes es mas grande que la casa con " + casa1.getCantAmbientes() + " ambientes" );
        } else {
            System.out.println("Las casa tienen la misma cantidad de ambientes" );
        }
        if (casa1.venta()){
            System.out.println("La " + casa1.toString() + " NO se puede vender porque está hipotecada");
        } else {
            System.out.println("La " + casa1.toString() + " se puede vender");
        }
        if (casa2.venta()){
            System.out.println("La " + casa2.toString() + " NO se puede vender porque está hipotecada");
        } else {
            System.out.println("La " + casa2.toString() + " se puede vender");
        }


        if (campo1.aptoCultivo()){
            System.out.println("Este " + campo1.toString() + " se puede cultivar ya que tiene mas de 10 hectáreas");
        } else {
            System.out.println("Este " + campo1.toString() + " NO se puede cultivar ya que tiene menos de 10 hectáreas");
        }
        if (campo2.aptoCultivo()){
            System.out.println("Este " + campo2.toString() + " se puede cultivar ya que tiene mas de 10 hectáreas");
        } else {
            System.out.println("Este " + campo2.toString() + " NO se puede cultivar ya que tiene menos de 10 hectáreas");
        }
        if (campo1.venta()){
            System.out.println("El " + campo1.toString() + " NO se puede vender porque está hipotecado");
        } else {
            System.out.println("El " + campo1.toString() + " se puede vender");
        }
        if (campo2.venta()){
            System.out.println("El " + campo2.toString() + " NO se puede vender porque está hipotecado");
        } else {
            System.out.println("El " + campo2.toString() + " se puede vender");
        }
    }
}
