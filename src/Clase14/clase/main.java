package Clase14.clase;

public class main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Nico", "Amaya", "23049");
        Examen examenParcial = new ExamenParcial("Parcial", "apache", alumno, 1);
        ExamenFinal examenFinal = new ExamenFinal("Final", "apache2", alumno, "ybue" );
        ExamenFinal examenFinal2 = new ExamenFinal("Final", "apache3", alumno, "ybue2" );
        examenFinal.setNota(5);
        examenFinal.setNotaOral(6);
        examenFinal2.setNota(8);
        examenFinal2.setNotaOral(9);

        if (examenFinal.compareTo(examenFinal2) > 0){
            System.out.println("Examen 1 mayor");
        } else if (examenFinal.compareTo(examenFinal2) < 0){
            System.out.println("Examen 2 mayor");
        } else {
            System.out.println("Examenes iguales");
        }
    }
}
